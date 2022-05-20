/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : UserMappingDAOComUsrRoleMtchHisCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.02
*@LastModifier : 
*@LastVersion : 1.0
* 2016.06.02 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.role.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserMappingDAOComUsrRoleMtchHisCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * DESC Enter..
	  * </pre>
	  */
	public UserMappingDAOComUsrRoleMtchHisCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_role_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cre_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.role.integration ").append("\n"); 
		query.append("FileName : UserMappingDAOComUsrRoleMtchHisCSQL").append("\n"); 
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
		query.append("INSERT INTO COM_USR_ROLE_MTCH_HIS" ).append("\n"); 
		query.append("(   USR_ID," ).append("\n"); 
		query.append("    USR_ROLE_CD," ).append("\n"); 
		query.append("    USR_ROLE_HIS_SEQ," ).append("\n"); 
		query.append("    EFF_DT," ).append("\n"); 
		query.append("    EXP_DT," ).append("\n"); 
		query.append("    CRE_USR_ID," ).append("\n"); 
		query.append("    CRE_DT," ).append("\n"); 
		query.append("    UPD_USR_ID," ).append("\n"); 
		query.append("    UPD_DT" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("VALUES" ).append("\n"); 
		query.append("(   @[usr_id]," ).append("\n"); 
		query.append("	@[usr_role_cd]," ).append("\n"); 
		query.append("    (SELECT NVL(MAX(USR_ROLE_HIS_SEQ), 0)+1" ).append("\n"); 
		query.append("       FROM COM_USR_ROLE_MTCH_HIS" ).append("\n"); 
		query.append("      WHERE USR_ID = @[usr_id]" ).append("\n"); 
		query.append("        AND USR_ROLE_CD = @[usr_role_cd])," ).append("\n"); 
		query.append("    SYSDATE," ).append("\n"); 
		query.append("    TO_DATE('9999-12-31', 'YYYY-MM-DD')," ).append("\n"); 
		query.append("    @[cre_usr_id]," ).append("\n"); 
		query.append("	SYSDATE," ).append("\n"); 
		query.append("	@[cre_usr_id]," ).append("\n"); 
		query.append("	SYSDATE" ).append("\n"); 
		query.append(")" ).append("\n"); 

	}
}