/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmAgmtLseScgVO.java
*@FileTitle : CgmAgmtLseScgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmAgmtLseScgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmAgmtLseScgVO> models = new ArrayList<CgmAgmtLseScgVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String agmtVerNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String steCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String rgstScgRtAmt = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmAgmtLseScgVO() {}

	public CgmAgmtLseScgVO(String ibflag, String pagerows, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String steCd, String eqKndCd, String rgstScgRtAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.agmtVerNo = agmtVerNo;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.steCd = steCd;
		this.creDt = creDt;
		this.eqKndCd = eqKndCd;
		this.creUsrId = creUsrId;
		this.agmtSeq = agmtSeq;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.rgstScgRtAmt = rgstScgRtAmt;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ste_cd", getSteCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("rgst_scg_rt_amt", getRgstScgRtAmt());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ste_cd", "steCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("rgst_scg_rt_amt", "rgstScgRtAmt");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getAgmtVerNo() {
		return this.agmtVerNo;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getSteCd() {
		return this.steCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getRgstScgRtAmt() {
		return this.rgstScgRtAmt;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setAgmtVerNo(String agmtVerNo) {
		this.agmtVerNo = agmtVerNo;
		//this.agmtVerNo=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setSteCd(String steCd) {
		this.steCd = steCd;
		//this.steCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setRgstScgRtAmt(String rgstScgRtAmt) {
		this.rgstScgRtAmt = rgstScgRtAmt;
		//this.rgstScgRtAmt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSteCd(JSPUtil.getParameter(request, "ste_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setRgstScgRtAmt(JSPUtil.getParameter(request, "rgst_scg_rt_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmAgmtLseScgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmAgmtLseScgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmAgmtLseScgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] steCd = (JSPUtil.getParameter(request, prefix	+ "ste_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] rgstScgRtAmt = (JSPUtil.getParameter(request, prefix	+ "rgst_scg_rt_amt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmAgmtLseScgVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (steCd[i] != null)
					model.setSteCd(steCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (rgstScgRtAmt[i] != null)
					model.setRgstScgRtAmt(rgstScgRtAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmAgmtLseScgVOs();
	}

	public CgmAgmtLseScgVO[] getCgmAgmtLseScgVOs(){
		CgmAgmtLseScgVO[] vos = (CgmAgmtLseScgVO[])models.toArray(new CgmAgmtLseScgVO[models.size()]);
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
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.steCd = this.steCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstScgRtAmt = this.rgstScgRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
