/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0A1HTMLAction.java
*@FileTitle : Vessel조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-02 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;


/**
 * HTTP Parser<br>
 * - com.clt.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 BizCommonSC로 실행요청<br>
 * - BizCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author sangyool pak
 * @see ComEns0A1Event , COM_ENS_0A1EventResponse 참조
 * @since J2EE 1.4
 */
public class ComEns0A1HTMLAction extends HTMLActionSupport {

    /**
     * COM_ENS_0A1HTMLAction 객체를 생성
     */
    public ComEns0A1HTMLAction() {
    }

    /**
     * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
     * HttpRequst의 정보를 COM_ENS_0A1Event로 파싱하여 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @return Event Event interface를 구현한 객체
     * @exception HTMLActionException
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
   	
    	// 메인화면에서 Vessel팝업 버튼을 클릭 또는 Retrieve 버튼 클릭했을 경우
    	String vsl_cd       = JSPUtil.getParameter(request, "vsl_cd".trim(), "");
    	String vsl_eng_nm   = JSPUtil.getParameter(request, "vsl_eng_nm".trim(), "");
    	String car_cd       = JSPUtil.getParameter(request, "car_cd".trim(), "");
    	String call_sgn_no	= JSPUtil.getParameter(request, "call_sgn_no".trim(), "");
    	String lloyd_no	= JSPUtil.getParameter(request, "lloyd_no".trim(), "");
    	
    	// vessel where 조건값 추가 
    	String fdr_div_cd	= JSPUtil.getParameter(request, "fdrDiv_cd".trim(), "");
    	
    	/*
    	 * 20120208 added by JUN SUNG, KIM
    	 * mdm yn 관련 추가 param
    	 */
    	String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
    	String delt_flg = "";
    	if("Y".equals(mdm_yn)){
    		delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "N");
    	}else{
    		delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
    	}
    	
    	int iPage           = JSPUtil.getParameterAsInt(request, "iPage", 1);  
    	
    	FormCommand f_cmd = FormCommand.fromRequest(request);
    	
    	log.debug("iPage : " + iPage + ", Request iPage :" + JSPUtil.getParameter(request, "iPage"));
    	
    	ComEns0A1Event event = new ComEns0A1Event(vsl_cd, vsl_eng_nm, car_cd, iPage ,call_sgn_no, lloyd_no, mdm_yn, delt_flg, fdr_div_cd);
                 
        event.setCommandClassName("BizCommonSC");
        event.setFormCommand(f_cmd);
        request.setAttribute("Event", event);

        return  event;
    }

    /**
     * HttpRequest의 attribute에 업무시나리오 수행결과 값 저장<br>
     * ServiceCommand에서 View(JSP)로 실행결과를 전송하는 ResultSet을 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @param eventResponse EventResponse interface를 구현한 객체
     */
    public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
        request.setAttribute("EventResponse", eventResponse);
    }

    /**
     * HttpRequest의 attribute에 HttpRequest 파싱 수행결과 값 저장<br>
     * HttpRequest 파싱 수행결과 값 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @param event Event interface를 구현한 객체
     */
    public void doEnd(HttpServletRequest request, Event event) {
        request.setAttribute("Event", event);
    }

}