/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : VesselDBDAOSearchVesselLIstRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.05.02
*@LastModifier : 
*@LastVersion : 1.0
* 2012.05.02 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vessel.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class VesselDBDAOSearchVesselLIstRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * vessel list select
	  * </pre>
	  */
	public VesselDBDAOSearchVesselLIstRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vsl_eng_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("lloyd_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("fdr_div_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("startpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("call_sgn_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("crr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vsl_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.vessel.integration").append("\n"); 
		query.append("FileName : VesselDBDAOSearchVesselLIstRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
	
	public String getSQL(){
		return query.toString();
	}
	
	public HashMap<String,String[]> getParams() {
		return params;
	}

	/**
	 * Query 생성
	 */
	public void setQuery(){
		query.append("SELECT 	VSL_CD, " ).append("\n"); 
		query.append("		VSL_ENG_NM," ).append("\n"); 
		query.append("		CRR_CD," ).append("\n"); 
		query.append("    	VSL_NRT," ).append("\n"); 
		query.append("		RGST_PORT_CD," ).append("\n"); 
		query.append("		CALL_SGN_NO," ).append("\n"); 
		query.append("		LLOYD_NO," ).append("\n"); 
		query.append("		VSL_LNCH_DT," ).append("\n"); 
		query.append("		(CASE " ).append("\n"); 
		query.append("			WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("			ELSE 'Active' " ).append("\n"); 
		query.append("		END) AS delt_flg," ).append("\n"); 
		query.append("		FDR_DIV_CD," ).append("\n"); 
		query.append("		INTG_CD_VAL_DP_DESC" ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("	SELECT 	ROW_NUMBER() OVER (ORDER BY VSL_CD ASC) NO," ).append("\n"); 
		query.append("			mdmVsl.VSL_CD," ).append("\n"); 
		query.append("			mdmVsl.VSL_ENG_NM," ).append("\n"); 
		query.append("			mdmVsl.CRR_CD," ).append("\n"); 
		query.append("			mdmVsl.NET_RGST_TONG_WGT VSL_NRT," ).append("\n"); 
		query.append("			mdmVsl.RGST_PORT_CD," ).append("\n"); 
		query.append("			mdmVsl.CALL_SGN_NO," ).append("\n"); 
		query.append("			mdmVsl.LLOYD_NO," ).append("\n"); 
		query.append("			decode(" ).append("\n"); 
		query.append("			 ROUND((SYSDATE - mdmVsl.VSL_LNCH_DT)/ 365),'','Unknown',ROUND((SYSDATE - mdmVsl.VSL_LNCH_DT)/ 365)" ).append("\n"); 
		query.append("			)	VSL_LNCH_DT," ).append("\n"); 
		query.append("			mdmVsl.DELT_FLG," ).append("\n"); 
		query.append("			mdmVsl.FDR_DIV_CD," ).append("\n"); 
		query.append("			comIntg.INTG_CD_VAL_DP_DESC" ).append("\n"); 
		query.append("FROM MDM_VSL_CNTR mdmVsl LEFT OUTER JOIN ( select INTG_CD_VAL_CTNT, INTG_CD_VAL_DP_DESC from com_intg_cd_dtl where INTG_CD_ID = 'CD00653') comIntg ON mdmVsl.FDR_DIV_CD = comIntg.INTG_CD_VAL_CTNT" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${vsl_cd} != '')" ).append("\n"); 
		query.append("           	AND mdmVsl.VSL_CD LIKE @[vsl_cd] || '%'" ).append("\n"); 
		query.append("#end    " ).append("\n"); 
		query.append("#if (${vsl_eng_nm} != '')" ).append("\n"); 
		query.append("           	AND upper(mdmVsl.VSL_ENG_NM) LIKE '%'|| upper(@[vsl_eng_nm])||'%'" ).append("\n"); 
		query.append("#end    " ).append("\n"); 
		query.append("#if (${crr_cd} != '')" ).append("\n"); 
		query.append("           	AND mdmVsl.CRR_CD LIKE @[crr_cd] || '%'" ).append("\n"); 
		query.append("#end	" ).append("\n"); 
		query.append("#if (${call_sgn_no} != '')" ).append("\n"); 
		query.append("			AND mdmVsl.call_sgn_no LIKE @[call_sgn_no] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${lloyd_no} != '')" ).append("\n"); 
		query.append("			AND mdmVsl.lloyd_no LIKE @[lloyd_no] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("	#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		AND mdmVsl.DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("	#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("	#else " ).append("\n"); 
		query.append("		AND mdmVsl.DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#else	" ).append("\n"); 
		query.append("	AND mdmVsl.DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${fdr_div_cd} != '')" ).append("\n"); 
		query.append("	AND mdmVsl.FDR_DIV_CD = @[fdr_div_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(") A" ).append("\n"); 
		query.append("WHERE NO BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 
		query.append("ORDER BY VSL_CD" ).append("\n"); 

	}
}