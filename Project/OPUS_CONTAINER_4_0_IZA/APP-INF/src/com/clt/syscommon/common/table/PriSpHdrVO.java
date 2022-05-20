/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSpHdrVO.java
*@FileTitle : PriSpHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.15
*@LastModifier : 문동규
*@LastVersion : 1.0
* 2009.07.15 문동규 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 문동규
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriSpHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriSpHdrVO> models = new ArrayList<PriSpHdrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String propPrprFlg = null;
	/* Column Info */
	private String prcPropCreTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String orgPropNo = null;
	/* Column Info */
	private String propNo = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String orgAmdtSeq = null;
	/* Column Info */
	private String prcMstPropTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String lgcyPrfFlg = null;
	/* Column Info */
	private String lgcyAmdtSeq = null;
	/* Column Info */
	private String rdyFlg = null;
	/* Column Info */
	private String ctrtSrcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriSpHdrVO() {}

	public PriSpHdrVO(String ibflag, String pagerows, String propNo, String scNo, String prcPropCreTpCd, String propPrprFlg, String orgPropNo, String orgAmdtSeq, String creUsrId, String creDt, String updUsrId, String updDt, String prcMstPropTpCd, String lgcyPrfFlg, String lgcyAmdtSeq, String rdyFlg, String ctrtSrcCd) {
		this.updDt = updDt;
		this.creDt = creDt;
		this.propPrprFlg = propPrprFlg;
		this.prcPropCreTpCd = prcPropCreTpCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.orgPropNo = orgPropNo;
		this.propNo = propNo;
		this.scNo = scNo;
		this.orgAmdtSeq = orgAmdtSeq;
		this.prcMstPropTpCd = prcMstPropTpCd;
		this.updUsrId = updUsrId;
		this.lgcyPrfFlg = lgcyPrfFlg;
		this.lgcyAmdtSeq = lgcyAmdtSeq;
		this.rdyFlg = rdyFlg;
		this.ctrtSrcCd = ctrtSrcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prop_prpr_flg", getPropPrprFlg());
		this.hashColumns.put("prc_prop_cre_tp_cd", getPrcPropCreTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("org_prop_no", getOrgPropNo());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("org_amdt_seq", getOrgAmdtSeq());
		this.hashColumns.put("prc_mst_prop_tp_cd", getPrcMstPropTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("lgcy_prf_flg", getLgcyPrfFlg());
		this.hashColumns.put("lgcy_amdt_seq", getLgcyAmdtSeq());
		this.hashColumns.put("rdy_flg", getRdyFlg());
		this.hashColumns.put("ctrt_src_cd", getCtrtSrcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prop_prpr_flg", "propPrprFlg");
		this.hashFields.put("prc_prop_cre_tp_cd", "prcPropCreTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("org_prop_no", "orgPropNo");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("org_amdt_seq", "orgAmdtSeq");
		this.hashFields.put("prc_mst_prop_tp_cd", "prcMstPropTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("lgcy_prf_flg", "lgcyPrfFlg");
		this.hashFields.put("lgcy_amdt_seq", "lgcyAmdtSeq");
		this.hashFields.put("rdy_flg", "rdyFlg");
		this.hashFields.put("ctrt_src_cd", "ctrtSrcCd");
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return propPrprFlg
	 */
	public String getPropPrprFlg() {
		return this.propPrprFlg;
	}
	
	/**
	 * Column Info
	 * @return prcPropCreTpCd
	 */
	public String getPrcPropCreTpCd() {
		return this.prcPropCreTpCd;
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
	 * @return orgPropNo
	 */
	public String getOrgPropNo() {
		return this.orgPropNo;
	}
	
	/**
	 * Column Info
	 * @return propNo
	 */
	public String getPropNo() {
		return this.propNo;
	}
	
	/**
	 * Column Info
	 * @return scNo
	 */
	public String getScNo() {
		return this.scNo;
	}
	
	/**
	 * Column Info
	 * @return orgAmdtSeq
	 */
	public String getOrgAmdtSeq() {
		return this.orgAmdtSeq;
	}
	
	/**
	 * Column Info
	 * @return prcMstPropTpCd
	 */
	public String getPrcMstPropTpCd() {
		return this.prcMstPropTpCd;
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
	 * @return lgcyPrfFlg
	 */
	public String getLgcyPrfFlg() {
		return this.lgcyPrfFlg;
	}
	
	/**
	 * Column Info
	 * @return lgcyAmdtSeq
	 */
	public String getLgcyAmdtSeq() {
		return this.lgcyAmdtSeq;
	}
	
	/**
	 * Column Info
	 * @return rdyFlg
	 */
	public String getRdyFlg() {
		return this.rdyFlg;
	}
	
	/**
	 * Column Info
	 * @return ctrtSrcCd
	 */
	public String getCtrtSrcCd() {
		return this.ctrtSrcCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param propPrprFlg
	 */
	public void setPropPrprFlg(String propPrprFlg) {
		this.propPrprFlg = propPrprFlg;
	}
	
	/**
	 * Column Info
	 * @param prcPropCreTpCd
	 */
	public void setPrcPropCreTpCd(String prcPropCreTpCd) {
		this.prcPropCreTpCd = prcPropCreTpCd;
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
	 * @param orgPropNo
	 */
	public void setOrgPropNo(String orgPropNo) {
		this.orgPropNo = orgPropNo;
	}
	
	/**
	 * Column Info
	 * @param propNo
	 */
	public void setPropNo(String propNo) {
		this.propNo = propNo;
	}
	
	/**
	 * Column Info
	 * @param scNo
	 */
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	
	/**
	 * Column Info
	 * @param orgAmdtSeq
	 */
	public void setOrgAmdtSeq(String orgAmdtSeq) {
		this.orgAmdtSeq = orgAmdtSeq;
	}
	
	/**
	 * Column Info
	 * @param prcMstPropTpCd
	 */
	public void setPrcMstPropTpCd(String prcMstPropTpCd) {
		this.prcMstPropTpCd = prcMstPropTpCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param lgcyPrfFlg
	 */
	public void setLgcyPrfFlg(String lgcyPrfFlg) {
		this.lgcyPrfFlg = lgcyPrfFlg;
	}
	
	/**
	 * Column Info
	 * @param lgcyAmdtSeq
	 */
	public void setLgcyAmdtSeq(String lgcyAmdtSeq) {
		this.lgcyAmdtSeq = lgcyAmdtSeq;
	}
	
	/**
	 * Column Info
	 * @param rdyFlg
	 */
	public void setRdyFlg(String rdyFlg) {
		this.rdyFlg = rdyFlg;
	}
	
	/**
	 * Column Info
	 * @param ctrtSrcCd
	 */
	public void setCtrtSrcCd(String ctrtSrcCd) {
		this.ctrtSrcCd = ctrtSrcCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPropPrprFlg(JSPUtil.getParameter(request, "prop_prpr_flg", ""));
		setPrcPropCreTpCd(JSPUtil.getParameter(request, "prc_prop_cre_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setOrgPropNo(JSPUtil.getParameter(request, "org_prop_no", ""));
		setPropNo(JSPUtil.getParameter(request, "prop_no", ""));
		setScNo(JSPUtil.getParameter(request, "sc_no", ""));
		setOrgAmdtSeq(JSPUtil.getParameter(request, "org_amdt_seq", ""));
		setPrcMstPropTpCd(JSPUtil.getParameter(request, "prc_mst_prop_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setLgcyPrfFlg(JSPUtil.getParameter(request, "lgcy_prf_flg", ""));
		setLgcyAmdtSeq(JSPUtil.getParameter(request, "lgcy_amdt_seq", ""));
		setRdyFlg(JSPUtil.getParameter(request, "rdy_flg", ""));
		setCtrtSrcCd(JSPUtil.getParameter(request, "ctrt_src_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriSpHdrVO[]
	 */
	public PriSpHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriSpHdrVO[]
	 */
	public PriSpHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriSpHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] propPrprFlg = (JSPUtil.getParameter(request, prefix	+ "prop_prpr_flg", length));
			String[] prcPropCreTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_prop_cre_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] orgPropNo = (JSPUtil.getParameter(request, prefix	+ "org_prop_no", length));
			String[] propNo = (JSPUtil.getParameter(request, prefix	+ "prop_no", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] orgAmdtSeq = (JSPUtil.getParameter(request, prefix	+ "org_amdt_seq", length));
			String[] prcMstPropTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_mst_prop_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] lgcyPrfFlg = (JSPUtil.getParameter(request, prefix	+ "lgcy_prf_flg", length));
			String[] lgcyAmdtSeq = (JSPUtil.getParameter(request, prefix	+ "lgcy_amdt_seq", length));
			String[] rdyFlg = (JSPUtil.getParameter(request, prefix	+ "rdy_flg", length));
			String[] ctrtSrcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_src_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriSpHdrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (propPrprFlg[i] != null)
					model.setPropPrprFlg(propPrprFlg[i]);
				if (prcPropCreTpCd[i] != null)
					model.setPrcPropCreTpCd(prcPropCreTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (orgPropNo[i] != null)
					model.setOrgPropNo(orgPropNo[i]);
				if (propNo[i] != null)
					model.setPropNo(propNo[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (orgAmdtSeq[i] != null)
					model.setOrgAmdtSeq(orgAmdtSeq[i]);
				if (prcMstPropTpCd[i] != null)
					model.setPrcMstPropTpCd(prcMstPropTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (lgcyPrfFlg[i] != null)
					model.setLgcyPrfFlg(lgcyPrfFlg[i]);
				if (lgcyAmdtSeq[i] != null)
					model.setLgcyAmdtSeq(lgcyAmdtSeq[i]);
				if (rdyFlg[i] != null)
					model.setRdyFlg(rdyFlg[i]);
				if (ctrtSrcCd[i] != null)
					model.setCtrtSrcCd(ctrtSrcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriSpHdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriSpHdrVO[]
	 */
	public PriSpHdrVO[] getPriSpHdrVOs(){
		PriSpHdrVO[] vos = (PriSpHdrVO[])models.toArray(new PriSpHdrVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propPrprFlg = this.propPrprFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcPropCreTpCd = this.prcPropCreTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgPropNo = this.orgPropNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo = this.propNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgAmdtSeq = this.orgAmdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcMstPropTpCd = this.prcMstPropTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgcyPrfFlg = this.lgcyPrfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgcyAmdtSeq = this.lgcyAmdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdyFlg = this.rdyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtSrcCd = this.ctrtSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
