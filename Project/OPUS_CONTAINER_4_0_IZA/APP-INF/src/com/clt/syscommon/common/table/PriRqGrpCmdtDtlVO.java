/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriRqGrpCmdtDtlVO.java
*@FileTitle : PriRqGrpCmdtDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.02
*@LastModifier : 이승준
*@LastVersion : 1.0
* 2009.09.02 이승준 
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
 * @author 이승준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriRqGrpCmdtDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriRqGrpCmdtDtlVO> models = new ArrayList<PriRqGrpCmdtDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String srcInfoCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String grpCmdtDtlSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String qttnNo = null;
	/* Column Info */
	private String qttnVerNo = null;
	/* Column Info */
	private String prcCmdtTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String grpCmdtSeq = null;
	/* Column Info */
	private String prcCmdtDefCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriRqGrpCmdtDtlVO() {}

	public PriRqGrpCmdtDtlVO(String ibflag, String pagerows, String qttnNo, String qttnVerNo, String grpCmdtSeq, String grpCmdtDtlSeq, String prcCmdtTpCd, String prcCmdtDefCd, String srcInfoCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.srcInfoCd = srcInfoCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.grpCmdtDtlSeq = grpCmdtDtlSeq;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.qttnNo = qttnNo;
		this.qttnVerNo = qttnVerNo;
		this.prcCmdtTpCd = prcCmdtTpCd;
		this.updUsrId = updUsrId;
		this.grpCmdtSeq = grpCmdtSeq;
		this.prcCmdtDefCd = prcCmdtDefCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("src_info_cd", getSrcInfoCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("grp_cmdt_dtl_seq", getGrpCmdtDtlSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("qttn_no", getQttnNo());
		this.hashColumns.put("qttn_ver_no", getQttnVerNo());
		this.hashColumns.put("prc_cmdt_tp_cd", getPrcCmdtTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("grp_cmdt_seq", getGrpCmdtSeq());
		this.hashColumns.put("prc_cmdt_def_cd", getPrcCmdtDefCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("src_info_cd", "srcInfoCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("grp_cmdt_dtl_seq", "grpCmdtDtlSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("qttn_no", "qttnNo");
		this.hashFields.put("qttn_ver_no", "qttnVerNo");
		this.hashFields.put("prc_cmdt_tp_cd", "prcCmdtTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("grp_cmdt_seq", "grpCmdtSeq");
		this.hashFields.put("prc_cmdt_def_cd", "prcCmdtDefCd");
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
	 * @return srcInfoCd
	 */
	public String getSrcInfoCd() {
		return this.srcInfoCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return grpCmdtDtlSeq
	 */
	public String getGrpCmdtDtlSeq() {
		return this.grpCmdtDtlSeq;
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
	 * @return qttnNo
	 */
	public String getQttnNo() {
		return this.qttnNo;
	}
	
	/**
	 * Column Info
	 * @return qttnVerNo
	 */
	public String getQttnVerNo() {
		return this.qttnVerNo;
	}
	
	/**
	 * Column Info
	 * @return prcCmdtTpCd
	 */
	public String getPrcCmdtTpCd() {
		return this.prcCmdtTpCd;
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
	 * @return grpCmdtSeq
	 */
	public String getGrpCmdtSeq() {
		return this.grpCmdtSeq;
	}
	
	/**
	 * Column Info
	 * @return prcCmdtDefCd
	 */
	public String getPrcCmdtDefCd() {
		return this.prcCmdtDefCd;
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
	 * @param srcInfoCd
	 */
	public void setSrcInfoCd(String srcInfoCd) {
		this.srcInfoCd = srcInfoCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param grpCmdtDtlSeq
	 */
	public void setGrpCmdtDtlSeq(String grpCmdtDtlSeq) {
		this.grpCmdtDtlSeq = grpCmdtDtlSeq;
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
	 * @param qttnNo
	 */
	public void setQttnNo(String qttnNo) {
		this.qttnNo = qttnNo;
	}
	
	/**
	 * Column Info
	 * @param qttnVerNo
	 */
	public void setQttnVerNo(String qttnVerNo) {
		this.qttnVerNo = qttnVerNo;
	}
	
	/**
	 * Column Info
	 * @param prcCmdtTpCd
	 */
	public void setPrcCmdtTpCd(String prcCmdtTpCd) {
		this.prcCmdtTpCd = prcCmdtTpCd;
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
	 * @param grpCmdtSeq
	 */
	public void setGrpCmdtSeq(String grpCmdtSeq) {
		this.grpCmdtSeq = grpCmdtSeq;
	}
	
	/**
	 * Column Info
	 * @param prcCmdtDefCd
	 */
	public void setPrcCmdtDefCd(String prcCmdtDefCd) {
		this.prcCmdtDefCd = prcCmdtDefCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSrcInfoCd(JSPUtil.getParameter(request, "src_info_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setGrpCmdtDtlSeq(JSPUtil.getParameter(request, "grp_cmdt_dtl_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setQttnNo(JSPUtil.getParameter(request, "qttn_no", ""));
		setQttnVerNo(JSPUtil.getParameter(request, "qttn_ver_no", ""));
		setPrcCmdtTpCd(JSPUtil.getParameter(request, "prc_cmdt_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setGrpCmdtSeq(JSPUtil.getParameter(request, "grp_cmdt_seq", ""));
		setPrcCmdtDefCd(JSPUtil.getParameter(request, "prc_cmdt_def_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriRqGrpCmdtDtlVO[]
	 */
	public PriRqGrpCmdtDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriRqGrpCmdtDtlVO[]
	 */
	public PriRqGrpCmdtDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriRqGrpCmdtDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] srcInfoCd = (JSPUtil.getParameter(request, prefix	+ "src_info_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] grpCmdtDtlSeq = (JSPUtil.getParameter(request, prefix	+ "grp_cmdt_dtl_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] qttnNo = (JSPUtil.getParameter(request, prefix	+ "qttn_no", length));
			String[] qttnVerNo = (JSPUtil.getParameter(request, prefix	+ "qttn_ver_no", length));
			String[] prcCmdtTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_cmdt_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] grpCmdtSeq = (JSPUtil.getParameter(request, prefix	+ "grp_cmdt_seq", length));
			String[] prcCmdtDefCd = (JSPUtil.getParameter(request, prefix	+ "prc_cmdt_def_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriRqGrpCmdtDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (srcInfoCd[i] != null)
					model.setSrcInfoCd(srcInfoCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (grpCmdtDtlSeq[i] != null)
					model.setGrpCmdtDtlSeq(grpCmdtDtlSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (qttnNo[i] != null)
					model.setQttnNo(qttnNo[i]);
				if (qttnVerNo[i] != null)
					model.setQttnVerNo(qttnVerNo[i]);
				if (prcCmdtTpCd[i] != null)
					model.setPrcCmdtTpCd(prcCmdtTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (grpCmdtSeq[i] != null)
					model.setGrpCmdtSeq(grpCmdtSeq[i]);
				if (prcCmdtDefCd[i] != null)
					model.setPrcCmdtDefCd(prcCmdtDefCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriRqGrpCmdtDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriRqGrpCmdtDtlVO[]
	 */
	public PriRqGrpCmdtDtlVO[] getPriRqGrpCmdtDtlVOs(){
		PriRqGrpCmdtDtlVO[] vos = (PriRqGrpCmdtDtlVO[])models.toArray(new PriRqGrpCmdtDtlVO[models.size()]);
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
		this.srcInfoCd = this.srcInfoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grpCmdtDtlSeq = this.grpCmdtDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qttnNo = this.qttnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qttnVerNo = this.qttnVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCmdtTpCd = this.prcCmdtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grpCmdtSeq = this.grpCmdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCmdtDefCd = this.prcCmdtDefCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
