/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : CodeManagementDBDAOmodifyCodeMgmtDtlUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2013.11.14
*@LastModifier : 
*@LastVersion : 1.0
* 2013.11.14 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.codemanagement.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CodeManagementDBDAOmodifyCodeMgmtDtlUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * CodeManagementDBDAOmodifyCodeMgmtDtlUSQL
	  * </pre>
	  */
	public CodeManagementDBDAOmodifyCodeMgmtDtlUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("intg_cd_val_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("upd_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("intg_cd_val_ctnt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("intg_cd_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("intg_cd_val_dp_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("intg_cd_val_dp_seq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.codemanagement.integration ").append("\n"); 
		query.append("FileName : CodeManagementDBDAOmodifyCodeMgmtDtlUSQL").append("\n"); 
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
		query.append("UPDATE COM_INTG_CD_DTL" ).append("\n"); 
		query.append("   SET INTG_CD_VAL_DP_DESC  = @[intg_cd_val_dp_desc]" ).append("\n"); 
		query.append("      ,INTG_CD_VAL_DESC    	= @[intg_cd_val_desc]" ).append("\n"); 
		query.append("      ,INTG_CD_VAL_DP_SEQ   = @[intg_cd_val_dp_seq]" ).append("\n"); 
		query.append("      ,UPD_USR_ID   		= @[upd_usr_id]" ).append("\n"); 
		query.append("      ,UPD_DT       		= SYSDATE" ).append("\n"); 
		query.append(" WHERE INTG_CD_ID = @[intg_cd_id]" ).append("\n"); 
		query.append("	AND INTG_CD_VAL_CTNT = @[intg_cd_val_ctnt]" ).append("\n"); 

	}
}