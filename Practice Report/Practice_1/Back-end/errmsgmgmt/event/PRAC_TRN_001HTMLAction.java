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
 * - Value of HTML DOM object sent to server through
 * com.clt.apps.opus.esm.clv.thientraining screen Parsing to Java Variables<br>
 * - Convert the parsing information into an Event, put it in the request and
 * request execution with ThienTrainingSC<br>
 * - Set EventResponse to request to send execution result from ThienTrainingSC
 * to View (JSP)<br>
 *
 * @author Thien
 * @see ThienTrainingEvent 참조
 * @since J2EE 1.6
 */

public class PRAC_TRN_001HTMLAction extends HTMLActionSupport {

    private static final long serialVersionUID = 1L;

    /**
     * Create an object PRAC_TRN_001HTMLAction
     */
    public PRAC_TRN_001HTMLAction() {
    }

    /**
     * Parsing the HTML DOM object's Value as a Java variable<br>
     * Parsing the information of HttpRequst as ThienTrainingEvent and setting
     * it in the request<br>
     * 
     * @param request
     *            HttpServletRequest HttpRequest
     * @return Event An object that implements the Event interface.
     * @exception HTMLActionException
     */
    public Event perform(HttpServletRequest request) throws HTMLActionException {

	FormCommand command = FormCommand.fromRequest(request);
	PracTrn001Event event = new PracTrn001Event();

	if (command.isCommand(FormCommand.MULTI)) {
	    event.setErrMsgVOS((ErrMsgVO[]) getVOs(request, ErrMsgVO.class, ""));
	}
	// if we use search function, this logic may not work functionally
	// anymore,so that why we need to comment this code
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
	    // tempVarMsginfo able to get multi parameters
	    event.setErrMsgVO(tempVarMsginfo);
	}
	return event;
    }

    /**
     * Saving the value of the task scenario execution result in the attribute
     * of HttpRequest<br>
     * Setting the ResultSet that transmits the execution result from
     * ServiceCommand to View (JSP) in the request<br>
     * 
     * @param request
     *            HttpServletRequest HttpRequest
     * @param eventResponse
     *            An object that implements the EventResponse interface.
     */
    public void doEnd(HttpServletRequest request, EventResponse eventResponse) {
	request.setAttribute("EventResponse", eventResponse);
    }

    /**
     * Save HttpRequest parsing result value in HttpRequest attribute<br>
     * HttpRequest parsing result value set in request<br>
     *
     * @param request
     *            HttpServletRequest HttpRequest
     * @param event
     *            Object that implements the EventResponse interface
     */
    public void doEnd(HttpServletRequest request, Event event) {
	request.setAttribute("Event", event);
    }
}