/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : SetupCreationDBDAOSearchCargoStatusForUSReleaseListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.02
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2016.03.02 김성욱
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Sung-Wook Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SetupCreationDBDAOSearchCargoStatusForUSReleaseListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Cargo Tracking Info.(Non physical event for US cargo release) 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchCargoStatusForUSReleaseListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_org_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchCargoStatusForUSReleaseListRSQL").append("\n"); 
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
		query.append("SELECT   EDI_ORG_STS_CD" ).append("\n"); 
		query.append("		,EDI_PRE_SNT_STS_CD" ).append("\n"); 
		query.append("		,EDI_EVNT_STS_CD" ).append("\n"); 
		query.append("		,EDI_RMK1" ).append("\n"); 
		query.append("		,EDI_RMK2" ).append("\n"); 
		query.append("		,CRE_USR_ID" ).append("\n"); 
		query.append("		,CRE_DT" ).append("\n"); 
		query.append("		,UPD_USR_ID" ).append("\n"); 
		query.append("		,UPD_DT" ).append("\n"); 
		query.append("		,COP_IB_RAIL_CHK_CD" ).append("\n"); 
		query.append("		,EDW_UPD_DT" ).append("\n"); 
		query.append("  FROM SCE_EDI_MNG_AMS_STS" ).append("\n"); 
		query.append(" WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${edi_org_sts_cd} != '')" ).append("\n"); 
		query.append("   AND EDI_ORG_STS_CD = @[edi_org_sts_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(" ORDER BY EDI_ORG_STS_CD, EDI_PRE_SNT_STS_CD, EDI_EVNT_STS_CD" ).append("\n"); 

	}
}