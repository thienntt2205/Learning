/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : CopyAuthorityDAOSuperUserRoleDSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.04.14
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.04.14 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.copyauthority.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author kyungbum kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CopyAuthorityDAOSuperUserRoleDSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * delete super user role
	  * </pre>
	  */
	public CopyAuthorityDAOSuperUserRoleDSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("to_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.copyauthority.integration ").append("\n"); 
		query.append("FileName : CopyAuthorityDAOSuperUserRoleDSQL").append("\n"); 
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
		query.append("delete from com_usr_role_adm_mtch where usr_id = @[to_usr_id]" ).append("\n"); 

	}
}