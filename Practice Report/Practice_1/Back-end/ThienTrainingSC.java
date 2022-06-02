/*=========================================================
 *Copyright(c) 2022 CyberLogitec
 *@FileName : ThienTrainingSC.java
 *@FileTitle : Error Message Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2022.05.13
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2022.05.13 
 * 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.thientraining;

import java.util.List;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.basic.ErrMsgMgmtBC;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.basic.ErrMsgMgmtBCImpl;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.event.PracTrn001Event;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.vo.ErrMsgVO;

/**
 * ALPS-ThienTraining Business Logic ServiceCommand - ALPS-ThienTraining Daehan
 * Business process the transaction.
 * 
 * @author Thien
 * @see ErrMsgMgmtDBDAO
 * @since J2EE 1.6
 */

public class ThienTrainingSC extends ServiceCommandSupport {
    // Login User Information
    private SignOnUserAccount account = null;

    /**
     * ThienTraining system Preceding work scenario<br>
     * Creating related internal objects when calling a business scenario<br>
     */
    public void doStart() {
	log.debug("ThienTrainingSC 시작");
	try {
	    // First comment --> login check box
	    account = getSignOnUserAccount();
	} catch (Exception e) {
	    log.error(e.getLocalizedMessage());
	}
    }

    /**
     * ThienTraining system Closing the work scenario<br>
     * Release related internal objects at the end of the business scenario<br>
     */
    public void doEnd() {
	log.debug("ThienTrainingSC 종료");
    }

    /**
     * Carry out business scenarios corresponding to each event<br>
     * ALPS-ThienTraining system Branch processing of all events occurring in
     * business<br>
     * 
     * @param e
     *            Event
     * @return EventResponse
     * @exception EventException
     */
    public EventResponse perform(Event e) throws EventException {
	// RDTO(Data Transfer Object including Parameters)
	EventResponse eventResponse = null;

	// SC The part you should use if you are handling multiple events
	if (e.getEventName().equalsIgnoreCase("PracTrn001Event")) {
	    if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
		// define variable eventResponse = searchErrMsg(e) (function
		// search VO)
		eventResponse = searchErrMsg(e);
	    } else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
		// define variable eventResponse = manageErrMsg(e) (function
		// multi VO)
		eventResponse = manageErrMsg(e);
	    }
	}
	// return result eventResponse
	return eventResponse;
    }

    /**
     * PRAC_TRN_001 : [event]<br>
     * [business award]second [Act].<br>
     * 
     * @param e
     *            Event
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse searchErrMsg(Event e) throws EventException {
	// PDTO(Data Transfer Object including Parameters)
	GeneralEventResponse eventResponse = new GeneralEventResponse();
	PracTrn001Event event = (PracTrn001Event) e;
	ErrMsgMgmtBC command = new ErrMsgMgmtBCImpl();

	try {
	    List<ErrMsgVO> list = command.searchErrMsg(event.getErrMsgVO());
	    eventResponse.setRsVoList(list);
	} catch (EventException ex) {
	    throw new EventException(new ErrorHandler(ex).getMessage(), ex);
	} catch (Exception ex) {
	    throw new EventException(new ErrorHandler(ex).getMessage(), ex);
	}
	return eventResponse;
    }

    /**
     * PRAC_TRN_001 : [event]<br>
     * [Act] for [Business Target].<br>
     *
     * @param Event
     *            e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse manageErrMsg(Event e) throws EventException {
	// PDTO(Data Transfer Object including Parameters)
	// Declare an eventResponse type variable
	GeneralEventResponse eventResponse = new GeneralEventResponse();
	// Define PracTrn001Event event variable = (PracTrn001Event) e
	PracTrn001Event event = (PracTrn001Event) e;
	// Declare ErrMsgMgmtBC command(business component) variable
	ErrMsgMgmtBC command = new ErrMsgMgmtBCImpl();
	// Start try-cath
	try {
	    // start a transaction
	    begin();
	    // to modify list of ErrMsgVo to database(insert, update, delete)
	    command.manageErrMsg(event.getErrMsgVOS(), account);
	    eventResponse.setUserMessage(new ErrorHandler("XXXXXXXXX")
		    .getUserMessage());
	    // Accept modify, end transaction
	    commit();
	    // detect exception => action
	} catch (EventException ex) {
	    // cancel transaction
	    rollback();
	    // Output an EventExeption msg
	    throw new EventException(new ErrorHandler(ex).getMessage(), ex);
	} catch (Exception ex) {
	    // detect exception => action
	    rollback();
	    // Output an EventExeption msg
	    throw new EventException(new ErrorHandler(ex).getMessage(), ex);
	}
	// return result (eventResponse)
	return eventResponse;
    }
}