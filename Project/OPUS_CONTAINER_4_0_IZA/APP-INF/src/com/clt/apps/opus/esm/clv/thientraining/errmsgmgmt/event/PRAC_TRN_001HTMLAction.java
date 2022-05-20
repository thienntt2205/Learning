/*=========================================================
 *Copyright(c) 2022 CyberLogitec
 *@FileName : PRAC_TRN_001HTMLAction.java
 *@FileTitle : Error Message Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2022.05.13
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2022.05.13 
 * 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.event;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.HTMLActionSupport;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.vo.ErrMsgVO;

/**
 * HTTP Parser<br>
 * - com.clt.apps.opus.esm.clv.thientraining 화면을 통해 서버로 전송되는 HTML DOM 객체의 Value를
 * 자바 변수로 Parsing<br>
 * - Parsing 한 정보를 Event로 변환, request에 담아 ThienTrainingSC로 실행요청<br>
 * - ThienTrainingSC에서 View(JSP)로 실행결과를 전송하는 EventResponse를 request에 셋팅<br>
 * 
 * @author Thien
 * @see ThienTrainingEvent 참조
 * @since J2EE 1.6
 */

public class PRAC_TRN_001HTMLAction extends HTMLActionSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * PRAC_TRN_001HTMLAction 객체를 생성
	 */
	public PRAC_TRN_001HTMLAction() {
	}

	/**
	 * HTML DOM 객체의 Value를 자바 변수로 Parsing<br>
	 * HttpRequst의 정보를 ThienTrainingEvent로 파싱하여 request에 셋팅<br>
	 * 
	 * @param request
	 *            HttpServletRequest HttpRequest
	 * @return Event Event interface를 구현한 객체
	 * @exception HTMLActionException
	 */
	public Event perform(HttpServletRequest request) throws HTMLActionException {

		FormCommand command = FormCommand.fromRequest(request);
		PracTrn001Event event = new PracTrn001Event();

		if (command.isCommand(FormCommand.MULTI)) {
			event.setErrMsgVOS((ErrMsgVO[]) getVOs(request, ErrMsgVO.class, ""));
		}
		// if we use search function, this logic may not work functionaly
		// anymore,so that why we need to cmt this code
		else if (command.isCommand(FormCommand.SEARCH)) {
			// event.setErrMsgVO((ErrMsgVO) getVO(request, ErrMsgVO.class));
			// create a temp ErrMsgVo instance to get data from jsp
			ErrMsgVO tempVarMsginfo = new ErrMsgVO();
			// set data from ErrMsgcd "s_err_msg_cd" to temp
			tempVarMsginfo.setErrMsgCd(JSPUtil.getParameter(request,
					"s_err_msg_cd", ""));
			// set data from ErrMsgdesc "s_err_msg"
			tempVarMsginfo.setErrMsg(JSPUtil.getParameter(request, "s_err_msg",
					""));
			// tempVarMsginfo able to get multi parametters
			event.setErrMsgVO(tempVarMsginfo);
		}
		return event;
	}

	/**
	 * HttpRequest의 attribute에 업무시나리오 수행결과 값 저장<br>
	 * ServiceCommand에서 View(JSP)로 실행결과를 전송하는 ResultSet을 request에 셋팅<br>
	 * 
	 * @param request
	 *            HttpServletRequest HttpRequest
	 * @param eventResponse
	 *            EventResponse interface를 구현한 객체
	 */
	public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
		request.setAttribute("EventResponse", eventResponse);
	}

	/**
	 * HttpRequest의 attribute에 HttpRequest 파싱 수행결과 값 저장<br>
	 * HttpRequest 파싱 수행결과 값 request에 셋팅<br>
	 * 
	 * @param request
	 *            HttpServletRequest HttpRequest
	 * @param event
	 *            Event interface를 구현한 객체
	 */
	public void doEnd(HttpServletRequest request, Event event) {
		request.setAttribute("Event", event);
	}
}