/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesTmlAgmtAplyDyVO.java
*@FileTitle : TesTmlAgmtAplyDyVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2009.09.25 yOng hO lEE 
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
 * @author yOng hO lEE
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesTmlAgmtAplyDyVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesTmlAgmtAplyDyVO> models = new ArrayList<TesTmlAgmtAplyDyVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String satFlg = null;
	/* Column Info */
	private String tmlAgmtOfcCtyCd = null;
	/* Column Info */
	private String tmlRtDyAplyTpCd = null;
	/* Column Info */
	private String sunFlg = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tmlAgmtVerNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String tmlAgmtSeq = null;
	/* Column Info */
	private String tmlAgmtDtlSeq = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String holFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String wkdyFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesTmlAgmtAplyDyVO() {}

	public TesTmlAgmtAplyDyVO(String ibflag, String pagerows, String tmlAgmtOfcCtyCd, String tmlAgmtSeq, String tmlAgmtVerNo, String tmlAgmtDtlSeq, String tmlRtDyAplyTpCd, String wkdyFlg, String satFlg, String sunFlg, String holFlg, String creUsrId, String creDt, String updUsrId, String updDt, String loclCreDt, String loclUpdDt) {
		this.updDt = updDt;
		this.satFlg = satFlg;
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
		this.tmlRtDyAplyTpCd = tmlRtDyAplyTpCd;
		this.sunFlg = sunFlg;
		this.loclCreDt = loclCreDt;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.tmlAgmtVerNo = tmlAgmtVerNo;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.tmlAgmtSeq = tmlAgmtSeq;
		this.tmlAgmtDtlSeq = tmlAgmtDtlSeq;
		this.loclUpdDt = loclUpdDt;
		this.holFlg = holFlg;
		this.updUsrId = updUsrId;
		this.wkdyFlg = wkdyFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("sat_flg", getSatFlg());
		this.hashColumns.put("tml_agmt_ofc_cty_cd", getTmlAgmtOfcCtyCd());
		this.hashColumns.put("tml_rt_dy_aply_tp_cd", getTmlRtDyAplyTpCd());
		this.hashColumns.put("sun_flg", getSunFlg());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tml_agmt_ver_no", getTmlAgmtVerNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("tml_agmt_seq", getTmlAgmtSeq());
		this.hashColumns.put("tml_agmt_dtl_seq", getTmlAgmtDtlSeq());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("hol_flg", getHolFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("wkdy_flg", getWkdyFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("sat_flg", "satFlg");
		this.hashFields.put("tml_agmt_ofc_cty_cd", "tmlAgmtOfcCtyCd");
		this.hashFields.put("tml_rt_dy_aply_tp_cd", "tmlRtDyAplyTpCd");
		this.hashFields.put("sun_flg", "sunFlg");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tml_agmt_ver_no", "tmlAgmtVerNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("tml_agmt_seq", "tmlAgmtSeq");
		this.hashFields.put("tml_agmt_dtl_seq", "tmlAgmtDtlSeq");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("hol_flg", "holFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("wkdy_flg", "wkdyFlg");
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
	 * @return satFlg
	 */
	public String getSatFlg() {
		return this.satFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtOfcCtyCd
	 */
	public String getTmlAgmtOfcCtyCd() {
		return this.tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return tmlRtDyAplyTpCd
	 */
	public String getTmlRtDyAplyTpCd() {
		return this.tmlRtDyAplyTpCd;
	}
	
	/**
	 * Column Info
	 * @return sunFlg
	 */
	public String getSunFlg() {
		return this.sunFlg;
	}
	
	/**
	 * Column Info
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
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
	 * @return tmlAgmtVerNo
	 */
	public String getTmlAgmtVerNo() {
		return this.tmlAgmtVerNo;
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
	 * @return tmlAgmtSeq
	 */
	public String getTmlAgmtSeq() {
		return this.tmlAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtDtlSeq
	 */
	public String getTmlAgmtDtlSeq() {
		return this.tmlAgmtDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @return holFlg
	 */
	public String getHolFlg() {
		return this.holFlg;
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
	 * @return wkdyFlg
	 */
	public String getWkdyFlg() {
		return this.wkdyFlg;
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
	 * @param satFlg
	 */
	public void setSatFlg(String satFlg) {
		this.satFlg = satFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtOfcCtyCd
	 */
	public void setTmlAgmtOfcCtyCd(String tmlAgmtOfcCtyCd) {
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param tmlRtDyAplyTpCd
	 */
	public void setTmlRtDyAplyTpCd(String tmlRtDyAplyTpCd) {
		this.tmlRtDyAplyTpCd = tmlRtDyAplyTpCd;
	}
	
	/**
	 * Column Info
	 * @param sunFlg
	 */
	public void setSunFlg(String sunFlg) {
		this.sunFlg = sunFlg;
	}
	
	/**
	 * Column Info
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
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
	 * @param tmlAgmtVerNo
	 */
	public void setTmlAgmtVerNo(String tmlAgmtVerNo) {
		this.tmlAgmtVerNo = tmlAgmtVerNo;
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
	 * @param tmlAgmtSeq
	 */
	public void setTmlAgmtSeq(String tmlAgmtSeq) {
		this.tmlAgmtSeq = tmlAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtDtlSeq
	 */
	public void setTmlAgmtDtlSeq(String tmlAgmtDtlSeq) {
		this.tmlAgmtDtlSeq = tmlAgmtDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @param holFlg
	 */
	public void setHolFlg(String holFlg) {
		this.holFlg = holFlg;
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
	 * @param wkdyFlg
	 */
	public void setWkdyFlg(String wkdyFlg) {
		this.wkdyFlg = wkdyFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSatFlg(JSPUtil.getParameter(request, "sat_flg", ""));
		setTmlAgmtOfcCtyCd(JSPUtil.getParameter(request, "tml_agmt_ofc_cty_cd", ""));
		setTmlRtDyAplyTpCd(JSPUtil.getParameter(request, "tml_rt_dy_aply_tp_cd", ""));
		setSunFlg(JSPUtil.getParameter(request, "sun_flg", ""));
		setLoclCreDt(JSPUtil.getParameter(request, "locl_cre_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTmlAgmtVerNo(JSPUtil.getParameter(request, "tml_agmt_ver_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTmlAgmtSeq(JSPUtil.getParameter(request, "tml_agmt_seq", ""));
		setTmlAgmtDtlSeq(JSPUtil.getParameter(request, "tml_agmt_dtl_seq", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, "locl_upd_dt", ""));
		setHolFlg(JSPUtil.getParameter(request, "hol_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setWkdyFlg(JSPUtil.getParameter(request, "wkdy_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlAgmtAplyDyVO[]
	 */
	public TesTmlAgmtAplyDyVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlAgmtAplyDyVO[]
	 */
	public TesTmlAgmtAplyDyVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesTmlAgmtAplyDyVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] satFlg = (JSPUtil.getParameter(request, prefix	+ "sat_flg", length));
			String[] tmlAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ofc_cty_cd", length));
			String[] tmlRtDyAplyTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_rt_dy_aply_tp_cd", length));
			String[] sunFlg = (JSPUtil.getParameter(request, prefix	+ "sun_flg", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] tmlAgmtVerNo = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ver_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] tmlAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_seq", length));
			String[] tmlAgmtDtlSeq = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_dtl_seq", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] holFlg = (JSPUtil.getParameter(request, prefix	+ "hol_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] wkdyFlg = (JSPUtil.getParameter(request, prefix	+ "wkdy_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesTmlAgmtAplyDyVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (satFlg[i] != null)
					model.setSatFlg(satFlg[i]);
				if (tmlAgmtOfcCtyCd[i] != null)
					model.setTmlAgmtOfcCtyCd(tmlAgmtOfcCtyCd[i]);
				if (tmlRtDyAplyTpCd[i] != null)
					model.setTmlRtDyAplyTpCd(tmlRtDyAplyTpCd[i]);
				if (sunFlg[i] != null)
					model.setSunFlg(sunFlg[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tmlAgmtVerNo[i] != null)
					model.setTmlAgmtVerNo(tmlAgmtVerNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (tmlAgmtSeq[i] != null)
					model.setTmlAgmtSeq(tmlAgmtSeq[i]);
				if (tmlAgmtDtlSeq[i] != null)
					model.setTmlAgmtDtlSeq(tmlAgmtDtlSeq[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (holFlg[i] != null)
					model.setHolFlg(holFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (wkdyFlg[i] != null)
					model.setWkdyFlg(wkdyFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesTmlAgmtAplyDyVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesTmlAgmtAplyDyVO[]
	 */
	public TesTmlAgmtAplyDyVO[] getTesTmlAgmtAplyDyVOs(){
		TesTmlAgmtAplyDyVO[] vos = (TesTmlAgmtAplyDyVO[])models.toArray(new TesTmlAgmtAplyDyVO[models.size()]);
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
		this.satFlg = this.satFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtOfcCtyCd = this.tmlAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlRtDyAplyTpCd = this.tmlRtDyAplyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sunFlg = this.sunFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtVerNo = this.tmlAgmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtSeq = this.tmlAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtDtlSeq = this.tmlAgmtDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.holFlg = this.holFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wkdyFlg = this.wkdyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
