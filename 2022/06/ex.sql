SELECT INV.JO_CRR_CD,
  INV.RLANE_CD,
  INV.LOCL_CURR_CD,
  INV.INV_NO,
  INV.CSR_NO,
  INV.APRO_FLG,
  INV.CUST_VNDR_CNT_CD,
  INV.CUST_VNDR_SEQ,
  INV.PRNR_REF_NO,
  INV.CUST_VNDR_ENG_NM,
  SUM(INV.REV_ACT_AMT) AS INV_REV_ACT_AMT,
  SUM(INV.EXP_ACT_AMT) AS INV_EXP_ACT_AMT
FROM (
    SELECT INV.JO_CRR_CD,
      STL.RLANE_CD,
      NVL(INV.INV_CURR_CD, INV.LOCL_CURR_CD) AS LOCL_CURR_CD,
      DTL.ACT_AMT,
      INV.INV_NO,
      NVL(
        INV.SLP_TP_CD || INV.SLP_FUNC_CD || INV.SLP_OFC_CD || INV.SLP_ISS_DT || INV.SLP_SER_NO,
        'N/A'
      ) AS CSR_NO,
      NVL(CSR.APRO_FLG, 'N') AS APRO_FLG,
      DECODE(
        INV.RE_DIVR_CD,
        'R',
        SUBSTR(INV.PRNR_REF_NO, 1, 2),
        NULL
      ) AS CUST_VNDR_CNT_CD,
      DECODE(
        INV.RE_DIVR_CD,
        'R',
        SUBSTR(INV.PRNR_REF_NO, 3),
        INV.PRNR_REF_NO
      ) AS CUST_VNDR_SEQ,
      INV.PRNR_REF_NO,
      DECODE(
        'R',
        STL.RE_DIVR_CD,
        NVL(DTL.LOCL_AMT, DTL.ACT_AMT),
        0
      ) AS REV_ACT_AMT,
      DECODE(
        'E',
        STL.RE_DIVR_CD,
        NVL(DTL.LOCL_AMT, DTL.ACT_AMT),
        0
      ) AS EXP_ACT_AMT,
      CASE
        WHEN INV.RE_DIVR_CD = 'R' THEN (
          SELECT M.CUST_LGL_ENG_NM
          FROM MDM_CUSTOMER M
          WHERE M.DELT_FLG = 'N'
            AND M.CUST_CNT_CD = SUBSTR(INV.PRNR_REF_NO, 1, 2)
            AND M.CUST_SEQ = SUBSTR(INV.PRNR_REF_NO, 3)
        )
        ELSE (
          SELECT M.VNDR_LGL_ENG_NM
          FROM MDM_VENDOR M
          WHERE M.DELT_FLG = 'N'
            AND M.VNDR_SEQ = INV.PRNR_REF_NO
        )
      END AS CUST_VNDR_ENG_NM
    FROM JOO_INVOICE INV,
      JOO_INV_DTL DTL,
      JOO_STL_TGT STL,
      JOO_CSR CSR
    WHERE 1 = 1
      AND NVL(STL.THEA_STL_FLG, 'N') = 'N'
      AND INV.ACCT_YRMON BETWEEN REPLACE(@[acct_yrmon_fr], '-', '')
      AND REPLACE(@[acct_yrmon_to], '-', '') #if (${jo_crr_cd}!=''  && ${jo_crr_cd} != 'ALL')
      AND INV.JO_CRR_CD IN (
        #foreach($key IN ${obj_list_no}) #if($velocityCount < $obj_list_no.size()) '$key', #else '$key' #end #end)
        #end
        #if (${rlane_cd}!='')
        AND STL.RLANE_CD = @[rlane_cd] #end
        #if (${trd_cd}!='')
        AND EXISTS (
          SELECT 'X'
          FROM JOO_CARRIER CRR
          WHERE 1 = 1
            AND CRR.DELT_FLG = 'N'
            AND CRR.JO_CRR_CD = STL.JO_CRR_CD
            AND CRR.RLANE_CD = STL.RLANE_CD
            AND CRR.TRD_CD = @[trd_cd]
        ) #end
        AND INV.RJCT_CMB_FLG = 'N'
        AND DTL.ACCT_YRMON = INV.ACCT_YRMON
        AND DTL.JO_CRR_CD = INV.JO_CRR_CD
        AND DTL.INV_NO = INV.INV_NO
        AND DTL.RE_DIVR_CD = INV.RE_DIVR_CD
        AND STL.THEA_STL_FLG = INV.THEA_STL_FLG
        AND STL.VSL_CD = DTL.VSL_CD
        AND STL.SKD_VOY_NO = DTL.SKD_VOY_NO
        AND STL.SKD_DIR_CD = DTL.SKD_DIR_CD
        AND STL.REV_DIR_CD = DTL.REV_DIR_CD
        AND STL.REV_YRMON = DTL.REV_YRMON
        AND STL.STL_VVD_SEQ = DTL.STL_VVD_SEQ
        AND INV.SLP_TP_CD = CSR.SLP_TP_CD(+)
        AND INV.SLP_FUNC_CD = CSR.SLP_FUNC_CD(+)
        AND INV.SLP_OFC_CD = CSR.SLP_OFC_CD(+)
        AND INV.SLP_ISS_DT = CSR.SLP_ISS_DT(+)
        AND INV.SLP_SER_NO = CSR.SLP_SER_NO(+)
      ) INV
    WHERE 1 = 1
    GROUP BY GROUPING SETS (
        (
          JO_CRR_CD,
          RLANE_CD,
          CSR_NO,
          APRO_FLG,
          CUST_VNDR_CNT_CD,
          CUST_VNDR_SEQ,
          PRNR_REF_NO,
          CUST_VNDR_ENG_NM,
          LOCL_CURR_CD,
          INV_NO
        ),
        (LOCL_CURR_CD, INV_NO),
        (LOCL_CURR_CD)
      )
    ORDER BY INV_NO,
      JO_CRR_CD