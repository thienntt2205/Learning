/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : NoticeMailDAOGetBccReceiverEmailRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.10
*@LastModifier : 
*@LastVersion : 1.0
* 2016.03.10 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.mail.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class NoticeMailDAOGetBccReceiverEmailRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * This SQL gets a list of mails of all Bcc Receivers
	  * </pre>
	  */
	public NoticeMailDAOGetBccReceiverEmailRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.mail.integration").append("\n"); 
		query.append("FileName : NoticeMailDAOGetBccReceiverEmailRSQL").append("\n"); 
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
		query.append("select usr_eml from com_user where use_flg = 'Y'" ).append("\n"); 

	}
}