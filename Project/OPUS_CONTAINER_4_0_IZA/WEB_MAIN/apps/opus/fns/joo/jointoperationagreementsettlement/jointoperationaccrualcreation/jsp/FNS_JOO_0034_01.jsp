<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0034_01.jsp
 *@FileTitle: Estimate Code Check - Carrier
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/18
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationaccrualcreation.event.FnsJoo003401Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo003401Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationAccrualCreation");
	String yyyyMM = JSPUtil.getKST("yyyy-MM");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo003401Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
    var yyyyMM = "<%=yyyyMM%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_retrive" id="btn_retrive" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
		--><button class="btn_normal" name="btn_downExcel" id="btn_downExcel" type="button">Down Excel</button>
	</div>
	<!-- opus_design_btn (E) -->
		
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry">
		<table style="width:979px">
			<tbody>
				<colgroup>
					<col width="80px"/>
					<col width="120px"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Accrual Month</th>
					<td><input type="text" style="width:60px;" class="input1" required="" dataformat="ym" maxlength="6" value="<%=yyyyMM %>" name="acct_yrmon" id="acct_yrmon" /><!-- 
					 	--><button type="button" class="btn_left" name="btn_back" id="btn_back"></button><!-- 
						--><button type="button" class="btn_right" name="btn_next"  id="btn_next"></button>
					</td>
                    <td align="left"> ( Comparing BSA with JOO Carrier/Lane )</td>
			   </tr> 
			</tbody>
		</table>
		<table class="height_10"><tr><td colspan="8"></td></tr></table>
	</div>
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">		
	<div class="opus_design_grid" >	
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>	
</div>
<!-- opus_design_grid(E) -->

</form>
