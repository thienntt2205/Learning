/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupCreationDBDAORemoveTradePartnerSubLinkDSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.28
*@LastModifier : 
*@LastVersion : 1.0
* 2011.02.28 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SetupCreationDBDAORemoveTradePartnerSubLinkDSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.03.07 정윤태 EDI TRADE PARTNER SUB LINK 정보를 삭제한다
	  * </pre>
	  */
	public SetupCreationDBDAORemoveTradePartnerSubLinkDSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("trd_prnr_sub_lnk_seq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration ").append("\n"); 
		query.append("FileName : SetupCreationDBDAORemoveTradePartnerSubLinkDSQL").append("\n"); 
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
		query.append("DELETE FROM BKG_EDI_TRD_PRNR_SUB_LNK" ).append("\n"); 
		query.append(" WHERE TRD_PRNR_SUB_LNK_SEQ = @[trd_prnr_sub_lnk_seq]" ).append("\n"); 

	}
}