/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : PriTrfBzcProgVO.java
*@FileTitle : PriTrfBzcProgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.10.20
*@LastModifier : 
*@LastVersion : 1.0
* 2010.10.20  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

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

public class PriTrfBzcProgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriTrfBzcProgVO> models = new ArrayList<PriTrfBzcProgVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String trfBzcStsCd = null;
	/* Column Info */
	private String progUsrId = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trfBzcProgSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String progDt = null;
	/* Column Info */
	private String progOfcCd = null;
	/* Column Info */
	private String trfNo = null;
	/* Column Info */
	private String trfPfxCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriTrfBzcProgVO() {}

	public PriTrfBzcProgVO(String ibflag, String pagerows, String trfPfxCd, String trfNo, String amdtSeq, String trfBzcProgSeq, String trfBzcStsCd, String progUsrId, String progOfcCd, String progDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.trfBzcStsCd = trfBzcStsCd;
		this.progUsrId = progUsrId;
		this.amdtSeq = amdtSeq;
		this.creDt = creDt;
		this.trfBzcProgSeq = trfBzcProgSeq;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.progDt = progDt;
		this.progOfcCd = progOfcCd;
		this.trfNo = trfNo;
		this.trfPfxCd = trfPfxCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("trf_bzc_sts_cd", getTrfBzcStsCd());
		this.hashColumns.put("prog_usr_id", getProgUsrId());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trf_bzc_prog_seq", getTrfBzcProgSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("prog_dt", getProgDt());
		this.hashColumns.put("prog_ofc_cd", getProgOfcCd());
		this.hashColumns.put("trf_no", getTrfNo());
		this.hashColumns.put("trf_pfx_cd", getTrfPfxCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("trf_bzc_sts_cd", "trfBzcStsCd");
		this.hashFields.put("prog_usr_id", "progUsrId");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trf_bzc_prog_seq", "trfBzcProgSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("prog_dt", "progDt");
		this.hashFields.put("prog_ofc_cd", "progOfcCd");
		this.hashFields.put("trf_no", "trfNo");
		this.hashFields.put("trf_pfx_cd", "trfPfxCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
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
	 * @return trfBzcStsCd
	 */
	public String getTrfBzcStsCd() {
		return this.trfBzcStsCd;
	}
	
	/**
	 * Column Info
	 * @return progUsrId
	 */
	public String getProgUsrId() {
		return this.progUsrId;
	}
	
	/**
	 * Column Info
	 * @return amdtSeq
	 */
	public String getAmdtSeq() {
		return this.amdtSeq;
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
	 * @return trfBzcProgSeq
	 */
	public String getTrfBzcProgSeq() {
		return this.trfBzcProgSeq;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return progDt
	 */
	public String getProgDt() {
		return this.progDt;
	}
	
	/**
	 * Column Info
	 * @return progOfcCd
	 */
	public String getProgOfcCd() {
		return this.progOfcCd;
	}
	
	/**
	 * Column Info
	 * @return trfNo
	 */
	public String getTrfNo() {
		return this.trfNo;
	}
	
	/**
	 * Column Info
	 * @return trfPfxCd
	 */
	public String getTrfPfxCd() {
		return this.trfPfxCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param trfBzcStsCd
	 */
	public void setTrfBzcStsCd(String trfBzcStsCd) {
		this.trfBzcStsCd = trfBzcStsCd;
	}
	
	/**
	 * Column Info
	 * @param progUsrId
	 */
	public void setProgUsrId(String progUsrId) {
		this.progUsrId = progUsrId;
	}
	
	/**
	 * Column Info
	 * @param amdtSeq
	 */
	public void setAmdtSeq(String amdtSeq) {
		this.amdtSeq = amdtSeq;
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
	 * @param trfBzcProgSeq
	 */
	public void setTrfBzcProgSeq(String trfBzcProgSeq) {
		this.trfBzcProgSeq = trfBzcProgSeq;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param progDt
	 */
	public void setProgDt(String progDt) {
		this.progDt = progDt;
	}
	
	/**
	 * Column Info
	 * @param progOfcCd
	 */
	public void setProgOfcCd(String progOfcCd) {
		this.progOfcCd = progOfcCd;
	}
	
	/**
	 * Column Info
	 * @param trfNo
	 */
	public void setTrfNo(String trfNo) {
		this.trfNo = trfNo;
	}
	
	/**
	 * Column Info
	 * @param trfPfxCd
	 */
	public void setTrfPfxCd(String trfPfxCd) {
		this.trfPfxCd = trfPfxCd;
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
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setTrfBzcStsCd(JSPUtil.getParameter(request, prefix + "trf_bzc_sts_cd", ""));
		setProgUsrId(JSPUtil.getParameter(request, prefix + "prog_usr_id", ""));
		setAmdtSeq(JSPUtil.getParameter(request, prefix + "amdt_seq", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setTrfBzcProgSeq(JSPUtil.getParameter(request, prefix + "trf_bzc_prog_seq", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setProgDt(JSPUtil.getParameter(request, prefix + "prog_dt", ""));
		setProgOfcCd(JSPUtil.getParameter(request, prefix + "prog_ofc_cd", ""));
		setTrfNo(JSPUtil.getParameter(request, prefix + "trf_no", ""));
		setTrfPfxCd(JSPUtil.getParameter(request, prefix + "trf_pfx_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriTrfBzcProgVO[]
	 */
	public PriTrfBzcProgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriTrfBzcProgVO[]
	 */
	public PriTrfBzcProgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriTrfBzcProgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] trfBzcStsCd = (JSPUtil.getParameter(request, prefix	+ "trf_bzc_sts_cd", length));
			String[] progUsrId = (JSPUtil.getParameter(request, prefix	+ "prog_usr_id", length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trfBzcProgSeq = (JSPUtil.getParameter(request, prefix	+ "trf_bzc_prog_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] progDt = (JSPUtil.getParameter(request, prefix	+ "prog_dt", length));
			String[] progOfcCd = (JSPUtil.getParameter(request, prefix	+ "prog_ofc_cd", length));
			String[] trfNo = (JSPUtil.getParameter(request, prefix	+ "trf_no", length));
			String[] trfPfxCd = (JSPUtil.getParameter(request, prefix	+ "trf_pfx_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriTrfBzcProgVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (trfBzcStsCd[i] != null)
					model.setTrfBzcStsCd(trfBzcStsCd[i]);
				if (progUsrId[i] != null)
					model.setProgUsrId(progUsrId[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trfBzcProgSeq[i] != null)
					model.setTrfBzcProgSeq(trfBzcProgSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (progDt[i] != null)
					model.setProgDt(progDt[i]);
				if (progOfcCd[i] != null)
					model.setProgOfcCd(progOfcCd[i]);
				if (trfNo[i] != null)
					model.setTrfNo(trfNo[i]);
				if (trfPfxCd[i] != null)
					model.setTrfPfxCd(trfPfxCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriTrfBzcProgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriTrfBzcProgVO[]
	 */
	public PriTrfBzcProgVO[] getPriTrfBzcProgVOs(){
		PriTrfBzcProgVO[] vos = (PriTrfBzcProgVO[])models.toArray(new PriTrfBzcProgVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfBzcStsCd = this.trfBzcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.progUsrId = this.progUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfBzcProgSeq = this.trfBzcProgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.progDt = this.progDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.progOfcCd = this.progOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfNo = this.trfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trfPfxCd = this.trfPfxCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
