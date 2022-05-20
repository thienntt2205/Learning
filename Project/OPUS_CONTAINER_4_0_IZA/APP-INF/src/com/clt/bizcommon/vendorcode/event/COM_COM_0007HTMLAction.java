/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : COM_COM_0007HTMLAction.java
*@FileTitle : Vendor Code Pop-up
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.22
*@LastModifier : 김종호
*@LastVersion : 1.0
* 2012.02.22 김종호
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vendorcode.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.bizcommon.vendorcode.vo.SearchVendorCodeVO;

/**
 * HTTP Parser<br>
 * - com.clt.bizcommon.bizcommon.bizcommon.vendorcode.bizcommon 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 BizCommonSC로 실행요청<br>
 * - BizCommonSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * @author Jong-Ho Kim
 * @see BizCommonEvent 참조
 * @since J2EE 1.6
 */

public class COM_COM_0007HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * COM_COM_0007HTMLAction 객체를 생성
	 */
	public COM_COM_0007HTMLAction() {}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 BizCommonEvent로 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
    	int iPage           = JSPUtil.getParameterAsInt(request, "iPage", 1);
		
    	FormCommand command = FormCommand.fromRequest(request);
		ComCom0007Event event = new ComCom0007Event(iPage);
		

		if(command.isCommand(FormCommand.SEARCH)) {
			event.setSearchVendorCodeVO((SearchVendorCodeVO)getVO(request, SearchVendorCodeVO.class));
		}

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