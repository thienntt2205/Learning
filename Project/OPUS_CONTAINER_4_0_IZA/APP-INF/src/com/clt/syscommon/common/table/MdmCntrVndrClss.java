/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_CNTR_VNDR_CLSS.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
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
 * @author Kildong_hong6
 * @since J2EE 1.4
 */ 
public final class MdmCntrVndrClss implements java.io.Serializable {

	private String           ibflag           = "";
	private String           page_rows        = "";
	private String           vndr_seq         = "";
	private String           vndr_cost_cd     = "";
	private String           cntr_vndr_svc_cd = "";
	private String           cre_usr_id       = "";
	private String           cre_dt           = "";
	private String           upd_usr_id       = "";
	private String           upd_dt           = "";
	private String           delt_flg         = "";
	private String           eai_evnt_dt      = "";

	public MdmCntrVndrClss(){}

	public MdmCntrVndrClss(
			String           ibflag          ,
			String           page_rows       ,
			String           vndr_seq        ,
			String           vndr_cost_cd    ,
			String           cntr_vndr_svc_cd,
			String           cre_usr_id      ,
			String           cre_dt          ,
			String           upd_usr_id      ,
			String           upd_dt          ,
			String           delt_flg        ,
			String           eai_evnt_dt     ){
		this.ibflag           = ibflag          ;
		this.page_rows        = page_rows       ;
		this.vndr_seq         = vndr_seq        ;
		this.vndr_cost_cd     = vndr_cost_cd    ;
		this.cntr_vndr_svc_cd = cntr_vndr_svc_cd;
		this.cre_usr_id       = cre_usr_id      ;
		this.cre_dt           = cre_dt          ;
		this.upd_usr_id       = upd_usr_id      ;
		this.upd_dt           = upd_dt          ;
		this.delt_flg         = delt_flg        ;
		this.eai_evnt_dt      = eai_evnt_dt     ;
	}

	// getter method is proceeding ..
	public String           getIbflag          (){	return ibflag          	;	}
	public String           getPage_rows       (){	return page_rows       	;	}
	public String           getVndr_seq        (){	return vndr_seq        	;	}
	public String           getVndr_cost_cd    (){	return vndr_cost_cd    	;	}
	public String           getCntr_vndr_svc_cd(){	return cntr_vndr_svc_cd	;	}
	public String           getCre_usr_id      (){	return cre_usr_id      	;	}
	public String           getCre_dt          (){	return cre_dt          	;	}
	public String           getUpd_usr_id      (){	return upd_usr_id      	;	}
	public String           getUpd_dt          (){	return upd_dt          	;	}
	public String           getDelt_flg        (){	return delt_flg        	;	}
	public String           getEai_evnt_dt     (){	return eai_evnt_dt     	;	}

	// setter method is proceeding ..
	public void setIbflag          ( String           ibflag           ){	this.ibflag           = ibflag          	;	}
	public void setPage_rows       ( String           page_rows        ){	this.page_rows        = page_rows       	;	}
	public void setVndr_seq        ( String           vndr_seq         ){	this.vndr_seq         = vndr_seq        	;	}
	public void setVndr_cost_cd    ( String           vndr_cost_cd     ){	this.vndr_cost_cd     = vndr_cost_cd    	;	}
	public void setCntr_vndr_svc_cd( String           cntr_vndr_svc_cd ){	this.cntr_vndr_svc_cd = cntr_vndr_svc_cd	;	}
	public void setCre_usr_id      ( String           cre_usr_id       ){	this.cre_usr_id       = cre_usr_id      	;	}
	public void setCre_dt          ( String           cre_dt           ){	this.cre_dt           = cre_dt          	;	}
	public void setUpd_usr_id      ( String           upd_usr_id       ){	this.upd_usr_id       = upd_usr_id      	;	}
	public void setUpd_dt          ( String           upd_dt           ){	this.upd_dt           = upd_dt          	;	}
	public void setDelt_flg        ( String           delt_flg         ){	this.delt_flg         = delt_flg        	;	}
	public void setEai_evnt_dt     ( String           eai_evnt_dt      ){	this.eai_evnt_dt      = eai_evnt_dt     	;	}

	public static MdmCntrVndrClss fromRequest(HttpServletRequest request) {
		MdmCntrVndrClss model = new MdmCntrVndrClss();
		try {
			model.setIbflag          	(JSPUtil.getParameter(request, "ibflag          		".trim(), ""));
			model.setPage_rows       	(JSPUtil.getParameter(request, "page_rows       		".trim(), ""));
			model.setVndr_seq        	(JSPUtil.getParameter(request, "vndr_seq        		".trim(), ""));
			model.setVndr_cost_cd    	(JSPUtil.getParameter(request, "vndr_cost_cd    		".trim(), ""));
			model.setCntr_vndr_svc_cd	(JSPUtil.getParameter(request, "cntr_vndr_svc_cd		".trim(), ""));
			model.setCre_usr_id      	(JSPUtil.getParameter(request, "cre_usr_id      		".trim(), ""));
			model.setCre_dt          	(JSPUtil.getParameter(request, "cre_dt          		".trim(), ""));
			model.setUpd_usr_id      	(JSPUtil.getParameter(request, "upd_usr_id      		".trim(), ""));
			model.setUpd_dt          	(JSPUtil.getParameter(request, "upd_dt          		".trim(), ""));
			model.setDelt_flg        	(JSPUtil.getParameter(request, "delt_flg        		".trim(), ""));
			model.setEai_evnt_dt     	(JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmCntrVndrClss model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, "page_rows       		".trim(), length));
			String[] vndr_seq         =  (JSPUtil.getParameter(request, "vndr_seq        		".trim(), length));
			String[] vndr_cost_cd     =  (JSPUtil.getParameter(request, "vndr_cost_cd    		".trim(), length));
			String[] cntr_vndr_svc_cd =  (JSPUtil.getParameter(request, "cntr_vndr_svc_cd		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, "upd_dt          		".trim(), length));
			String[] delt_flg         =  (JSPUtil.getParameter(request, "delt_flg        		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCntrVndrClss();
				model.setIbflag          		  (ibflag          	[i]);
				model.setPage_rows       		  (page_rows       	[i]);
				model.setVndr_seq        		  (vndr_seq        	[i]);
				model.setVndr_cost_cd    		  (vndr_cost_cd    	[i]);
				model.setCntr_vndr_svc_cd		  (cntr_vndr_svc_cd	[i]);
				model.setCre_usr_id      		  (cre_usr_id      	[i]);
				model.setCre_dt          		  (cre_dt          	[i]);
				model.setUpd_usr_id      		  (upd_usr_id      	[i]);
				model.setUpd_dt          		  (upd_dt          	[i]);
				model.setDelt_flg        		  (delt_flg        	[i]);
				model.setEai_evnt_dt     		  (eai_evnt_dt     	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCntrVndrClss model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag           =  (JSPUtil.getParameter(request, prefix + "ibflag          		".trim(), length));
			String[] page_rows        =  (JSPUtil.getParameter(request, prefix + "page_rows       		".trim(), length));
			String[] vndr_seq         =  (JSPUtil.getParameter(request, prefix + "vndr_seq        		".trim(), length));
			String[] vndr_cost_cd     =  (JSPUtil.getParameter(request, prefix + "vndr_cost_cd    		".trim(), length));
			String[] cntr_vndr_svc_cd =  (JSPUtil.getParameter(request, prefix + "cntr_vndr_svc_cd		".trim(), length));
			String[] cre_usr_id       =  (JSPUtil.getParameter(request, prefix + "cre_usr_id      		".trim(), length));
			String[] cre_dt           =  (JSPUtil.getParameter(request, prefix + "cre_dt          		".trim(), length));
			String[] upd_usr_id       =  (JSPUtil.getParameter(request, prefix + "upd_usr_id      		".trim(), length));
			String[] upd_dt           =  (JSPUtil.getParameter(request, prefix + "upd_dt          		".trim(), length));
			String[] delt_flg         =  (JSPUtil.getParameter(request, prefix + "delt_flg        		".trim(), length));
			String[] eai_evnt_dt      =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt     		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmCntrVndrClss();
				model.setIbflag          		  ( ibflag          	[i]);
				model.setPage_rows       		  ( page_rows       	[i]);
				model.setVndr_seq        		  ( vndr_seq        	[i]);
				model.setVndr_cost_cd    		  ( vndr_cost_cd    	[i]);
				model.setCntr_vndr_svc_cd		  ( cntr_vndr_svc_cd	[i]);
				model.setCre_usr_id      		  ( cre_usr_id      	[i]);
				model.setCre_dt          		  ( cre_dt          	[i]);
				model.setUpd_usr_id      		  ( upd_usr_id      	[i]);
				model.setUpd_dt          		  ( upd_dt          	[i]);
				model.setDelt_flg        		  ( delt_flg        	[i]);
				model.setEai_evnt_dt     		  ( eai_evnt_dt     	[i]);
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
