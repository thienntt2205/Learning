/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_DTL_REV_LANE.java
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
public final class MdmDtlRevLane implements java.io.Serializable {

	private String          ibflag          = "";
	private String          page_rows       = "";
	private String          rlane_cd        = "";
	private String          vsl_slan_dir_cd = "";
	private String          trd_cd          = "";
	private String          ioc_cd          = "";
	private String          fm_conti_cd     = "";
	private String          to_conti_cd     = "";
	private String          sub_trd_cd      = "";
	private String          cre_usr_id      = "";
	private String          cre_dt          = "";
	private String          upd_usr_id      = "";
	private String          upd_dt          = "";
	private String          delt_flg        = "";
	private String          eai_evnt_dt     = "";

	public MdmDtlRevLane(){}

	public MdmDtlRevLane(
			String          ibflag         ,
			String          page_rows      ,
			String          rlane_cd       ,
			String          vsl_slan_dir_cd,
			String          trd_cd         ,
			String          ioc_cd         ,
			String          fm_conti_cd    ,
			String          to_conti_cd    ,
			String          sub_trd_cd     ,
			String          cre_usr_id     ,
			String          cre_dt         ,
			String          upd_usr_id     ,
			String          upd_dt         ,
			String          delt_flg       ,
			String          eai_evnt_dt    ){
		this.ibflag          = ibflag         ;
		this.page_rows       = page_rows      ;
		this.rlane_cd        = rlane_cd       ;
		this.vsl_slan_dir_cd = vsl_slan_dir_cd;
		this.trd_cd          = trd_cd         ;
		this.ioc_cd          = ioc_cd         ;
		this.fm_conti_cd     = fm_conti_cd    ;
		this.to_conti_cd     = to_conti_cd    ;
		this.sub_trd_cd      = sub_trd_cd     ;
		this.cre_usr_id      = cre_usr_id     ;
		this.cre_dt          = cre_dt         ;
		this.upd_usr_id      = upd_usr_id     ;
		this.upd_dt          = upd_dt         ;
		this.delt_flg        = delt_flg       ;
		this.eai_evnt_dt     = eai_evnt_dt    ;
	}

	// getter method is proceeding ..
	public String          getIbflag         (){	return ibflag         	;	}
	public String          getPage_rows      (){	return page_rows      	;	}
	public String          getRlane_cd       (){	return rlane_cd       	;	}
	public String          getVsl_slan_dir_cd(){	return vsl_slan_dir_cd	;	}
	public String          getTrd_cd         (){	return trd_cd         	;	}
	public String          getIoc_cd         (){	return ioc_cd         	;	}
	public String          getFm_conti_cd    (){	return fm_conti_cd    	;	}
	public String          getTo_conti_cd    (){	return to_conti_cd    	;	}
	public String          getSub_trd_cd     (){	return sub_trd_cd     	;	}
	public String          getCre_usr_id     (){	return cre_usr_id     	;	}
	public String          getCre_dt         (){	return cre_dt         	;	}
	public String          getUpd_usr_id     (){	return upd_usr_id     	;	}
	public String          getUpd_dt         (){	return upd_dt         	;	}
	public String          getDelt_flg       (){	return delt_flg       	;	}
	public String          getEai_evnt_dt    (){	return eai_evnt_dt    	;	}

	// setter method is proceeding ..
	public void setIbflag         ( String          ibflag          ){	this.ibflag          = ibflag         	;	}
	public void setPage_rows      ( String          page_rows       ){	this.page_rows       = page_rows      	;	}
	public void setRlane_cd       ( String          rlane_cd        ){	this.rlane_cd        = rlane_cd       	;	}
	public void setVsl_slan_dir_cd( String          vsl_slan_dir_cd ){	this.vsl_slan_dir_cd = vsl_slan_dir_cd	;	}
	public void setTrd_cd         ( String          trd_cd          ){	this.trd_cd          = trd_cd         	;	}
	public void setIoc_cd         ( String          ioc_cd          ){	this.ioc_cd          = ioc_cd         	;	}
	public void setFm_conti_cd    ( String          fm_conti_cd     ){	this.fm_conti_cd     = fm_conti_cd    	;	}
	public void setTo_conti_cd    ( String          to_conti_cd     ){	this.to_conti_cd     = to_conti_cd    	;	}
	public void setSub_trd_cd     ( String          sub_trd_cd      ){	this.sub_trd_cd      = sub_trd_cd     	;	}
	public void setCre_usr_id     ( String          cre_usr_id      ){	this.cre_usr_id      = cre_usr_id     	;	}
	public void setCre_dt         ( String          cre_dt          ){	this.cre_dt          = cre_dt         	;	}
	public void setUpd_usr_id     ( String          upd_usr_id      ){	this.upd_usr_id      = upd_usr_id     	;	}
	public void setUpd_dt         ( String          upd_dt          ){	this.upd_dt          = upd_dt         	;	}
	public void setDelt_flg       ( String          delt_flg        ){	this.delt_flg        = delt_flg       	;	}
	public void setEai_evnt_dt    ( String          eai_evnt_dt     ){	this.eai_evnt_dt     = eai_evnt_dt    	;	}

	public static MdmDtlRevLane fromRequest(HttpServletRequest request) {
		MdmDtlRevLane model = new MdmDtlRevLane();
		try {
			model.setIbflag         	(JSPUtil.getParameter(request, "ibflag         		".trim(), ""));
			model.setPage_rows      	(JSPUtil.getParameter(request, "page_rows      		".trim(), ""));
			model.setRlane_cd       	(JSPUtil.getParameter(request, "rlane_cd       		".trim(), ""));
			model.setVsl_slan_dir_cd	(JSPUtil.getParameter(request, "vsl_slan_dir_cd		".trim(), ""));
			model.setTrd_cd         	(JSPUtil.getParameter(request, "trd_cd         		".trim(), ""));
			model.setIoc_cd         	(JSPUtil.getParameter(request, "ioc_cd         		".trim(), ""));
			model.setFm_conti_cd    	(JSPUtil.getParameter(request, "fm_conti_cd    		".trim(), ""));
			model.setTo_conti_cd    	(JSPUtil.getParameter(request, "to_conti_cd    		".trim(), ""));
			model.setSub_trd_cd     	(JSPUtil.getParameter(request, "sub_trd_cd     		".trim(), ""));
			model.setCre_usr_id     	(JSPUtil.getParameter(request, "cre_usr_id     		".trim(), ""));
			model.setCre_dt         	(JSPUtil.getParameter(request, "cre_dt         		".trim(), ""));
			model.setUpd_usr_id     	(JSPUtil.getParameter(request, "upd_usr_id     		".trim(), ""));
			model.setUpd_dt         	(JSPUtil.getParameter(request, "upd_dt         		".trim(), ""));
			model.setDelt_flg       	(JSPUtil.getParameter(request, "delt_flg       		".trim(), ""));
			model.setEai_evnt_dt    	(JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmDtlRevLane model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows      		".trim(), length));
			String[] rlane_cd        =  (JSPUtil.getParameter(request, "rlane_cd       		".trim(), length));
			String[] vsl_slan_dir_cd =  (JSPUtil.getParameter(request, "vsl_slan_dir_cd		".trim(), length));
			String[] trd_cd          =  (JSPUtil.getParameter(request, "trd_cd         		".trim(), length));
			String[] ioc_cd          =  (JSPUtil.getParameter(request, "ioc_cd         		".trim(), length));
			String[] fm_conti_cd     =  (JSPUtil.getParameter(request, "fm_conti_cd    		".trim(), length));
			String[] to_conti_cd     =  (JSPUtil.getParameter(request, "to_conti_cd    		".trim(), length));
			String[] sub_trd_cd      =  (JSPUtil.getParameter(request, "sub_trd_cd     		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt         		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, "delt_flg       		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmDtlRevLane();
				model.setIbflag         		  (ibflag         	[i]);
				model.setPage_rows      		  (page_rows      	[i]);
				model.setRlane_cd       		  (rlane_cd       	[i]);
				model.setVsl_slan_dir_cd		  (vsl_slan_dir_cd	[i]);
				model.setTrd_cd         		  (trd_cd         	[i]);
				model.setIoc_cd         		  (ioc_cd         	[i]);
				model.setFm_conti_cd    		  (fm_conti_cd    	[i]);
				model.setTo_conti_cd    		  (to_conti_cd    	[i]);
				model.setSub_trd_cd     		  (sub_trd_cd     	[i]);
				model.setCre_usr_id     		  (cre_usr_id     	[i]);
				model.setCre_dt         		  (cre_dt         	[i]);
				model.setUpd_usr_id     		  (upd_usr_id     	[i]);
				model.setUpd_dt         		  (upd_dt         	[i]);
				model.setDelt_flg       		  (delt_flg       	[i]);
				model.setEai_evnt_dt    		  (eai_evnt_dt    	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmDtlRevLane model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag          =  (JSPUtil.getParameter(request, prefix + "ibflag         		".trim(), length));
			String[] page_rows       =  (JSPUtil.getParameter(request, prefix + "page_rows      		".trim(), length));
			String[] rlane_cd        =  (JSPUtil.getParameter(request, prefix + "rlane_cd       		".trim(), length));
			String[] vsl_slan_dir_cd =  (JSPUtil.getParameter(request, prefix + "vsl_slan_dir_cd		".trim(), length));
			String[] trd_cd          =  (JSPUtil.getParameter(request, prefix + "trd_cd         		".trim(), length));
			String[] ioc_cd          =  (JSPUtil.getParameter(request, prefix + "ioc_cd         		".trim(), length));
			String[] fm_conti_cd     =  (JSPUtil.getParameter(request, prefix + "fm_conti_cd    		".trim(), length));
			String[] to_conti_cd     =  (JSPUtil.getParameter(request, prefix + "to_conti_cd    		".trim(), length));
			String[] sub_trd_cd      =  (JSPUtil.getParameter(request, prefix + "sub_trd_cd     		".trim(), length));
			String[] cre_usr_id      =  (JSPUtil.getParameter(request, prefix + "cre_usr_id     		".trim(), length));
			String[] cre_dt          =  (JSPUtil.getParameter(request, prefix + "cre_dt         		".trim(), length));
			String[] upd_usr_id      =  (JSPUtil.getParameter(request, prefix + "upd_usr_id     		".trim(), length));
			String[] upd_dt          =  (JSPUtil.getParameter(request, prefix + "upd_dt         		".trim(), length));
			String[] delt_flg        =  (JSPUtil.getParameter(request, prefix + "delt_flg       		".trim(), length));
			String[] eai_evnt_dt     =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt    		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmDtlRevLane();
				model.setIbflag         		  ( ibflag         	[i]);
				model.setPage_rows      		  ( page_rows      	[i]);
				model.setRlane_cd       		  ( rlane_cd       	[i]);
				model.setVsl_slan_dir_cd		  ( vsl_slan_dir_cd	[i]);
				model.setTrd_cd         		  ( trd_cd         	[i]);
				model.setIoc_cd         		  ( ioc_cd         	[i]);
				model.setFm_conti_cd    		  ( fm_conti_cd    	[i]);
				model.setTo_conti_cd    		  ( to_conti_cd    	[i]);
				model.setSub_trd_cd     		  ( sub_trd_cd     	[i]);
				model.setCre_usr_id     		  ( cre_usr_id     	[i]);
				model.setCre_dt         		  ( cre_dt         	[i]);
				model.setUpd_usr_id     		  ( upd_usr_id     	[i]);
				model.setUpd_dt         		  ( upd_dt         	[i]);
				model.setDelt_flg       		  ( delt_flg       	[i]);
				model.setEai_evnt_dt    		  ( eai_evnt_dt    	[i]);
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
