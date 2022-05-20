/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSgBlplCtntVO.java
*@FileTitle : PriSgBlplCtntVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 이승준
*@LastVersion : 1.0
* 2009.04.27 이승준 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이승준
 * @since J2EE 1.5
 */

public class PriSgBlplCtntVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriSgBlplCtntVO> models = new ArrayList<PriSgBlplCtntVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String dpSeq = null;
	/* Column Info */
	private String blplHdrSeq = null;
	/* Column Info */
	private String blplCtnt = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String blplCtntSeq = null;
	/* Column Info */
	private String blplSeq = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriSgBlplCtntVO() {}

	public PriSgBlplCtntVO(String ibflag, String pagerows, String blplHdrSeq, String blplSeq, String blplCtntSeq, String blplCtnt, String dpSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.dpSeq = dpSeq;
		this.blplHdrSeq = blplHdrSeq;
		this.blplCtnt = blplCtnt;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.blplCtntSeq = blplCtntSeq;
		this.blplSeq = blplSeq;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("blpl_hdr_seq", getBlplHdrSeq());
		this.hashColumns.put("blpl_ctnt", getBlplCtnt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("blpl_ctnt_seq", getBlplCtntSeq());
		this.hashColumns.put("blpl_seq", getBlplSeq());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("blpl_hdr_seq", "blplHdrSeq");
		this.hashFields.put("blpl_ctnt", "blplCtnt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("blpl_ctnt_seq", "blplCtntSeq");
		this.hashFields.put("blpl_seq", "blplSeq");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getDpSeq() {
		return this.dpSeq;
	}
	public String getBlplHdrSeq() {
		return this.blplHdrSeq;
	}
	public String getBlplCtnt() {
		return this.blplCtnt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getBlplCtntSeq() {
		return this.blplCtntSeq;
	}
	public String getBlplSeq() {
		return this.blplSeq;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
		//this.dpSeq=true;
	}
	public void setBlplHdrSeq(String blplHdrSeq) {
		this.blplHdrSeq = blplHdrSeq;
		//this.blplHdrSeq=true;
	}
	public void setBlplCtnt(String blplCtnt) {
		this.blplCtnt = blplCtnt;
		//this.blplCtnt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setBlplCtntSeq(String blplCtntSeq) {
		this.blplCtntSeq = blplCtntSeq;
		//this.blplCtntSeq=true;
	}
	public void setBlplSeq(String blplSeq) {
		this.blplSeq = blplSeq;
		//this.blplSeq=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setDpSeq(JSPUtil.getParameter(request, "dp_seq", ""));
		setBlplHdrSeq(JSPUtil.getParameter(request, "blpl_hdr_seq", ""));
		setBlplCtnt(JSPUtil.getParameter(request, "blpl_ctnt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBlplCtntSeq(JSPUtil.getParameter(request, "blpl_ctnt_seq", ""));
		setBlplSeq(JSPUtil.getParameter(request, "blpl_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public PriSgBlplCtntVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public PriSgBlplCtntVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriSgBlplCtntVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq".trim(), length));
			String[] blplHdrSeq = (JSPUtil.getParameter(request, prefix	+ "blpl_hdr_seq".trim(), length));
			String[] blplCtnt = (JSPUtil.getParameter(request, prefix	+ "blpl_ctnt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] blplCtntSeq = (JSPUtil.getParameter(request, prefix	+ "blpl_ctnt_seq".trim(), length));
			String[] blplSeq = (JSPUtil.getParameter(request, prefix	+ "blpl_seq".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PriSgBlplCtntVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (blplHdrSeq[i] != null)
					model.setBlplHdrSeq(blplHdrSeq[i]);
				if (blplCtnt[i] != null)
					model.setBlplCtnt(blplCtnt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (blplCtntSeq[i] != null)
					model.setBlplCtntSeq(blplCtntSeq[i]);
				if (blplSeq[i] != null)
					model.setBlplSeq(blplSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getPriSgBlplCtntVOs();
	}

	public PriSgBlplCtntVO[] getPriSgBlplCtntVOs(){
		PriSgBlplCtntVO[] vos = (PriSgBlplCtntVO[])models.toArray(new PriSgBlplCtntVO[models.size()]);
		return vos;
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blplHdrSeq = this.blplHdrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blplCtnt = this.blplCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blplCtntSeq = this.blplCtntSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blplSeq = this.blplSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
