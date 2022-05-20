/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : CodeManagementDBDAOsearchMaxIntgCdIdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.02.13
*@LastModifier : 
*@LastVersion : 1.0
* 2014.02.13 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.codemanagement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CodeManagementDBDAOsearchMaxIntgCdIdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * CodeManagementDBDAOsearchMaxIntgCdId
	  * </pre>
	  */
	public CodeManagementDBDAOsearchMaxIntgCdIdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.codemanagement.integration").append("\n"); 
		query.append("FileName : CodeManagementDBDAOsearchMaxIntgCdIdRSQL").append("\n"); 
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
		query.append("SELECT 'CD'||COM_INTG_CD_ID_SEQ.NEXTVAL MAX_INTG_CD_ID" ).append("\n"); 
		query.append("FROM DUAL" ).append("\n"); 

	}
}