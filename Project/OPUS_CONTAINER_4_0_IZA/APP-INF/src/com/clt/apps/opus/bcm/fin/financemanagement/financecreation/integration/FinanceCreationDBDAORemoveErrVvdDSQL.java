/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : FinanceCreationDBDAORemoveErrVvdDSQL.java
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

public class FinanceCreationDBDAORemoveErrVvdDSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Remove GL_CTR_ERP
	  * </pre>
	  */
	public FinanceCreationDBDAORemoveErrVvdDSQL(){
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

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAORemoveErrVvdDSQL").append("\n"); 
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
		query.append("DELETE FROM GL_ERR_VVD" ).append("\n"); 
		query.append(" WHERE ERR_VSL_CD     = SUBSTR(@[err_vvd],1,4)" ).append("\n"); 
		query.append("   AND ERR_SKD_VOY_NO = SUBSTR(@[err_vvd],5,4)" ).append("\n"); 
		query.append("   AND ERR_SKD_DIR_CD = SUBSTR(@[err_vvd],9,1)" ).append("\n"); 
		query.append("   AND ERR_REV_DIR_CD = SUBSTR(@[err_vvd],10,1)" ).append("\n"); 

	}
}