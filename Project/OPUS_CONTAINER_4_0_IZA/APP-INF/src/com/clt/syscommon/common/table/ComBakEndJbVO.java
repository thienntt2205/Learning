/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComBakEndJbVO.java
*@FileTitle : ComBakEndJbVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.18
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.11.18 김정훈 
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
 * @author 김정훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComBakEndJbVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComBakEndJbVO> models = new ArrayList<ComBakEndJbVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String thdId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String jbErrMsg = null;
	/* Column Info */
	private String jbStsFlg = null;
	/* Column Info */
	private String jbUsrErrMsg = null;
	/* Column Info */
	private String jbMsg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String jbId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComBakEndJbVO() {}

	public ComBakEndJbVO(String ibflag, String pagerows, String jbId, String thdId, String jbMsg, String jbStsFlg, String jbErrMsg, String creUsrId, String creDt, String updUsrId, String updDt, String jbUsrErrMsg) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.thdId = thdId;
		this.ibflag = ibflag;
		this.jbErrMsg = jbErrMsg;
		this.jbStsFlg = jbStsFlg;
		this.jbUsrErrMsg = jbUsrErrMsg;
		this.jbMsg = jbMsg;
		this.creDt = creDt;
		this.jbId = jbId;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("thd_id", getThdId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("jb_err_msg", getJbErrMsg());
		this.hashColumns.put("jb_sts_flg", getJbStsFlg());
		this.hashColumns.put("jb_usr_err_msg", getJbUsrErrMsg());
		this.hashColumns.put("jb_msg", getJbMsg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("jb_id", getJbId());
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
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("thd_id", "thdId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("jb_err_msg", "jbErrMsg");
		this.hashFields.put("jb_sts_flg", "jbStsFlg");
		this.hashFields.put("jb_usr_err_msg", "jbUsrErrMsg");
		this.hashFields.put("jb_msg", "jbMsg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("jb_id", "jbId");
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return thdId
	 */
	public String getThdId() {
		return this.thdId;
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
	 * @return jbErrMsg
	 */
	public String getJbErrMsg() {
		return this.jbErrMsg;
	}
	
	/**
	 * Column Info
	 * @return jbStsFlg
	 */
	public String getJbStsFlg() {
		return this.jbStsFlg;
	}
	
	/**
	 * Column Info
	 * @return jbUsrErrMsg
	 */
	public String getJbUsrErrMsg() {
		return this.jbUsrErrMsg;
	}
	
	/**
	 * Column Info
	 * @return jbMsg
	 */
	public String getJbMsg() {
		return this.jbMsg;
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
	 * @return jbId
	 */
	public String getJbId() {
		return this.jbId;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param thdId
	 */
	public void setThdId(String thdId) {
		this.thdId = thdId;
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
	 * @param jbErrMsg
	 */
	public void setJbErrMsg(String jbErrMsg) {
		this.jbErrMsg = jbErrMsg;
	}
	
	/**
	 * Column Info
	 * @param jbStsFlg
	 */
	public void setJbStsFlg(String jbStsFlg) {
		this.jbStsFlg = jbStsFlg;
	}
	
	/**
	 * Column Info
	 * @param jbUsrErrMsg
	 */
	public void setJbUsrErrMsg(String jbUsrErrMsg) {
		this.jbUsrErrMsg = jbUsrErrMsg;
	}
	
	/**
	 * Column Info
	 * @param jbMsg
	 */
	public void setJbMsg(String jbMsg) {
		this.jbMsg = jbMsg;
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
	 * @param jbId
	 */
	public void setJbId(String jbId) {
		this.jbId = jbId;
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
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setThdId(JSPUtil.getParameter(request, "thd_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setJbErrMsg(JSPUtil.getParameter(request, "jb_err_msg", ""));
		setJbStsFlg(JSPUtil.getParameter(request, "jb_sts_flg", ""));
		setJbUsrErrMsg(JSPUtil.getParameter(request, "jb_usr_err_msg", ""));
		setJbMsg(JSPUtil.getParameter(request, "jb_msg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setJbId(JSPUtil.getParameter(request, "jb_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComBakEndJbVO[]
	 */
	public ComBakEndJbVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComBakEndJbVO[]
	 */
	public ComBakEndJbVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComBakEndJbVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] thdId = (JSPUtil.getParameter(request, prefix	+ "thd_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] jbErrMsg = (JSPUtil.getParameter(request, prefix	+ "jb_err_msg", length));
			String[] jbStsFlg = (JSPUtil.getParameter(request, prefix	+ "jb_sts_flg", length));
			String[] jbUsrErrMsg = (JSPUtil.getParameter(request, prefix	+ "jb_usr_err_msg", length));
			String[] jbMsg = (JSPUtil.getParameter(request, prefix	+ "jb_msg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] jbId = (JSPUtil.getParameter(request, prefix	+ "jb_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComBakEndJbVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (thdId[i] != null)
					model.setThdId(thdId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (jbErrMsg[i] != null)
					model.setJbErrMsg(jbErrMsg[i]);
				if (jbStsFlg[i] != null)
					model.setJbStsFlg(jbStsFlg[i]);
				if (jbUsrErrMsg[i] != null)
					model.setJbUsrErrMsg(jbUsrErrMsg[i]);
				if (jbMsg[i] != null)
					model.setJbMsg(jbMsg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (jbId[i] != null)
					model.setJbId(jbId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComBakEndJbVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComBakEndJbVO[]
	 */
	public ComBakEndJbVO[] getComBakEndJbVOs(){
		ComBakEndJbVO[] vos = (ComBakEndJbVO[])models.toArray(new ComBakEndJbVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thdId = this.thdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbErrMsg = this.jbErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbStsFlg = this.jbStsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbUsrErrMsg = this.jbUsrErrMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbMsg = this.jbMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbId = this.jbId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
