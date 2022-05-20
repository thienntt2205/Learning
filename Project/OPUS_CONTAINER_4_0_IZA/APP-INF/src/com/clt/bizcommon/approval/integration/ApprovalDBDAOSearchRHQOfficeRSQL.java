/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ApprovalDBDAOSearchRHQOfficeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.10.18
*@LastModifier : 
*@LastVersion : 1.0
* 2017.10.18 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOSearchRHQOfficeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ApprovalDBDAOSearchRHQOfficeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOSearchRHQOfficeRSQL").append("\n"); 
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
		query.append("SELECT AR_HD_QTR_OFC_CD AS RHQ_OFC_CD, OFC_TP_CD" ).append("\n"); 
		query.append("  FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append(" WHERE OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("   AND NVL(DELT_FLG, 'N') = 'N' " ).append("\n"); 

	}
}