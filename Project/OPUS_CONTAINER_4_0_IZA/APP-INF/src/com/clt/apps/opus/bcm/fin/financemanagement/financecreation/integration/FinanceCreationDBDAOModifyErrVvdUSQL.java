/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : FinanceCreationDBDAOModifyErrVvdUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.05.10
*@LastModifier : 장영석
*@LastVersion : 1.0
* 2012.05.10 장영석
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author jang-yeong-seok
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FinanceCreationDBDAOModifyErrVvdUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * UPDATE GL_ERR_VVD
	  * </pre>
	  */
	public FinanceCreationDBDAOModifyErrVvdUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("err_vvd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("aval_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("corr_vvd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOModifyErrVvdUSQL").append("\n"); 
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
		query.append("UPDATE GL_ERR_VVD" ).append("\n"); 
		query.append("   SET ERR_VSL_CD        = SUBSTR(@[err_vvd],1,4)," ).append("\n"); 
		query.append("       ERR_SKD_VOY_NO    = SUBSTR(@[err_vvd],5,4)," ).append("\n"); 
		query.append("       ERR_SKD_DIR_CD    = SUBSTR(@[err_vvd],9,1)," ).append("\n"); 
		query.append("       ERR_REV_DIR_CD    = SUBSTR(@[err_vvd],10,1)," ).append("\n"); 
		query.append("       CORR_VSL_CD       = SUBSTR(@[corr_vvd],1,4)," ).append("\n"); 
		query.append("       CORR_SKD_VOY_NO   = SUBSTR(@[corr_vvd],5,4)," ).append("\n"); 
		query.append("	   CORR_SKD_DIR_CD	 = SUBSTR(@[corr_vvd],9,1)," ).append("\n"); 
		query.append("	   CORR_REV_DIR_CD   = SUBSTR(@[corr_vvd],10,1)," ).append("\n"); 
		query.append("	   AVAL_FLG          = @[aval_flg]," ).append("\n"); 
		query.append("       UPD_DT            = SYSDATE" ).append("\n"); 
		query.append(" WHERE " ).append("\n"); 
		query.append("    1=1" ).append("\n"); 
		query.append("   AND ERR_VSL_CD     = SUBSTR(@[err_vvd],1,4)" ).append("\n"); 
		query.append("   AND ERR_SKD_VOY_NO = SUBSTR(@[err_vvd],5,4)" ).append("\n"); 
		query.append("   AND ERR_SKD_DIR_CD = SUBSTR(@[err_vvd],9,1)" ).append("\n"); 
		query.append("   AND ERR_REV_DIR_CD = SUBSTR(@[err_vvd],10,1)" ).append("\n"); 

	}
}