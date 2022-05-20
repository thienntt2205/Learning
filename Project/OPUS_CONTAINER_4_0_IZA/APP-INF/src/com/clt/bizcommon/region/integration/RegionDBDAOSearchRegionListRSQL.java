/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : RegionDBDAOSearchRegionListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.03.15
*@LastModifier : 
*@LastVersion : 1.0
* 2012.03.15 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.region.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class RegionDBDAOSearchRegionListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * DESC Enter..
	  * </pre>
	  */
	public RegionDBDAOSearchRegionListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("startpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rgn_cd",new String[]{arrTmp[0],arrTmp[1]});
		
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("conti_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.region.integration").append("\n"); 
		query.append("FileName : RegionDBDAOSearchRegionListRSQL").append("\n"); 
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
		query.append("SELECT rgn_cd," ).append("\n"); 
		query.append("	rgn_nm," ).append("\n"); 
		query.append("	cnt_cd," ).append("\n"); 
		query.append("	sconti_cd," ).append("\n"); 
		query.append("	(CASE " ).append("\n"); 
		query.append("		WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("		ELSE 'Active' " ).append("\n"); 
		query.append("	END) AS delt_flg" ).append("\n"); 
		query.append("FROM (	SELECT ROW_NUMBER() OVER (ORDER BY A.rgn_cd ASC) no," ).append("\n"); 
		query.append("			A.rgn_cd," ).append("\n"); 
		query.append("			A.rgn_nm," ).append("\n"); 
		query.append("			A.cnt_cd," ).append("\n"); 
		query.append("			B.sconti_cd," ).append("\n"); 
		query.append("			A.delt_flg" ).append("\n"); 
		query.append("		FROM mdm_region A, mdm_country B, mdm_subcontinent C" ).append("\n"); 
		query.append("		WHERE 1 = 1 AND A.cnt_cd = B.cnt_cd AND B.sconti_cd = C.sconti_cd" ).append("\n"); 
		query.append("		" ).append("\n"); 
		query.append("		#if (${cnt_cd} != '') " ).append("\n"); 
		query.append("		AND A.cnt_cd like @[cnt_cd] || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if (${rgn_cd} != '') " ).append("\n"); 
		query.append("		AND A.rgn_cd like @[rgn_cd] || '%'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		#if (${conti_cd} != '') " ).append("\n"); 
		query.append("		AND C.conti_cd = @[conti_cd]" ).append("\n"); 
		query.append("		#end" ).append("\n");
		query.append("" ).append("\n"); 
		query.append("		#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("			#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("				AND NVL(A.DELT_FLG, 'N') = @[delt_flg]" ).append("\n"); 
		query.append("			#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("			#else " ).append("\n"); 
		query.append("				AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("		#else	" ).append("\n"); 
		query.append("			AND NVL(A.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("		AND NVL(B.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append("	) a	" ).append("\n"); 
		query.append("ORDER BY rgn_cd" ).append("\n"); 

	}
}