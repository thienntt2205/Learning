/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ProgramMappingDAOComProgramRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.16
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.03.16 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.role.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author kyungbum kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ProgramMappingDAOComProgramRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * role에 할당된 프로그램들이나 전체 프로그램 리스트를 조회한다.
	  * </pre>
	  */
	public ProgramMappingDAOComProgramRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("role_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no_form",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.role.integration").append("\n"); 
		query.append("FileName : ProgramMappingDAOComProgramRSQL").append("\n"); 
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
		query.append("#if(${pgm_no_form} != '')" ).append("\n"); 
		query.append("		  SELECT DECODE(Y.PGM_NO,NULL,'0','1') check_val,                   " ).append("\n"); 
		query.append("			 		 X.pgm_no,                                                 " ).append("\n"); 
		query.append("			 		 X.pgm_nm                                                 " ).append("\n"); 
		query.append("			  FROM                                                             " ).append("\n"); 
		query.append("			  		(SELECT distinct A.*                                                " ).append("\n"); 
		query.append("			  		FROM COM_PROGRAM A,                                        " ).append("\n"); 
		query.append("			  			(SELECT *                                              " ).append("\n"); 
		query.append("			  			 FROM COM_MNU_CFG         " ).append("\n"); 
		query.append("						 WHERE MNU_CFG_CD='002'                             " ).append("\n"); 
		query.append("			  			 CONNECT BY PRIOR chd_pgm_no = prnt_pgm_no             " ).append("\n"); 
		query.append("			  			 START WITH PRNT_PGM_NO = @[pgm_no_form] AND MNU_CFG_CD='002' ) B -- 'ENIS-001-032'       " ).append("\n"); 
		query.append("			  		WHERE A.PGM_NO = B.CHD_PGM_NO  AND A.PGM_MNU_DIV_CD='02'                            " ).append("\n"); 
		query.append("					AND A.PGM_TP_CD = '00'" ).append("\n"); 
		query.append("					AND A.POPUP_FLG = 'N'" ).append("\n"); 
		query.append("			  		) X,                            " ).append("\n"); 
		query.append("			        com_pgm_role Y                                             " ).append("\n"); 
		query.append("			  WHERE X.PGM_NO = Y.PGM_NO(+)                                     " ).append("\n"); 
		query.append("			  AND Y.USR_ROLE_CD(+) = @[role_cd]" ).append("\n"); 
		query.append("			  ORDER BY X.PGM_NO                                                " ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("		SELECT DECODE(Y.PGM_NO,NULL,'0','1') check_val,                   " ).append("\n"); 
		query.append("			 		 X.pgm_no,                                                 " ).append("\n"); 
		query.append("			 		 X.pgm_nm" ).append("\n"); 
		query.append("			  FROM                                                             " ).append("\n"); 
		query.append("			  		COM_PROGRAM  X,                                            " ).append("\n"); 
		query.append("			        com_pgm_role Y                                             " ).append("\n"); 
		query.append("			  WHERE X.PGM_NO = Y.PGM_NO(+)    AND X.PGM_MNU_DIV_CD='02'                                   " ).append("\n"); 
		query.append("				AND X.PGM_TP_CD = '00'" ).append("\n"); 
		query.append("				AND X.POPUP_FLG = 'N'" ).append("\n"); 
		query.append("			  AND Y.USR_ROLE_CD(+) = @[role_cd]" ).append("\n"); 
		query.append("			  ORDER BY X.PGM_NO                                               " ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}