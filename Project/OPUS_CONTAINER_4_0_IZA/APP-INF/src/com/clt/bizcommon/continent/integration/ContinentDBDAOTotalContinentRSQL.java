/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : ContinentDBDAOTotalContinentRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.24
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.24 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.continent.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ContinentDBDAOTotalContinentRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Continent의 총 카운트를 조회한다.
	  * </pre>
	  */
	public ContinentDBDAOTotalContinentRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("conti_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("conti_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.continent.integration").append("\n"); 
		query.append("FileName : ContinentDBDAOTotalContinentRSQL").append("\n"); 
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
		query.append("SELECT COUNT(*)" ).append("\n"); 
		query.append("FROM mdm_continent" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${conti_cd} != '') " ).append("\n"); 
		query.append("	AND conti_cd = @[conti_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${conti_nm} != '') " ).append("\n"); 
		query.append("	AND upper(conti_nm) like '%' || upper(@[conti_nm]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("	#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("	#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("	#else " ).append("\n"); 
		query.append("		AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#else	" ).append("\n"); 
		query.append("	AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}