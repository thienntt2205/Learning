<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : fns_joo_0007.jsp
*@FileTitle  : Slot Hire
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/17
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0007Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0007Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");

	String yyyyMM = JSPUtil.getKST("yyyy-MM");
	
	String crrCombo = "";
	String stlCombo = "";
	String stlComnm = "";
    String clzYn    = "O";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0007Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		crrCombo = eventResponse.getETCData("jo_crr_cd");
		stlCombo = eventResponse.getETCData("stl_jb_combo");
		stlComnm = eventResponse.getETCData("stl_jb_comnm");
		clzYn    = eventResponse.getETCData("clz_yn");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
var gCrrCombo    = "<%=crrCombo%>";
var gStlCombo    = "<%=stlCombo%>";
var gStlComnm    = "<%=stlComnm%>";
var gClzYn       = "<%=clzYn%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
<input type="hidden" name="cur_row" value="0" id="cur_row" />
<input type="hidden" name="jo_stl_itm_cd" value="S/H" id="jo_stl_itm_cd" />
<input type="hidden" name="jo_mnu_nm" value="S/H" id="jo_mnu_nm" />
<input type="hidden" name="add_jo_stl_itm_cd" value="OPR" id="add_jo_stl_itm_cd" />
<input type="hidden" name="add_jo_mnu_nm" value="OPR" id="add_jo_mnu_nm" />
<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button" auth="R">Retrieve</button><!--
	--><button class="btn_normal" name="btn_new" id="btn_new" type="button"  auth="R">New</button><!--
	--><button class="btn_normal" name="btn_create" id="btn_create" type="button"  auth="C">Create</button><!--
	--><button class="btn_normal" name="btn_save" id="btn_save" type="button"  auth="C">Save</button><!--
	--><button class="btn_normal" name="btn_delete_all" id="btn_delete_all" type="button" auth="C">Delete</button><!--
	--><button class="btn_normal" name="btn_downexcel" id="btn_downexcel" type="button" auth="R">Down Excel</button>
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
		<table>
			<tbody>
				<colgroup>
					<col width="100px"/><!-- Account Month -->
					<col width="120px"/>
					<col width="50px"/><!-- Carrier -->
					<col width="200px"/>
					<col width="50px"/><!-- Rev./Exp. -->
					<col width="150px"/>
					<col width="50px"/><!-- Option -->
					<col width="100px"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Account Month</th>
					<td ><input type="text" style="width:60px" class="input1" name="acct_yrmon" id="acct_yrmon" value="<%=yyyyMM%>" dataformat="ym" maxlength=6><!-- 
						 --><button type="button" class="btn_left" name="btns_back"  id="btns_back"></button><!--
						--><button type="button" class="btn_right" name="btns_next"  id="btns_next"></button>
					</td>
					<th >Carrier</th>
					<td><script type="text/javascript">ComComboObject('cmb_jo_crr_cd',6,70,0,1);</script><!-- 
					 --><input type="text" style="width:40px;text-align:center;display:none;" class="input2" name="jo_crr_cd" id="jo_crr_cd" readonly><!-- 
					 --><input type="text" style="width:40px;text-align:center;" class="input2" name="trd_cd" id="trd_cd" readonly><!-- 
					 --><input type="text" style="width:60px;text-align:center;" class="input2" name="rlane_cd" id="rlane_cd" readonly></td>
					<th class="pad_left_4">Rev./Exp.</th>
				    <td style="font-size:12;">&nbsp;<input type="radio" name="re_divr_cd" id="re_divr_cd" value="R" class="trans" checked><b>Revenue</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="re_divr_cd" id="re_divr_cd" value="E" class="trans"><b> Expense</b> </td>
					<th>Option</th>
					<td><script language="javascript">ComComboObject('sch_tp_cd',1,100,0,0);</script><!-- &nbsp;(&nbsp;<input type="checkbox" name="g6_ga_yn" id="g6_ga_yn" value="" class="trans"/>&nbsp;<b>G6/GA</b>&nbsp;) --></td>
					<td></td>
				</tr>
			</tbody>
		</table>
		<table class="height_8"><tr><td colspan="8"></td></tr></table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<!-- opus_design_grid(S) -->
<div class="wrap_result">
		<div class="opus_design_grid" >
			<!-- opus_design_btn (S) -->
			<div class="opus_design_btn">
				<button class="btn_normal" name="btn_add" id="btn_add" type="button" auth="C">Row Add</button><!--
				--><button class="btn_normal" name="btn_delete" id="btn_delete" type="button" auth="C">Row Delete</button><!--
				--><button class="btn_normal" name="btn_copy" id="btn_copy" type="button" auth="C">Row Copy</button>
			</div>
			<!-- opus_design_btn (E) -->
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<div class="opus_design_grid clear" >
			<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>
</div>
<!-- opus_design_grid(E) -->
</form>
