/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgHamoTrfVO.java
*@FileTitle : BkgHamoTrfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 김기종
*@LastVersion : 1.0
* 2009.07.28 김기종 
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
 * @author 김기종
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgHamoTrfVO extends AbstractValueObject { 

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgHamoTrfVO> models = new ArrayList<BkgHamoTrfVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String hamoTrfCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String hamoCdDesc = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fdaDeclFlg = null;
	/* Column Info */
	private String hamoCateCtnt = null;
	/* Column Info */
	private String hamoTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;  //추가
	/* Column Info */
	private String expDt = null;  //추가
	/* Column Info */
	private String hamoTrfCdSeq = null;  //추가
	/* Column Info */
	private String effDt = null;  //추가
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgHamoTrfVO() {}

	public BkgHamoTrfVO(String ofcCd, String ibflag, String pagerows, String hamoTpCd, String hamoTrfCd, String hamoCdDesc, String hamoCateCtnt, String fdaDeclFlg, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String expDt, String hamoTrfCdSeq, String effDt) {
		this.updDt = updDt;
		this.hamoTrfCd = hamoTrfCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.hamoCdDesc = hamoCdDesc;
		this.updUsrId = updUsrId;
		this.fdaDeclFlg = fdaDeclFlg;
		this.hamoCateCtnt = hamoCateCtnt;
		this.hamoTpCd = hamoTpCd;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd; //추가 
		this.expDt = expDt;
		this.hamoTrfCdSeq = hamoTrfCdSeq;
		this.effDt = effDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("hamo_trf_cd", getHamoTrfCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("hamo_cd_desc", getHamoCdDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("fda_decl_flg", getFdaDeclFlg());
		this.hashColumns.put("hamo_cate_ctnt", getHamoCateCtnt());
		this.hashColumns.put("hamo_tp_cd", getHamoTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());//추가
		this.hashColumns.put("exp_dt", getExpDt());//추가
		this.hashColumns.put("hamo_trf_cd_seq", getHamoTrfCdSeq());//추가
		this.hashColumns.put("eff_dt", getEffDt());//추가
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("hamo_trf_cd", "hamoTrfCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("hamo_cd_desc", "hamoCdDesc");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("fda_decl_flg", "fdaDeclFlg");
		this.hashFields.put("hamo_cate_ctnt", "hamoCateCtnt");
		this.hashFields.put("hamo_tp_cd", "hamoTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");//추가
		this.hashFields.put("exp_dt", "expDt");//추가
		this.hashFields.put("hamo_trf_cd_seq", "hamoTrfCdSeq");//추가
		this.hashFields.put("eff_dt", "effDt");//추가
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
	 * @return hamoTrfCd
	 */
	public String getHamoTrfCd() {
		return this.hamoTrfCd;
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
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
	 * @return hamoCdDesc
	 */
	public String getHamoCdDesc() {
		return this.hamoCdDesc;
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
	 * @return fdaDeclFlg
	 */
	public String getFdaDeclFlg() {
		return this.fdaDeclFlg;
	}
	
	/**
	 * Column Info
	 * @return hamoCateCtnt
	 */
	public String getHamoCateCtnt() {
		return this.hamoCateCtnt;
	}
	
	/**
	 * Column Info
	 * @return hamoTpCd
	 */
	public String getHamoTpCd() {
		return this.hamoTpCd;
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
	 * @return ofcCd
	 */                        //추가
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return expDt
	 */                        //추가
	public String getExpDt() {
		return this.expDt;
	}

	/**
	 * Column Info
	 * @return hamoTrfCdSeq
	 */                        //추가
	public String getHamoTrfCdSeq() {
		return this.hamoTrfCdSeq;
	}
	
	/**
	 * Column Info
	 * @return effDt
	 */                        //추가
	public String getEffDt() {
		return this.effDt;
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
	 * @param hamoTrfCd
	 */
	public void setHamoTrfCd(String hamoTrfCd) {
		this.hamoTrfCd = hamoTrfCd;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param hamoCdDesc
	 */
	public void setHamoCdDesc(String hamoCdDesc) {
		this.hamoCdDesc = hamoCdDesc;
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
	 * @param fdaDeclFlg
	 */
	public void setFdaDeclFlg(String fdaDeclFlg) {
		this.fdaDeclFlg = fdaDeclFlg;
	}
	
	/**
	 * Column Info
	 * @param hamoCateCtnt
	 */
	public void setHamoCateCtnt(String hamoCateCtnt) {
		this.hamoCateCtnt = hamoCateCtnt;
	}
	
	/**
	 * Column Info
	 * @param hamoTpCd
	 */
	public void setHamoTpCd(String hamoTpCd) {
		this.hamoTpCd = hamoTpCd;
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
	 * @param ofcCd
	 */ 									//추가
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param expDt
	 */ 									//추가
	public void setExpDt(String expDt) {
		this.expDt = expDt;
	}
	
	/**
	 * Column Info
	 * @param hamoTrfCdSeq
	 */ 									//추가
	public void setHamoTrfCdSeq(String hamoTrfCdSeq) {
		this.hamoTrfCdSeq = hamoTrfCdSeq;
	}
	
	/**
	 * Column Info
	 * @param effDt
	 */ 									//추가
	public void setEffDt(String effDt) {
		this.effDt = effDt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setHamoTrfCd(JSPUtil.getParameter(request, "hamo_trf_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setHamoCdDesc(JSPUtil.getParameter(request, "hamo_cd_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFdaDeclFlg(JSPUtil.getParameter(request, "fda_decl_flg", ""));
		setHamoCateCtnt(JSPUtil.getParameter(request, "hamo_cate_ctnt", ""));
		setHamoTpCd(JSPUtil.getParameter(request, "hamo_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));					//추가
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));					//추가
		setHamoTrfCdSeq(JSPUtil.getParameter(request, "hamo_trf_cd_seq", ""));					//추가
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));					//추가
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgHamoTrfVO[]
	 */
	public BkgHamoTrfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgHamoTrfVO[]
	 */
	public BkgHamoTrfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgHamoTrfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] hamoTrfCd = (JSPUtil.getParameter(request, prefix	+ "hamo_trf_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] hamoCdDesc = (JSPUtil.getParameter(request, prefix	+ "hamo_cd_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] fdaDeclFlg = (JSPUtil.getParameter(request, prefix	+ "fda_decl_flg", length));
			String[] hamoCateCtnt = (JSPUtil.getParameter(request, prefix	+ "hamo_cate_ctnt", length));
			String[] hamoTpCd = (JSPUtil.getParameter(request, prefix	+ "hamo_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));			//추가
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt", length));			//추가
			String[] hamoTrfCdSeq = (JSPUtil.getParameter(request, prefix	+ "hamo_trf_cd_seq", length));			//추가
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt", length));			//추가
			
			for (int i = 0; i < length; i++) {
				model = new BkgHamoTrfVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (hamoTrfCd[i] != null)
					model.setHamoTrfCd(hamoTrfCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (hamoCdDesc[i] != null)
					model.setHamoCdDesc(hamoCdDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fdaDeclFlg[i] != null)
					model.setFdaDeclFlg(fdaDeclFlg[i]);
				if (hamoCateCtnt[i] != null)
					model.setHamoCateCtnt(hamoCateCtnt[i]);
				if (hamoTpCd[i] != null)
					model.setHamoTpCd(hamoTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);		//추가
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);		//추가
				if (hamoTrfCdSeq[i] != null)
					model.setHamoTrfCdSeq(hamoTrfCdSeq[i]);		//추가
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);		//추가
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgHamoTrfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgHamoTrfVO[]
	 */
	public BkgHamoTrfVO[] getBkgHamoTrfVOs(){
		BkgHamoTrfVO[] vos = (BkgHamoTrfVO[])models.toArray(new BkgHamoTrfVO[models.size()]);
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
		this.hamoTrfCd = this.hamoTrfCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hamoCdDesc = this.hamoCdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdaDeclFlg = this.fdaDeclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hamoCateCtnt = this.hamoCateCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hamoTpCd = this.hamoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");    //추가
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");    //추가
		this.hamoTrfCdSeq = this.hamoTrfCdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");    //추가
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");    //추가
	}
}
