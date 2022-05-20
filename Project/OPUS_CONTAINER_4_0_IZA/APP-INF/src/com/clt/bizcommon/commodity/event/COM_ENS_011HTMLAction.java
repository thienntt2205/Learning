/*=========================================================
* Copyright(c) 2006 CyberLogitec
* @FileName : COM_ENS_011HTMLAction.java
* @FileTitle : Commodity정보조회(공통 Popup)
* Open Issues :
* Change history :
* @LastModifyDate : 2006-08-03
* @LastModifier : sungseok, choi
* @LastVersion : 1.0
* 2006-08-03 sungseok, choi
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.commodity.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;


/**
 * HTTP Parser<br>
 * com.clt.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * Parsing 한 정보를 Event로 변환, request에 담아 BizCommonSC로 실행요청<br>
 * BizCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 *
 * @author sungseok, choi
 * @see ComEns011Event , COM_ENS_011EventResponse 참조
 * @since J2EE 1.4
 */
public class COM_ENS_011HTMLAction extends HTMLActionSupport {
    /**
     * Add Title	: COM_ENS_011HTMLAction Object Creation 
     * Add Date		: 2006.08.03
     * Add Author	: sungseok, choi
     * @return
     */
    public COM_ENS_011HTMLAction() {
    }

    /**
     * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
     * HttpRequst의 정보를 COM_ENS_011Event로 파싱하여 request에 셋팅<br>
     * 
     * @param request HttpServletRequest HttpRequest
     * @return Event Event interface를 구현한 객체
     * @exception HTMLActionException
     * @author sungseok, choi
     * @date 2006.08.03
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {
       	
    	/**
    	 * Title : 메인화면에서 Commodity popup button click evnent handler
    	 * @return view input box clear.<br>
    	 * @author sungseok, choi.<br>
    	 * @date 2006.08.03.<br>
    	 * =============================<br>
    	 * @see 1) Mid commodity Add-on Areas.
    	 * =============================<br>
    	 * @variable
    	 * 1. Commodity Code 		= CMDT_CD
    	 * 2. Rep Commodity Code 	= REP_CMDT_CD
    	 * 3. Rep IMDG Class	 	= REP_IMDG_CLS
    	 * 4. Commodity Description = CMDT_DESC
    	 */
    	
    	String cmdt_cd      	= JSPUtil.getParameter(request, "cmdt_cd".trim(), "");
    	String rep_cmdt_cd  	= JSPUtil.getParameter(request, "rep_cmdt_cd".trim(), "");
    	String rep_imdg_lvl_cd  	= JSPUtil.getParameter(request, "rep_imdg_lvl_cd".trim(), "");
    	String cmdt_nm    	= JSPUtil.getParameter(request, "cmdt_nm".trim(), "");
    	int iPage           	= JSPUtil.getParameterAsInt(request, "iPage", 1);  
    	
    	String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
    	String delt_flg = "";
    	if("Y".equals(mdm_yn)){
    		delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "N");
    	}else{
    		delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
    	}
    	
    	FormCommand f_cmd = FormCommand.fromRequest(request);
    	
    	log.debug("iPage : " + iPage + ", Request iPage :" + JSPUtil.getParameter(request, "iPage"));
    	
    	ComEns011Event event = new ComEns011Event(cmdt_cd, rep_cmdt_cd, rep_imdg_lvl_cd, cmdt_nm, iPage, mdm_yn, delt_flg );
                 
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