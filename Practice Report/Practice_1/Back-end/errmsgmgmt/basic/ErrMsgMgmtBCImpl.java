/*=========================================================
 *Copyright(c) 2022 CyberLogitec
 *@FileName : ErrMsgMgmtBCImpl.java
 *@FileTitle : Error Message Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2022.05.13
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2022.05.13 
 * 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.basic;

import java.util.ArrayList;
import java.util.List;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.integration.ErrMsgMgmtDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.vo.ErrMsgVO;

/**
 * ALPS-ThienTraining Business Logic Command Interface<br>
 * interface to business logic for - ALPS-ThienTraining <br>
 *
 * @author Thien
 * @since J2EE 1.6
 */
/**
 * Thien's cmt BCimpl file for integrate with DBDDAO in this file is
 */
public class ErrMsgMgmtBCImpl extends BasicCommandSupport implements
	ErrMsgMgmtBC {

    // Database Access Object
    private transient ErrMsgMgmtDBDAO dbDao = null;

    /**
     * ErrMsgMgmtBCImpl 객체 생성<br>
     * ErrMsgMgmtDBDAO를 생성한다.<br>
     */
    // constructor
    public ErrMsgMgmtBCImpl() {
	dbDao = new ErrMsgMgmtDBDAO();
    }

    /**
     * [Act] for [Business Target].<br>
     * 
     * @param ErrMsgVO
     *            errMsgVO
     * @return List<ErrMsgVO>
     * @exception EventException
     */
    public List<ErrMsgVO> searchErrMsg(ErrMsgVO errMsgVO) throws EventException {
	try {
	    return dbDao.searchErrMsg(errMsgVO);
	} catch (DAOException ex) {
	    throw new EventException(new ErrorHandler(ex).getMessage(), ex);
	} catch (Exception ex) {
	    throw new EventException(new ErrorHandler(ex).getMessage(), ex);
	}

    }

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
	    throws EventException {
	try {
	    List<ErrMsgVO> insertVoList = new ArrayList<ErrMsgVO>();
	    List<ErrMsgVO> updateVoList = new ArrayList<ErrMsgVO>();
	    List<ErrMsgVO> deleteVoList = new ArrayList<ErrMsgVO>();
	    List<ErrMsgVO> list = null;
	    for (int i = 0; i < errMsgVO.length; i++) {
		// Find and add new errMsgVO to insertVoList
		if (errMsgVO[i].getIbflag().equals("I")) {

		    if (dbDao.checkDuplicate(errMsgVO[i]) >= 1) {
			throw new DAOException(
				new ErrorHandler("ERR00001",
					new String[] { errMsgVO[i]
						.getErrMsgCd() }).getMessage());
		    } else {
			insertVoList.add(errMsgVO[i]);
		    }
		} else if (errMsgVO[i].getIbflag().equals("U")) {
		    errMsgVO[i].setUpdUsrId(account.getUsr_id());
		    updateVoList.add(errMsgVO[i]);
		} else if (errMsgVO[i].getIbflag().equals("D")) {
		    deleteVoList.add(errMsgVO[i]);
		}
	    }

	    if (insertVoList.size() > 0) {
		dbDao.addmanageErrMsgS(insertVoList);
	    }

	    if (updateVoList.size() > 0) {
		dbDao.modifymanageErrMsgS(updateVoList);
	    }

	    if (deleteVoList.size() > 0) {
		dbDao.removemanageErrMsgS(deleteVoList);
	    }
	} catch (DAOException ex) {
	    throw new EventException(new ErrorHandler(ex).getMessage(), ex);
	} catch (Exception ex) {
	    throw new EventException(new ErrorHandler(ex).getMessage(), ex);
	}
    }

}