/*
 * =========================================================Copyright(c) 2022 CyberLogitec
 * 
 * @FileName : ErrMsgMgmtBC.java
 * 
 * @FileTitle : Error Message ManagementOpen Issues :Change history :
 * 
 * @LastModifyDate : 2022.05.13
 * 
 * @LastModifier :
 * 
 * @LastVersion : 1.0 2022.05.13 1.0 Creation
 * =========================================================
 */
package com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.basic;

import java.util.List;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.vo.ErrMsgVO;

/**
 * ALPS-Thientraining Business Logic Command Interface<br>
 * - ALPS-Thientraining interface to business logic for<br>
 *
 * @author Thien
 * @since J2EE 1.6
 */

public interface ErrMsgMgmtBC {

    /**
     * [Act] for [Business Target].<br>
     * 
     * @param ErrMsgVO
     *            errMsgVO
     * @return List<ErrMsgVO>
     * @exception EventException
     */
    public List<ErrMsgVO> searchErrMsg(ErrMsgVO errMsgVO) throws EventException;

    /**
     * [Act] for [Business Target].<br>
     * 
     * @param ErrMsgVO
     *            [] errMsgVO
     * @param account
     *            SignOnUserAccount
     * @exception EventException
     */
    public void manageErrMsg(ErrMsgVO[] errMsgVO, SignOnUserAccount account)
	    throws EventException;
}
