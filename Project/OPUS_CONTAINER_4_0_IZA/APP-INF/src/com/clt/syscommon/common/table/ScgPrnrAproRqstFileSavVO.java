/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ScgPrnrAproRqstFileSavVO.java
*@FileTitle : ScgPrnrAproRqstFileSavVO
*Open Issues :
*Change history :
*@LastModifyDate : 2017.08.21
*@LastModifier : 
*@LastVersion : 1.0
* 2017.08.21  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScgPrnrAproRqstFileSavVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgPrnrAproRqstFileSavVO> models = new ArrayList<ScgPrnrAproRqstFileSavVO>();
	
	/* Column Info */
	private String spclCgoRqstSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fileSavId = null;
	/* Column Info */
	private String infoKnt = null;
	/* Column Info */
	private String warnKnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String crrCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bkgRefNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String tmpltSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String prnrCgoRqstSeq = null;
	/* Column Info */
	private String errKnt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public ScgPrnrAproRqstFileSavVO() {}

	public ScgPrnrAproRqstFileSavVO(String ibflag, String pagerows, String crrCd, String bkgRefNo, String spclCgoRqstSeq, String prnrCgoRqstSeq, String tmpltSeq, String fileSavId, String creUsrId, String creDt, String updUsrId, String updDt, String errKnt, String warnKnt, String infoKnt) {
		this.spclCgoRqstSeq = spclCgoRqstSeq;
		this.updDt = updDt;
		this.fileSavId = fileSavId;
		this.infoKnt = infoKnt;
		this.warnKnt = warnKnt;
		this.creDt = creDt;
		this.crrCd = crrCd;
		this.pagerows = pagerows;
		this.bkgRefNo = bkgRefNo;
		this.ibflag = ibflag;
		this.tmpltSeq = tmpltSeq;
		this.creUsrId = creUsrId;
		this.prnrCgoRqstSeq = prnrCgoRqstSeq;
		this.errKnt = errKnt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("spcl_cgo_rqst_seq", getSpclCgoRqstSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("file_sav_id", getFileSavId());
		this.hashColumns.put("info_knt", getInfoKnt());
		this.hashColumns.put("warn_knt", getWarnKnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("crr_cd", getCrrCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bkg_ref_no", getBkgRefNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("tmplt_seq", getTmpltSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("prnr_cgo_rqst_seq", getPrnrCgoRqstSeq());
		this.hashColumns.put("err_knt", getErrKnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("spcl_cgo_rqst_seq", "spclCgoRqstSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("file_sav_id", "fileSavId");
		this.hashFields.put("info_knt", "infoKnt");
		this.hashFields.put("warn_knt", "warnKnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("crr_cd", "crrCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bkg_ref_no", "bkgRefNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("tmplt_seq", "tmpltSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("prnr_cgo_rqst_seq", "prnrCgoRqstSeq");
		this.hashFields.put("err_knt", "errKnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return spclCgoRqstSeq
	 */
	public String getSpclCgoRqstSeq() {
		return this.spclCgoRqstSeq;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return fileSavId
	 */
	public String getFileSavId() {
		return this.fileSavId;
	}
	
	/**
	 * Column Info
	 * @return infoKnt
	 */
	public String getInfoKnt() {
		return this.infoKnt;
	}
	
	/**
	 * Column Info
	 * @return warnKnt
	 */
	public String getWarnKnt() {
		return this.warnKnt;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return crrCd
	 */
	public String getCrrCd() {
		return this.crrCd;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return bkgRefNo
	 */
	public String getBkgRefNo() {
		return this.bkgRefNo;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return tmpltSeq
	 */
	public String getTmpltSeq() {
		return this.tmpltSeq;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return prnrCgoRqstSeq
	 */
	public String getPrnrCgoRqstSeq() {
		return this.prnrCgoRqstSeq;
	}
	
	/**
	 * Column Info
	 * @return errKnt
	 */
	public String getErrKnt() {
		return this.errKnt;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	

	/**
	 * Column Info
	 * @param spclCgoRqstSeq
	 */
	public void setSpclCgoRqstSeq(String spclCgoRqstSeq) {
		this.spclCgoRqstSeq = spclCgoRqstSeq;
	}
	
	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param fileSavId
	 */
	public void setFileSavId(String fileSavId) {
		this.fileSavId = fileSavId;
	}
	
	/**
	 * Column Info
	 * @param infoKnt
	 */
	public void setInfoKnt(String infoKnt) {
		this.infoKnt = infoKnt;
	}
	
	/**
	 * Column Info
	 * @param warnKnt
	 */
	public void setWarnKnt(String warnKnt) {
		this.warnKnt = warnKnt;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param crrCd
	 */
	public void setCrrCd(String crrCd) {
		this.crrCd = crrCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param bkgRefNo
	 */
	public void setBkgRefNo(String bkgRefNo) {
		this.bkgRefNo = bkgRefNo;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param tmpltSeq
	 */
	public void setTmpltSeq(String tmpltSeq) {
		this.tmpltSeq = tmpltSeq;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param prnrCgoRqstSeq
	 */
	public void setPrnrCgoRqstSeq(String prnrCgoRqstSeq) {
		this.prnrCgoRqstSeq = prnrCgoRqstSeq;
	}
	
	/**
	 * Column Info
	 * @param errKnt
	 */
	public void setErrKnt(String errKnt) {
		this.errKnt = errKnt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setSpclCgoRqstSeq(JSPUtil.getParameter(request, prefix + "spcl_cgo_rqst_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setFileSavId(JSPUtil.getParameter(request, prefix + "file_sav_id", ""));
		setInfoKnt(JSPUtil.getParameter(request, prefix + "info_knt", ""));
		setWarnKnt(JSPUtil.getParameter(request, prefix + "warn_knt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCrrCd(JSPUtil.getParameter(request, prefix + "crr_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setBkgRefNo(JSPUtil.getParameter(request, prefix + "bkg_ref_no", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setTmpltSeq(JSPUtil.getParameter(request, prefix + "tmplt_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setPrnrCgoRqstSeq(JSPUtil.getParameter(request, prefix + "prnr_cgo_rqst_seq", ""));
		setErrKnt(JSPUtil.getParameter(request, prefix + "err_knt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgPrnrAproRqstFileSavVO[]
	 */
	public ScgPrnrAproRqstFileSavVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgPrnrAproRqstFileSavVO[]
	 */
	public ScgPrnrAproRqstFileSavVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgPrnrAproRqstFileSavVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] spclCgoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_rqst_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fileSavId = (JSPUtil.getParameter(request, prefix	+ "file_sav_id", length));
			String[] infoKnt = (JSPUtil.getParameter(request, prefix	+ "info_knt", length));
			String[] warnKnt = (JSPUtil.getParameter(request, prefix	+ "warn_knt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] crrCd = (JSPUtil.getParameter(request, prefix	+ "crr_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bkgRefNo = (JSPUtil.getParameter(request, prefix	+ "bkg_ref_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] tmpltSeq = (JSPUtil.getParameter(request, prefix	+ "tmplt_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] prnrCgoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "prnr_cgo_rqst_seq", length));
			String[] errKnt = (JSPUtil.getParameter(request, prefix	+ "err_knt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgPrnrAproRqstFileSavVO();
				if (spclCgoRqstSeq[i] != null)
					model.setSpclCgoRqstSeq(spclCgoRqstSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fileSavId[i] != null)
					model.setFileSavId(fileSavId[i]);
				if (infoKnt[i] != null)
					model.setInfoKnt(infoKnt[i]);
				if (warnKnt[i] != null)
					model.setWarnKnt(warnKnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (crrCd[i] != null)
					model.setCrrCd(crrCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bkgRefNo[i] != null)
					model.setBkgRefNo(bkgRefNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (tmpltSeq[i] != null)
					model.setTmpltSeq(tmpltSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (prnrCgoRqstSeq[i] != null)
					model.setPrnrCgoRqstSeq(prnrCgoRqstSeq[i]);
				if (errKnt[i] != null)
					model.setErrKnt(errKnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgPrnrAproRqstFileSavVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgPrnrAproRqstFileSavVO[]
	 */
	public ScgPrnrAproRqstFileSavVO[] getScgPrnrAproRqstFileSavVOs(){
		ScgPrnrAproRqstFileSavVO[] vos = (ScgPrnrAproRqstFileSavVO[])models.toArray(new ScgPrnrAproRqstFileSavVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.spclCgoRqstSeq = this.spclCgoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileSavId = this.fileSavId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.infoKnt = this.infoKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.warnKnt = this.warnKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCd = this.crrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRefNo = this.bkgRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpltSeq = this.tmpltSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prnrCgoRqstSeq = this.prnrCgoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errKnt = this.errKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
