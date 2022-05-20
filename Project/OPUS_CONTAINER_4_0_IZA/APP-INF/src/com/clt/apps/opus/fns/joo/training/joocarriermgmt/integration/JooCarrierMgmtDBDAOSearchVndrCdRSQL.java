/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : JooCarrierMgmtDBDAOSearchVndrCdRSQL.java
*@FileTitle : Joo Carrier Management
*Open Issues :
*Change history :
*@LastModifyDate : 2019.04.03
*@LastModifier : Tu.Nguyen
*@LastVersion : 1.0
* 2019.04.03 Tu.Nguyen
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.fns.joo.training.joocarriermgmt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Tu.Nguyen
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class JooCarrierMgmtDBDAOSearchVndrCdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * search vendor code
	  * </pre>
	  */
	public JooCarrierMgmtDBDAOSearchVndrCdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.fns.joo.training.joocarriermgmt.integration").append("\n"); 
		query.append("FileName : JooCarrierMgmtDBDAOSearchVndrCdRSQL").append("\n"); 
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
		query.append("SELECT VNDR_SEQ" ).append("\n"); 
		query.append("FROM MDM_VENDOR A" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("AND A.VNDR_SEQ = @[vndr_seq]" ).append("\n"); 

	}
}