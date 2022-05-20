/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PsoFormulaVO.java
*@FileTitle : PsoFormulaVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.18
*@LastModifier : 박명종
*@LastVersion : 1.0
* 2009.06.18 박명종 
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
 * @author 박명종
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PsoFormulaVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PsoFormulaVO> models = new ArrayList<PsoFormulaVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String updMnuNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fomlNm = null;
	/* Column Info */
	private String fomlSysDesc = null;
	/* Column Info */
	private String fomlDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fomlNo = null;
	/* Column Info */
	private String psoFomlMzdCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PsoFormulaVO() {}

	public PsoFormulaVO(String ibflag, String pagerows, String fomlNo, String fomlNm, String psoFomlMzdCd, String fomlDesc, String fomlSysDesc, String updMnuNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.updMnuNo = updMnuNo;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.fomlNm = fomlNm;
		this.fomlSysDesc = fomlSysDesc;
		this.fomlDesc = fomlDesc;
		this.creDt = creDt;
		this.fomlNo = fomlNo;
		this.psoFomlMzdCd = psoFomlMzdCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("upd_mnu_no", getUpdMnuNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("foml_nm", getFomlNm());
		this.hashColumns.put("foml_sys_desc", getFomlSysDesc());
		this.hashColumns.put("foml_desc", getFomlDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("foml_no", getFomlNo());
		this.hashColumns.put("pso_foml_mzd_cd", getPsoFomlMzdCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("upd_mnu_no", "updMnuNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("foml_nm", "fomlNm");
		this.hashFields.put("foml_sys_desc", "fomlSysDesc");
		this.hashFields.put("foml_desc", "fomlDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("foml_no", "fomlNo");
		this.hashFields.put("pso_foml_mzd_cd", "psoFomlMzdCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return updMnuNo
	 */
	public String getUpdMnuNo() {
		return this.updMnuNo;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return fomlNm
	 */
	public String getFomlNm() {
		return this.fomlNm;
	}
	
	/**
	 * Column Info
	 * @return fomlSysDesc
	 */
	public String getFomlSysDesc() {
		return this.fomlSysDesc;
	}
	
	/**
	 * Column Info
	 * @return fomlDesc
	 */
	public String getFomlDesc() {
		return this.fomlDesc;
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
	 * @return fomlNo
	 */
	public String getFomlNo() {
		return this.fomlNo;
	}
	
	/**
	 * Column Info
	 * @return psoFomlMzdCd
	 */
	public String getPsoFomlMzdCd() {
		return this.psoFomlMzdCd;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param updMnuNo
	 */
	public void setUpdMnuNo(String updMnuNo) {
		this.updMnuNo = updMnuNo;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param fomlNm
	 */
	public void setFomlNm(String fomlNm) {
		this.fomlNm = fomlNm;
	}
	
	/**
	 * Column Info
	 * @param fomlSysDesc
	 */
	public void setFomlSysDesc(String fomlSysDesc) {
		this.fomlSysDesc = fomlSysDesc;
	}
	
	/**
	 * Column Info
	 * @param fomlDesc
	 */
	public void setFomlDesc(String fomlDesc) {
		this.fomlDesc = fomlDesc;
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
	 * @param fomlNo
	 */
	public void setFomlNo(String fomlNo) {
		this.fomlNo = fomlNo;
	}
	
	/**
	 * Column Info
	 * @param psoFomlMzdCd
	 */
	public void setPsoFomlMzdCd(String psoFomlMzdCd) {
		this.psoFomlMzdCd = psoFomlMzdCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setUpdMnuNo(JSPUtil.getParameter(request, "upd_mnu_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFomlNm(JSPUtil.getParameter(request, "foml_nm", ""));
		setFomlSysDesc(JSPUtil.getParameter(request, "foml_sys_desc", ""));
		setFomlDesc(JSPUtil.getParameter(request, "foml_desc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFomlNo(JSPUtil.getParameter(request, "foml_no", ""));
		setPsoFomlMzdCd(JSPUtil.getParameter(request, "pso_foml_mzd_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoFormulaVO[]
	 */
	public PsoFormulaVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoFormulaVO[]
	 */
	public PsoFormulaVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PsoFormulaVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] updMnuNo = (JSPUtil.getParameter(request, prefix	+ "upd_mnu_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] fomlNm = (JSPUtil.getParameter(request, prefix	+ "foml_nm".trim(), length));
			String[] fomlSysDesc = (JSPUtil.getParameter(request, prefix	+ "foml_sys_desc".trim(), length));
			String[] fomlDesc = (JSPUtil.getParameter(request, prefix	+ "foml_desc".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] fomlNo = (JSPUtil.getParameter(request, prefix	+ "foml_no".trim(), length));
			String[] psoFomlMzdCd = (JSPUtil.getParameter(request, prefix	+ "pso_foml_mzd_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PsoFormulaVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (updMnuNo[i] != null)
					model.setUpdMnuNo(updMnuNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fomlNm[i] != null)
					model.setFomlNm(fomlNm[i]);
				if (fomlSysDesc[i] != null)
					model.setFomlSysDesc(fomlSysDesc[i]);
				if (fomlDesc[i] != null)
					model.setFomlDesc(fomlDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fomlNo[i] != null)
					model.setFomlNo(fomlNo[i]);
				if (psoFomlMzdCd[i] != null)
					model.setPsoFomlMzdCd(psoFomlMzdCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPsoFormulaVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PsoFormulaVO[]
	 */
	public PsoFormulaVO[] getPsoFormulaVOs(){
		PsoFormulaVO[] vos = (PsoFormulaVO[])models.toArray(new PsoFormulaVO[models.size()]);
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
		this.updMnuNo = this.updMnuNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlNm = this.fomlNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlSysDesc = this.fomlSysDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlDesc = this.fomlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlNo = this.fomlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoFomlMzdCd = this.psoFomlMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
