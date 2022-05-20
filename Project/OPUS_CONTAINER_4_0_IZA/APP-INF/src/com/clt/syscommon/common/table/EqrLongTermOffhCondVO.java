/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrLongTermOffhCondVO.java
*@FileTitle : EqrLongTermOffhCondVO
*Open Issues :
*Change history :
* No.	Ver.		Modifier           			modifier date    explanation
* 1		1.0		Lee Byoung Hun		2009.07.10		1.0 최초 생성
*
*@LastModifyDate : 2009.07.10
*@LastModifier : Lee Byoung Hun
*@LastVersion : 1.0
* 2009.07.10  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrLongTermOffhCondVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrLongTermOffhCondVO> models = new ArrayList<EqrLongTermOffhCondVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ctrtSeq = null;
	/* Column Info */
	private String drygAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String avalOffhQty = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String ltofChgAmt = null;
	/* Column Info */
	private String ctrtOfcCtyCd = null;
	/* Column Info */
	private String drffChgCrAmt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrLongTermOffhCondVO() {}

	public EqrLongTermOffhCondVO(String ibflag, String pagerows, String eccCd, String ctrtOfcCtyCd, String ctrtSeq, String cntrTpszCd, String avalOffhQty, String ltofChgAmt, String drffChgCrAmt, String drygAmt, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.deltFlg = deltFlg;
		this.eccCd = eccCd;
		this.creDt = creDt;
		this.ctrtSeq = ctrtSeq;
		this.drygAmt = drygAmt;
		this.pagerows = pagerows;
		this.avalOffhQty = avalOffhQty;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.cntrTpszCd = cntrTpszCd;
		this.ltofChgAmt = ltofChgAmt;
		this.ctrtOfcCtyCd = ctrtOfcCtyCd;
		this.drffChgCrAmt = drffChgCrAmt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ctrt_seq", getCtrtSeq());
		this.hashColumns.put("dryg_amt", getDrygAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("aval_offh_qty", getAvalOffhQty());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("ltof_chg_amt", getLtofChgAmt());
		this.hashColumns.put("ctrt_ofc_cty_cd", getCtrtOfcCtyCd());
		this.hashColumns.put("drff_chg_cr_amt", getDrffChgCrAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ctrt_seq", "ctrtSeq");
		this.hashFields.put("dryg_amt", "drygAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("aval_offh_qty", "avalOffhQty");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("ltof_chg_amt", "ltofChgAmt");
		this.hashFields.put("ctrt_ofc_cty_cd", "ctrtOfcCtyCd");
		this.hashFields.put("drff_chg_cr_amt", "drffChgCrAmt");
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
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
	 * @return ctrtSeq
	 */
	public String getCtrtSeq() {
		return this.ctrtSeq;
	}
	
	/**
	 * Column Info
	 * @return drygAmt
	 */
	public String getDrygAmt() {
		return this.drygAmt;
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
	 * @return avalOffhQty
	 */
	public String getAvalOffhQty() {
		return this.avalOffhQty;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return ltofChgAmt
	 */
	public String getLtofChgAmt() {
		return this.ltofChgAmt;
	}
	
	/**
	 * Column Info
	 * @return ctrtOfcCtyCd
	 */
	public String getCtrtOfcCtyCd() {
		return this.ctrtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return drffChgCrAmt
	 */
	public String getDrffChgCrAmt() {
		return this.drffChgCrAmt;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
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
	 * @param ctrtSeq
	 */
	public void setCtrtSeq(String ctrtSeq) {
		this.ctrtSeq = ctrtSeq;
	}
	
	/**
	 * Column Info
	 * @param drygAmt
	 */
	public void setDrygAmt(String drygAmt) {
		this.drygAmt = drygAmt;
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
	 * @param avalOffhQty
	 */
	public void setAvalOffhQty(String avalOffhQty) {
		this.avalOffhQty = avalOffhQty;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param ltofChgAmt
	 */
	public void setLtofChgAmt(String ltofChgAmt) {
		this.ltofChgAmt = ltofChgAmt;
	}
	
	/**
	 * Column Info
	 * @param ctrtOfcCtyCd
	 */
	public void setCtrtOfcCtyCd(String ctrtOfcCtyCd) {
		this.ctrtOfcCtyCd = ctrtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param drffChgCrAmt
	 */
	public void setDrffChgCrAmt(String drffChgCrAmt) {
		this.drffChgCrAmt = drffChgCrAmt;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCtrtSeq(JSPUtil.getParameter(request, "ctrt_seq", ""));
		setDrygAmt(JSPUtil.getParameter(request, "dryg_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAvalOffhQty(JSPUtil.getParameter(request, "aval_offh_qty", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setLtofChgAmt(JSPUtil.getParameter(request, "ltof_chg_amt", ""));
		setCtrtOfcCtyCd(JSPUtil.getParameter(request, "ctrt_ofc_cty_cd", ""));
		setDrffChgCrAmt(JSPUtil.getParameter(request, "drff_chg_cr_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrLongTermOffhCondVO[]
	 */
	public EqrLongTermOffhCondVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrLongTermOffhCondVO[]
	 */
	public EqrLongTermOffhCondVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrLongTermOffhCondVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ctrtSeq = (JSPUtil.getParameter(request, prefix	+ "ctrt_seq", length));
			String[] drygAmt = (JSPUtil.getParameter(request, prefix	+ "dryg_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] avalOffhQty = (JSPUtil.getParameter(request, prefix	+ "aval_offh_qty", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] ltofChgAmt = (JSPUtil.getParameter(request, prefix	+ "ltof_chg_amt", length));
			String[] ctrtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cty_cd", length));
			String[] drffChgCrAmt = (JSPUtil.getParameter(request, prefix	+ "drff_chg_cr_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrLongTermOffhCondVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ctrtSeq[i] != null)
					model.setCtrtSeq(ctrtSeq[i]);
				if (drygAmt[i] != null)
					model.setDrygAmt(drygAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (avalOffhQty[i] != null)
					model.setAvalOffhQty(avalOffhQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (ltofChgAmt[i] != null)
					model.setLtofChgAmt(ltofChgAmt[i]);
				if (ctrtOfcCtyCd[i] != null)
					model.setCtrtOfcCtyCd(ctrtOfcCtyCd[i]);
				if (drffChgCrAmt[i] != null)
					model.setDrffChgCrAmt(drffChgCrAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrLongTermOffhCondVOs();
	}
	
	/**
	 * EES_EQR_0120 L/T Off-Hire 정보 조회/수정 화면에서 사용
	 * 
	 * @param request
	 * @param tpsztype
	 * @return
	 */
	public EqrLongTermOffhCondVO[] fromRequestGridArrayList(HttpServletRequest request, String tpsztype) {
		EqrLongTermOffhCondVO model = null;
		String[] prefix  			 = null;
		
		try {			
        	if(!"".equals(tpsztype)) {
        		prefix = tpsztype.split(",");
        	}
        	
        	int length = request.getParameterValues("ibflag").length;
        	
        	for(int k=0; k<prefix.length; k++) {
				String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag", length));
				String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows", length));
				String[] ecc_cd          =  (JSPUtil.getParameter(request, "ecc_cd", length));
				String[] seq             =  (JSPUtil.getParameter(request, "seq", length));
				String   cntr_tpsz_cd    =  prefix[k].toString();
				String[] aval_offh_qty   =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "aval_offh_qty", length));
				String[] ltof_chg_amt    =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "ltof_chg_amt", length));
				String[] drff_chg_cr_amt =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "drff_chg_cr_amt", length));
				String[] dryg_amt        =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "dryg_amt", length));
				String[] delt_flg        =  (JSPUtil.getParameter(request, "delt_flg", length));
				String[] cre_usr_id      =  (JSPUtil.getParameter(request, "cre_usr_id", length));
				String[] cre_dt          =  (JSPUtil.getParameter(request, "cre_dt", length));
				String[] upd_usr_id      =  (JSPUtil.getParameter(request, "upd_usr_id", length));
				String[] upd_dt          =  (JSPUtil.getParameter(request, "upd_dt", length));
				
				for (int i = 0; i < length; i++) {
					model = new EqrLongTermOffhCondVO();
					model.setIbflag         		  ( ibflag[i]);
					model.setPagerows      	 ( page_rows[i]);
					model.setEccCd         		  ( ecc_cd[i]);
					model.setCtrtOfcCtyCd        ( seq[i].substring(0, 3));
					model.setCtrtSeq            		  ( seq[i].substring(3, seq[i].length()));
					model.setCntrTpszCd   	( cntr_tpsz_cd);
					model.setAvalOffhQty  		  ( aval_offh_qty[i]);
					model.setLtofChgAmt   		  ( ltof_chg_amt[i]);
					model.setDrffChgCrAmt		  ( drff_chg_cr_amt[i]);
					model.setDrygAmt       		  ( dryg_amt[i]);
					model.setDeltFlg       		  ( delt_flg[i]);
					model.setCreUsrId     		  ( cre_usr_id[i]);
					model.setCreDt         		  ( cre_dt[i]);
					model.setUpdUsrId     		  ( upd_usr_id[i]);
					model.setUpdDt         		  ( upd_dt[i]);
					models.add(model);
				}
        	}
		} catch (Exception ex) {
			return null;
		}
		return getEqrLongTermOffhCondVOs();
	}	

	/**
	 * VO 배열을 반환
	 * @return EqrLongTermOffhCondVO[]
	 */
	public EqrLongTermOffhCondVO[] getEqrLongTermOffhCondVOs(){
		EqrLongTermOffhCondVO[] vos = (EqrLongTermOffhCondVO[])models.toArray(new EqrLongTermOffhCondVO[models.size()]);
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
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtSeq = this.ctrtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drygAmt = this.drygAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalOffhQty = this.avalOffhQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ltofChgAmt = this.ltofChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtOfcCtyCd = this.ctrtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drffChgCrAmt = this.drffChgCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
