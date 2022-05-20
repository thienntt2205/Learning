<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0006.jsp
*@FileTitle  : Container Size
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.asset.event.BcmCcd0006Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    BcmCcd0006Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.asset");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (BcmCcd0006Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">

	var G_MDAA_CHK;
	var G_AHTU_TP_CD;

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
	</div>
	<!-- opus_design_btn(E) -->
	
	<!-- page_location(S) -->
	<div class="location">
	<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>

<!-- page_title_area(E) -->

<!-- wrap_search(S) -->  
<div class="wrap_search">
<!-- opus_design_inquiry (S) -->
<div class="opus_design_inquiry wFit">
	<table>
		<colgroup>
			<col width="150" />
			<col width="680" />
			<col width="80" />
			<col width="*" />
		</colgroup>
		<tbody>
			<tr>
				<th>Container Size Code</th>
				<td><input type="text" style="width:80px;text-align:center;ime-mode:disabled;" class="input1" dataformat="engup" name="cntr_sz_cd" maxlength="2" id="cntr_sz_cd" /><!-- 
				 --><button type="button" id="btns_search" name="btns_search" class="input_seach_btn"></button></td>
				<th><!-- Modified --></th>
				<td><input type="hidden" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_cntr_sz_cd" name="modi_cntr_sz_cd" maxlength="30"></td>
			</tr>
			<tr>
				<th>TEU</th>
				<td colspan="3"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input1" dataformat="float" name="cntr_sz_teu_capa" maxlength="18" id="cntr_sz_teu_capa" /> </td>
			</tr>
			<tr>
				<th>Container Size Name</th>
				<td colspan="3"><input type="text" style="width:670px;text-align:left;" class="input1" dataformat="engup" otherchar="()_\-,. " name="cntr_sz_desc" maxlength="100" id="cntr_sz_desc" /> </td>
			</tr>	
		</tbody>
	</table>
	<table>
            <colgroup>
                <col width="150">
                <col width="100">
                <col width="100">
                <col width="120">
                <col width="100">
                <col width="150">
                <col width="100">
                <col width="120">
                <col width="100">
                <col width="*">
            </colgroup>              
            <tbody>
                <tr>
                    <th>Delete Flag</th>
                    <td><select style="width:80px;" class="input" name="delt_flg" id="delt_flg" onChange="obj_change();">
                             <option value="N">N</option>
                             <option value="Y">Y</option>
                         </select>
                    </td>
                    <th>Create User</th>
                    <td><input type="text" style="width:80px;text-align:center;" class="input" name="cre_usr_id" id="cre_usr_id" readOnly/>
                    </td>
                    <th>Create Date/Time</th>
                    <td><input type="text" style="width:120px;text-align:center;" class="input" name="cre_dt" id="cre_dt" readOnly/>
                    </td>
                    <th>Last Update User</th>
                    <td><input type="text" style="width:80px;text-align:center;" class="input" name="upd_usr_id" id="upd_usr_id" readOnly/>
                    </td>
                    <th>Last Update Date/Time</th>
                    <td><input type="text" style="width:120px;text-align:center;" class="input" name="upd_dt" id="upd_dt" readOnly/>
                    </td>
                </tr>   
            </tbody>
        </table>
</div>
<!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  

<!-- wrap_result(S) -->  
<div class="wrap_result">
<!-- opus_design_grid(S) -->
<div class="opus_design_grid" id="mainTable">
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  
</form>