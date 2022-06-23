/*=========================================================
 *Copyright(c) 2022 CyberLogitec
 *@FileName : MoneyMgmtBCImpl.java
 *@FileTitle : Money Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2022.06.13
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2022.04.22
 * 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.moneymgmt.basic;

import java.util.List;
import java.util.Map;


import com.clt.apps.opus.esm.clv.moneymgmt.integration.MoneyMgmtDBDAO;
import com.clt.apps.opus.esm.clv.moneymgmt.vo.*;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * ALPS-Practice3 Business Logic Command Interface<br>
 * - Interface to business logic for ALPS-Practice3<br>
 *
 * @author Thien
 * @since J2EE 1.6
 */
public class MoneyMgmtBCImpl extends BasicCommandSupport implements MoneyMgmtBC {
	// Database Access Object
	private transient MoneyMgmtDBDAO dbDao = null;

	/**
	 * function constructor MoneyMgmtBCImpl<br>
	 * To initialize MoneyMgmtDBDAO<br>
	 */
	public MoneyMgmtBCImpl() {
		dbDao = new MoneyMgmtDBDAO();
	}

	/**
	 * [searchSummaryMoneyMgmt] to get a list of summaryMoney.<br>
	 * 
	 * @param SummaryVO	summaryVO
	 * @return List<SummaryVO>
	 * @exception EventException
	 */
	public List<SummaryVO> searchSummaryMoneyMgmt(SummaryVO summaryVO)
			throws EventException {
		try {
			return dbDao.searchSummaryVO(summaryVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * [searchPartner] to get a list of partner.<br>
	 * 
	 * @param 
	 * @return List<SummarySearchPartnerVO>
	 * @exception EventException
	 */
	public List<SummaryVO> searchPartner() 
			throws EventException {
		try {
			return dbDao.searchPartner();
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * [searchLane] to get a list of lane.<br>
	 * 
	 * @param SummarySearchLaneVO	laneVO
	 * @return Map<String, String>
	 * @exception EventException
	 */
	public List<SummaryVO> searchLane(SummaryVO laneVO)
			throws EventException {
		try {
			return dbDao.searchLane(laneVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * [searchTrade] to get a list of trade.<br>
	 * 
	 * @param SummarySearchTradeVO	tradeVO
	 * @return Map<String, String>
	 * @exception EventException
	 */
	public Map<String, String> searchTrade(SummarySearchTradeVO tradeVO)
			throws EventException {
		try {
			return dbDao.searchTrade(tradeVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * [searchDetailMoneyMgmt] to get a list of detailMoney.<br>
	 * 
	 * @param DetailVO	detailVO
	 * @return List<DetailVO>
	 * @exception EventException
	 */
	public List<DetailVO> searchDetailMoneyMgmt(DetailVO detailVO)
			throws EventException {
		try {
			return dbDao.searchDetailVO(detailVO);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
}
