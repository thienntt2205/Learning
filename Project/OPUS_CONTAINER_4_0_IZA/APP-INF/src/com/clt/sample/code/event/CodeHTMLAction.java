/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CodeHTMLAction.java
*@FileTitle : Common code inquiry sample HTMLAction
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : Seungyol Lee
*@LastVersion : 1.0
* 2009.05.25 Seungyol Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.code.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;

/**
 * Common code inquiry sample HTMLAction class
 * Inquiry common code list
 *
 * @author Seungyol Lee
 * @see 
 * @since J2EE 1.4
 */
public class CodeHTMLAction extends HTMLActionSupport implements HTMLAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 864687597860455947L;

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 CodeEvent 파싱하여 request에 셋팅<br>
	 * @param request HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {
		CodeEvent event = new CodeEvent();
		request.setAttribute("Event", event);
		
		return event;
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
