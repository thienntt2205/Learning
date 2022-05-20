/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PRD_PORT_TML_MTX.java
*@FileTitle : Carrier별 이용터미널 정보관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-02
*@LastModifier : jungsunyoung
*@LastVersion : 1.0
* 2006-10-02 jungsunyoung
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author jungsunyoung
 * @since J2EE 1.4
 */
public final class PRD_PORT_TML_MTX implements java.io.Serializable {

	private String      ibflag      = "";
	private String      page_rows   = "";
	private String      port_cd     = "";
	private String      vsl_slan_cd = "";
	private String      skd_dir_cd  = "";
	private String      carrier_cd  = "";
	private String      tml_cd      = "";
	private String      cre_usr_id  = "";
	private String      cre_dt      = "";
	private String      upd_usr_id  = "";
	private String      upd_dt      = "";

	public PRD_PORT_TML_MTX(){}

	public PRD_PORT_TML_MTX(
			String      ibflag     ,
			String      page_rows  ,
			String      port_cd    ,
			String      vsl_slan_cd,
			String      skd_dir_cd ,
			String      carrier_cd ,
			String      tml_cd     ,
			String      cre_usr_id ,
			String      cre_dt     ,
			String      upd_usr_id ,
			String      upd_dt     ){
		this.ibflag      = ibflag     ;
		this.page_rows   = page_rows  ;
		this.port_cd     = port_cd    ;
		this.vsl_slan_cd = vsl_slan_cd;
		this.skd_dir_cd  = skd_dir_cd ;
		this.carrier_cd  = carrier_cd ;
		this.tml_cd      = tml_cd     ;
		this.cre_usr_id  = cre_usr_id ;
		this.cre_dt      = cre_dt     ;
		this.upd_usr_id  = upd_usr_id ;
		this.upd_dt      = upd_dt     ;
	}

	// getter method is proceeding ..
	public String      getIbflag     (){	return ibflag     	;	}
	public String      getPage_rows  (){	return page_rows  	;	}
	public String      getPort_cd    (){	return port_cd    	;	}
	public String      getVsl_slan_cd(){	return vsl_slan_cd	;	}
	public String      getSkd_dir_cd (){	return skd_dir_cd 	;	}
	public String      getCarrier_cd (){	return carrier_cd 	;	}
	public String      getTml_cd     (){	return tml_cd     	;	}
	public String      getCre_usr_id (){	return cre_usr_id 	;	}
	public String      getCre_dt     (){	return cre_dt     	;	}
	public String      getUpd_usr_id (){	return upd_usr_id 	;	}
	public String      getUpd_dt     (){	return upd_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag     ( String      ibflag      ){	this.ibflag      = ibflag     	;	}
	public void setPage_rows  ( String      page_rows   ){	this.page_rows   = page_rows  	;	}
	public void setPort_cd    ( String      port_cd     ){	this.port_cd     = port_cd    	;	}
	public void setVsl_slan_cd( String      vsl_slan_cd ){	this.vsl_slan_cd = vsl_slan_cd	;	}
	public void setSkd_dir_cd ( String      skd_dir_cd  ){	this.skd_dir_cd  = skd_dir_cd 	;	}
	public void setCarrier_cd ( String      carrier_cd  ){	this.carrier_cd  = carrier_cd 	;	}
	public void setTml_cd     ( String      tml_cd      ){	this.tml_cd      = tml_cd     	;	}
	public void setCre_usr_id ( String      cre_usr_id  ){	this.cre_usr_id  = cre_usr_id 	;	}
	public void setCre_dt     ( String      cre_dt      ){	this.cre_dt      = cre_dt     	;	}
	public void setUpd_usr_id ( String      upd_usr_id  ){	this.upd_usr_id  = upd_usr_id 	;	}
	public void setUpd_dt     ( String      upd_dt      ){	this.upd_dt      = upd_dt     	;	}

	public static PRD_PORT_TML_MTX fromRequest(HttpServletRequest request) {
		PRD_PORT_TML_MTX model = new PRD_PORT_TML_MTX();
		try {
			model.setIbflag     	(JSPUtil.getParameter(request, "ibflag     		".trim(), ""));
			model.setPage_rows  	(JSPUtil.getParameter(request, "page_rows  		".trim(), ""));
			model.setPort_cd    	(JSPUtil.getParameter(request, "port_cd    		".trim(), ""));
			model.setVsl_slan_cd	(JSPUtil.getParameter(request, "vsl_slan_cd		".trim(), ""));
			model.setSkd_dir_cd 	(JSPUtil.getParameter(request, "skd_dir_cd 		".trim(), ""));
			model.setCarrier_cd 	(JSPUtil.getParameter(request, "carrier_cd 		".trim(), ""));
			model.setTml_cd     	(JSPUtil.getParameter(request, "tml_cd     		".trim(), ""));
			model.setCre_usr_id 	(JSPUtil.getParameter(request, "cre_usr_id 		".trim(), ""));
			model.setCre_dt     	(JSPUtil.getParameter(request, "cre_dt     		".trim(), ""));
			model.setUpd_usr_id 	(JSPUtil.getParameter(request, "upd_usr_id 		".trim(), ""));
			model.setUpd_dt     	(JSPUtil.getParameter(request, "upd_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		PRD_PORT_TML_MTX model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, "page_rows  		".trim(), length));
			String[] port_cd     =  (JSPUtil.getParameter(request, "port_cd    		".trim(), length));
			String[] vsl_slan_cd =  (JSPUtil.getParameter(request, "vsl_slan_cd		".trim(), length));
			String[] skd_dir_cd  =  (JSPUtil.getParameter(request, "skd_dir_cd 		".trim(), length));
			String[] carrier_cd  =  (JSPUtil.getParameter(request, "carrier_cd 		".trim(), length));
			String[] tml_cd      =  (JSPUtil.getParameter(request, "tml_cd     		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, "cre_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, "upd_usr_id 		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, "upd_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PRD_PORT_TML_MTX();
				model.setIbflag     		  (ibflag     	[i]);
				model.setPage_rows  		  (page_rows  	[i]);
				model.setPort_cd    		  (port_cd    	[i]);
				model.setVsl_slan_cd		  (vsl_slan_cd	[i]);
				model.setSkd_dir_cd 		  (skd_dir_cd 	[i]);
				model.setCarrier_cd 		  (carrier_cd 	[i]);
				model.setTml_cd     		  (tml_cd     	[i]);
				model.setCre_usr_id 		  (cre_usr_id 	[i]);
				model.setCre_dt     		  (cre_dt     	[i]);
				model.setUpd_usr_id 		  (upd_usr_id 	[i]);
				model.setUpd_dt     		  (upd_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		PRD_PORT_TML_MTX model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag      =  (JSPUtil.getParameter(request, prefix + "ibflag     		".trim(), length));
			String[] page_rows   =  (JSPUtil.getParameter(request, prefix + "page_rows  		".trim(), length));
			String[] port_cd     =  (JSPUtil.getParameter(request, prefix + "port_cd    		".trim(), length));
			String[] vsl_slan_cd =  (JSPUtil.getParameter(request, prefix + "vsl_slan_cd		".trim(), length));
			String[] skd_dir_cd  =  (JSPUtil.getParameter(request, prefix + "skd_dir_cd 		".trim(), length));
			String[] carrier_cd  =  (JSPUtil.getParameter(request, prefix + "carrier_cd 		".trim(), length));
			String[] tml_cd      =  (JSPUtil.getParameter(request, prefix + "tml_cd     		".trim(), length));
			String[] cre_usr_id  =  (JSPUtil.getParameter(request, prefix + "cre_usr_id 		".trim(), length));
			String[] cre_dt      =  (JSPUtil.getParameter(request, prefix + "cre_dt     		".trim(), length));
			String[] upd_usr_id  =  (JSPUtil.getParameter(request, prefix + "upd_usr_id 		".trim(), length));
			String[] upd_dt      =  (JSPUtil.getParameter(request, prefix + "upd_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new PRD_PORT_TML_MTX();
				model.setIbflag     		  ( ibflag     	[i]);
				model.setPage_rows  		  ( page_rows  	[i]);
				model.setPort_cd    		  ( port_cd    	[i]);
				model.setVsl_slan_cd		  ( vsl_slan_cd	[i]);
				model.setSkd_dir_cd 		  ( skd_dir_cd 	[i]);
				model.setCarrier_cd 		  ( carrier_cd 	[i]);
				model.setTml_cd     		  ( tml_cd     	[i]);
				model.setCre_usr_id 		  ( cre_usr_id 	[i]);
				model.setCre_dt     		  ( cre_dt     	[i]);
				model.setUpd_usr_id 		  ( upd_usr_id 	[i]);
				model.setUpd_dt     		  ( upd_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}

	// toString() method is overriding ..
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space="                              ";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr=null;
				try {
					arr = (String[]) field[i].get(this);
				}catch(Exception ex) {
					arr=new String[1];
					arr[0]=String.valueOf(field[i].get(this));
				}
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0,30).concat("= ") + arr[j] +"\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}

}
