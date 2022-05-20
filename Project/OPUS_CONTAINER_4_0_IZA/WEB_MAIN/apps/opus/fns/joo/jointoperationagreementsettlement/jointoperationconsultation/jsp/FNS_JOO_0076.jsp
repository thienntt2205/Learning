<%
/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FNS_JOO_0076.jsp
*@FileTitle : Inquiry Disabled VVD
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0076Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0076Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.jointoperationconsultation");
    String yyyyMM = JSPUtil.getKST("yyyy-MM");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0076Event)request.getAttribute("Event");
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
<html>
<head>
<title>Inquiry Disabled VVD</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script language="javascript">
    var yyyyMM = "<%=yyyyMM%>";
	function setupPage(){
 
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>

<body  onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
 


<table width="100%" border="0" cellpadding="0" cellspacing="0" style="padding-top:2;padding-left:5;">
    <tr><td valign="top">
     
        <!--Page Title, Historical (S)-->
            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="title">
                <tr><td class="history"><img src="img/icon_history_dot.gif" align="absmiddle"><span id="navigation"></span></td></tr>
                <tr><td class="title"><img src="img/icon_title_dot.gif" align="absmiddle"><span id="title"></span></td></tr>
            </table>
        <!--Page Title, Historical (E)-->   
    
    
    <!--biz page (S)-->
        <table class="search"> 
        <tr><td class="bg">
                <!--  biz_1  (S) -->
                <table class="search" border="0" style="width:979;"> 
                <tr class="h23">
                <td width="90">Cancel Month</td>
                    <td width=""><input type="text" style="width:60" class="input1"  dataformat='ym' required maxlength='6' value="<%=yyyyMM %>" caption='Cancel Month'   fullfill name='eai_evnt_dt' >&nbsp;<img class="cursor" src="img/btns_back.gif" name='btn_eai_evnt_dt_back' width="19" height="20" border="0" align="absmiddle">&nbsp;<img class="cursor" src="img/btns_next.gif"  name='btn_eai_evnt_dt_next' width="19" height="20" border="0" align="absmiddle"></td>
                </table>                
                <!--  biz_1   (E) -->
            </td>
        </tr>
        </table>
        <table class="height_10"><tr><td colspan="8"></td></tr></table>
        
        <!-- Tab BG Box  (S) -->
        <table class="search"> 
        <tr><td class="bg">
                        
            <!-- Grid  (S) -->
                    <table width="100%"  id="mainTable">
                        <tr>
                            <td width="100%">
                                <script language="javascript">ComSheetObject('sheet1');</script>
                            </td>
                        </tr>
                    </table>
            <!-- Grid (E) -->
            
            </td>
        </tr>
        </table>
    <!-- Tab BG Box  (S) -->
    <!--biz page (E)-->
    
    
    <!--Button (S) -->
        <table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top:5;,padding-bottom:10;"> 
        <tr><td class="btn1_bg">
            <table border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
                    <tr><td class="btn1_left"></td>
                    <td class="btn1" name="btn_Retrieve"  id="btn_Retrieve">Retrieve</td>
                    <td class="btn1_right"></td>
                    </tr>
                </table></td>
                <td><table width="72" border="0" cellpadding="0" cellspacing="0" class="button">
                    <tr><td class="btn1_left"></td>
                    <td class="btn1" name="btn_New" id="btn_New" >New</td>
                    <td class="btn1_right"></td>
                    </tr>
                </table></td>
                <td class="btn1_line"></td>
                <td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
                    <tr><td class="btn1_left"></td>
                    <td class="btn1" name="btn_DownExcel" id="btn_DownExcel">Down Excel</td>
                    <td class="btn1_right"></td>
                    </tr>
                </table></td>
        </td></tr>
        </table>
    <!--Button (E) -->
    </td></tr>
</table>
</td></tr>
</table>

</form>
</body>
</html>