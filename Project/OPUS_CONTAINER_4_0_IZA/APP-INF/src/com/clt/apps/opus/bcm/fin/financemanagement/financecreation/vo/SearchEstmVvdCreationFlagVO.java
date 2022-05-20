/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : SearchEstmVvdCreationFlagVO.java
*@FileTitle : SearchEstmVvdCreationFlagVO
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.30
*@LastModifier : 
*@LastVersion : 1.0
* 2016.03.30  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo;

import java.lang.reflect.Field;
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

public class SearchEstmVvdCreationFlagVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchEstmVvdCreationFlagVO> models = new ArrayList<SearchEstmVvdCreationFlagVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String acclYrmon = null;
	/* Column Info */
	private String buttonBlockFlag = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public SearchEstmVvdCreationFlagVO() {}

	public SearchEstmVvdCreationFlagVO(String ibflag, String pagerows, String acclYrmon, String buttonBlockFlag) {
		this.ibflag = ibflag;
		this.acclYrmon = acclYrmon;
		this.buttonBlockFlag = buttonBlockFlag;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("accl_yrmon", getAcclYrmon());
		this.hashColumns.put("button_block_flag", getButtonBlockFlag());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("accl_yrmon", "acclYrmon");
		this.hashFields.put("button_block_flag", "buttonBlockFlag");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
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
	 * @return acclYrmon
	 */
	public String getAcclYrmon() {
		return this.acclYrmon;
	}
	
	/**
	 * Column Info
	 * @return buttonBlockFlag
	 */
	public String getButtonBlockFlag() {
		return this.buttonBlockFlag;
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
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param acclYrmon
	 */
	public void setAcclYrmon(String acclYrmon) {
		this.acclYrmon = acclYrmon;
	}
	
	/**
	 * Column Info
	 * @param buttonBlockFlag
	 */
	public void setButtonBlockFlag(String buttonBlockFlag) {
		this.buttonBlockFlag = buttonBlockFlag;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setAcclYrmon(JSPUtil.getParameter(request, prefix + "accl_yrmon", ""));
		setButtonBlockFlag(JSPUtil.getParameter(request, prefix + "button_block_flag", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchEstmVvdCreationFlagVO[]
	 */
	public SearchEstmVvdCreationFlagVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchEstmVvdCreationFlagVO[]
	 */
	public SearchEstmVvdCreationFlagVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchEstmVvdCreationFlagVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] acclYrmon = (JSPUtil.getParameter(request, prefix	+ "accl_yrmon", length));
			String[] buttonBlockFlag = (JSPUtil.getParameter(request, prefix	+ "button_block_flag", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchEstmVvdCreationFlagVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (acclYrmon[i] != null)
					model.setAcclYrmon(acclYrmon[i]);
				if (buttonBlockFlag[i] != null)
					model.setButtonBlockFlag(buttonBlockFlag[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchEstmVvdCreationFlagVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchEstmVvdCreationFlagVO[]
	 */
	public SearchEstmVvdCreationFlagVO[] getSearchEstmVvdCreationFlagVOs(){
		SearchEstmVvdCreationFlagVO[] vos = (SearchEstmVvdCreationFlagVO[])models.toArray(new SearchEstmVvdCreationFlagVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclYrmon = this.acclYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.buttonBlockFlag = this.buttonBlockFlag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
