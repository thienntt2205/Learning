/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ComEdm001Event.java
*@FileTitle : 공통코드관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-07
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-07 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.codemanagement.event;

import java.util.Arrays;
import java.util.Collection;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.COM_CODEDOMAIN;
import com.clt.syscommon.common.table.COM_CODEVALUE;
import com.clt.syscommon.common.table.ComBookmarkVO;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtCondVO;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtDtlVO;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtMstVO;


/**
 * UI_COM_EDM_001 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_EDM_001HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SeongWook Kim
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class CodeManagementEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** t_codedomain Table  Value Object */
	private COM_CODEDOMAIN tCodedomain = null;

	/** t_codedomains Multi Action을 위한 Collection */
	private Collection tCodedomains = null;

	/** t_codevalue Table  Value Object */
	private COM_CODEVALUE tCodevalue = null;

	/** t_codevalues Multi Action을 위한 Collection */
	private Collection tCodevalues = null;

	/** id 변수 (Form 객체) */
	private String id = null;

	/** codeid 변수 (Form 객체) */
	private String codeid = null;

	/** name 변수 (Form 객체) */
	private String name = null;

	/** definition 변수 (Form 객체) */
	private String definition = null;

	/** datatype 변수 (Form 객체) */
	private String datatype = null;

	/** precision 변수 (Form 객체) */
	private String precision = null;

	/** var1 변수 (Form 객체) */
	private String var1 = null;
	
	private String searchCdTp = null;

	private String searchtype = null;
	
	private String selectedcodes = null;
	
	private DBRowSet dbrowset1 = null;
	
	private DBRowSet dbrowset2 = null;

	/** Table Value Object 조회 조건 처리  */
	private CodeMgmtCondVO codeMgmtCondVO = null;

	/** Table Value Object Multi Data 처리 */
	private CodeMgmtMstVO[] codemgmtMstVOs = null;

	private CodeMgmtDtlVO[] codemgmtDtlVOs = null;
	
	public CodeManagementEvent(){}

	/**
	 * 
	 * ComEdm001Event 생성
	 * It's Constructor
	 * @param t_codedomain
	 */
	public CodeManagementEvent(COM_CODEDOMAIN t_codedomain) {
		this.tCodedomain = t_codedomain;
    }
	
	public CodeMgmtCondVO getCodeMgmtCondVO() {
		return codeMgmtCondVO;
	}

	public void setCodeMgmtCondVO(CodeMgmtCondVO codeMgmtCondVO) {
		this.codeMgmtCondVO = codeMgmtCondVO;
	}

	public CodeMgmtMstVO[] getCodemgmtMstVOs() {
		CodeMgmtMstVO[] rtnVOs = null;
		if (this.codemgmtMstVOs != null) {
			rtnVOs = Arrays.copyOf(codemgmtMstVOs, codemgmtMstVOs.length);
		}
		return rtnVOs;
	}

	public void setCodemgmtMstVOs(CodeMgmtMstVO[] codemgmtMstVOs) {
		if(codemgmtMstVOs != null){
			CodeMgmtMstVO[] tmpVOs = Arrays.copyOf(codemgmtMstVOs, codemgmtMstVOs.length);
			this.codemgmtMstVOs  = tmpVOs;
		}
	}

	public CodeMgmtDtlVO[] getCodemgmtDtlVOs() {
		CodeMgmtDtlVO[] rtnVOs = null;
		if (this.codemgmtDtlVOs != null) {
			rtnVOs = Arrays.copyOf(codemgmtDtlVOs, codemgmtDtlVOs.length);
		}
		return rtnVOs;
	}

	public void setCodemgmtDtlVOs(CodeMgmtDtlVO[] codemgmtDtlVOs) {
		if(codemgmtDtlVOs != null){
			CodeMgmtDtlVO[] tmpVOs = Arrays.copyOf(codemgmtDtlVOs, codemgmtDtlVOs.length);
			this.codemgmtDtlVOs  = tmpVOs;
		}
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return COM_CODEDOMAIN
	 */
	public COM_CODEDOMAIN getT_CODEDOMAIN(){
		return tCodedomain;
	}
	/**
	 * 
	 * @author 2e Consulting
	 * @return Collection
	 */
	public Collection getT_CODEDOMAINS(){
		return tCodedomains;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return COM_CODEVALUE
	 */
	public COM_CODEVALUE getT_CODEVALUE(){
		return tCodevalue;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return Collection
	 */
	public Collection getT_CODEVALUES(){
		return tCodevalues;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getId(){
		return id;
	}


	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getCodeid(){
		return codeid;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getName(){
		return name;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getDefinition(){
		return definition;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getDatatype(){
		return datatype;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getPrecision(){
		return precision;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getVar1(){
		return var1;
	}

	/**
	 * 
	 */
	public String getEventName() {
		return "CodeManagementEvent";
	}

	/**
	 * 
	 */
	public String toString() {
		return "CodeManagementEvent";
	}
	
	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getSearchCdTp() {
		return searchCdTp;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @param searchCdTp void
	 */
	public void setSearchCdTp(String searchCdTp) {
		this.searchCdTp = searchCdTp;
	}
	
	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getSearchtype() {
		return searchtype;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @param searchtype void
	 */
	public void setSearchtype(String searchtype) {
		this.searchtype = searchtype;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return String
	 */
	public String getSelectedcodes() {
		return selectedcodes;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @param selectedcodes void
	 */
	public void setSelectedcodes(String selectedcodes) {
		this.selectedcodes = selectedcodes;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return DBRowSet
	 */
	public DBRowSet getDbrowset1() {
		return dbrowset1;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @param dbrowset1 void
	 */
	public void setDbrowset1(DBRowSet dbrowset1) {
		this.dbrowset1 = dbrowset1;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @return DBRowSet
	 */
	public DBRowSet getDbrowset2() {
		return dbrowset2;
	}

	/**
	 * 
	 * @author 2e Consulting
	 * @param dbrowset2 void
	 */
	public void setDbrowset2(DBRowSet dbrowset2) {
		this.dbrowset2 = dbrowset2;
	}

}
