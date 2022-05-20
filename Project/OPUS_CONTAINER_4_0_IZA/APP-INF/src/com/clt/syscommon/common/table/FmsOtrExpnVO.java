/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FmsOtrExpnVO.java
*@FileTitle : FmsOtrExpnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.13
*@LastModifier : 
*@LastVersion : 1.0
* 2009.02.13  
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
 * @author 
 * @since J2EE 1.5
 */

public class FmsOtrExpnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FmsOtrExpnVO> models = new ArrayList<FmsOtrExpnVO>();
	
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String currCd = null;
	/* Column Inpo */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String fletCtrtNo = null;
	/* Column Inpo */
	private String acctItmSeq = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String effDt = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String acctCd = null;
	/* Column Inpo */
	private String expDt = null;
	/* Column Inpo */
	private String otrExpnAmt = null;
	/* Column Inpo */
	private String updUsrId = null;
	
	/* Column Inpo */
	private String oriEffDt = null;
	/* Column Inpo */
	private String oriExpDt = null;
	
	/* Column Inpo */
	private String oriAcctCd = null;
	/* Column Inpo */
	private String oriAcctItmSeq = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FmsOtrExpnVO() {}

	public FmsOtrExpnVO(String ibflag, String pagerows, String fletCtrtNo, String acctCd, String acctItmSeq, String effDt, String expDt, String currCd, String otrExpnAmt, String creUsrId, String creDt, String updUsrId, String updDt, String oriEffDt, String oriExpDt, String oriAcctCd, String oriAcctItmSeq) {
		this.updDt = updDt;
		this.currCd = currCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.fletCtrtNo = fletCtrtNo;
		this.acctItmSeq = acctItmSeq;
		this.ibflag = ibflag;
		this.effDt = effDt;
		this.creUsrId = creUsrId;
		this.acctCd = acctCd;
		this.expDt = expDt;
		this.otrExpnAmt = otrExpnAmt;
		this.updUsrId = updUsrId;
		
		this.oriEffDt = oriEffDt;
		this.oriExpDt = oriExpDt;
		this.oriAcctCd = oriAcctCd;
		this.oriAcctItmSeq = oriAcctItmSeq;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("flet_ctrt_no", getFletCtrtNo());
		this.hashColumns.put("acct_itm_seq", getAcctItmSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("otr_expn_amt", getOtrExpnAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		
		this.hashColumns.put("ori_eff_dt", getOriEffDt());
		this.hashColumns.put("ori_exp_dt", getOriExpDt());
		this.hashColumns.put("ori_acct_cd", getOriAcctCd());
		this.hashColumns.put("ori_acct_itm_seq", getOriAcctItmSeq());
		
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("flet_ctrt_no", "fletCtrtNo");
		this.hashFields.put("acct_itm_seq", "acctItmSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("otr_expn_amt", "otrExpnAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		
		this.hashFields.put("ori_eff_dt", "oriEffDt");
		this.hashFields.put("ori_exp_dt", "oriExpDt");
		this.hashFields.put("ori_acct_cd", "oriAcctCd");
		this.hashFields.put("ori_acct_itm_seq", "oriAcctItmSeq");
		
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCurrCd() {
		return this.currCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getFletCtrtNo() {
		return this.fletCtrtNo;
	}
	public String getAcctItmSeq() {
		return this.acctItmSeq;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getEffDt() {
		return this.effDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getAcctCd() {
		return this.acctCd;
	}
	public String getExpDt() {
		return this.expDt;
	}
	public String getOtrExpnAmt() {
		return this.otrExpnAmt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	public String getOriEffDt() {
		return this.oriEffDt;
	}
	
	public String getOriExpDt() {
		return this.oriExpDt;
	}
	
	public String getOriAcctCd() {
		return this.oriAcctCd;
	}
	
	public String getOriAcctItmSeq() {
		return this.oriAcctItmSeq;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
		//this.currCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setFletCtrtNo(String fletCtrtNo) {
		this.fletCtrtNo = fletCtrtNo;
		//this.fletCtrtNo=true;
	}
	public void setAcctItmSeq(String acctItmSeq) {
		this.acctItmSeq = acctItmSeq;
		//this.acctItmSeq=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setEffDt(String effDt) {
		this.effDt = effDt;
		//this.effDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
		//this.acctCd=true;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
		//this.expDt=true;
	}
	public void setOtrExpnAmt(String otrExpnAmt) {
		this.otrExpnAmt = otrExpnAmt;
		//this.otrExpnAmt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	
	public void setOriEffDt(String oriEffDt) {
		this.oriEffDt = oriEffDt;
		//this.effDt=true;
	}
	
	public void setOriExpDt(String oriExpDt) {
		this.oriExpDt = oriExpDt;
		//this.effDt=true;
	}
	
	public void setOriAcctCd(String oriAcctCd) {
		this.oriAcctCd = oriAcctCd;
		//this.effDt=true;
	}
	
	public void setOriAcctItmSeq(String oriAcctItmSeq) {
		this.oriAcctItmSeq = oriAcctItmSeq;
		//this.effDt=true;
	}
	
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFletCtrtNo(JSPUtil.getParameter(request, "flet_ctrt_no", ""));
		setAcctItmSeq(JSPUtil.getParameter(request, "acct_itm_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setOtrExpnAmt(JSPUtil.getParameter(request, "otr_expn_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		
		setOriEffDt(JSPUtil.getParameter(request, "ori_eff_dt", ""));
		setOriExpDt(JSPUtil.getParameter(request, "ori_exp_dt", ""));
		setOriAcctCd(JSPUtil.getParameter(request, "ori_acct_cd", ""));
		setOriAcctItmSeq(JSPUtil.getParameter(request, "ori_acct_itm_seq", ""));
	}

	public FmsOtrExpnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public FmsOtrExpnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		FmsOtrExpnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] fletCtrtNo = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_no".trim(), length));
			String[] acctItmSeq = (JSPUtil.getParameter(request, prefix	+ "acct_itm_seq".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd".trim(), length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt".trim(), length));
			String[] otrExpnAmt = (JSPUtil.getParameter(request, prefix	+ "otr_expn_amt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			String[] oriEffDt = (JSPUtil.getParameter(request, prefix	+ "ori_eff_dt".trim(), length));
			String[] oriExpDt = (JSPUtil.getParameter(request, prefix	+ "ori_exp_dt".trim(), length));
			String[] oriAcctCd = (JSPUtil.getParameter(request, prefix	+ "ori_acct_cd".trim(), length));
			String[] oriAcctItmSeq = (JSPUtil.getParameter(request, prefix	+ "ori_acct_itm_seq".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new FmsOtrExpnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fletCtrtNo[i] != null)
					model.setFletCtrtNo(fletCtrtNo[i]);
				if (acctItmSeq[i] != null)
					model.setAcctItmSeq(acctItmSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (otrExpnAmt[i] != null)
					model.setOtrExpnAmt(otrExpnAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				
				if (oriEffDt[i] != null)
					model.setOriEffDt(oriEffDt[i]);
				
				if (oriExpDt[i] != null)
					model.setOriExpDt(oriExpDt[i]);
				
				if (oriAcctCd[i] != null)
					model.setOriAcctCd(oriAcctCd[i]);
				
				if (oriAcctItmSeq[i] != null)
					model.setOriAcctItmSeq(oriAcctItmSeq[i]);
				
				models.add(model);
			}

		} catch (Exception e) {}
		return getFmsOtrExpnVOs();
	}

	public FmsOtrExpnVO[] getFmsOtrExpnVOs(){
		FmsOtrExpnVO[] vos = (FmsOtrExpnVO[])models.toArray(new FmsOtrExpnVO[models.size()]);
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

}
