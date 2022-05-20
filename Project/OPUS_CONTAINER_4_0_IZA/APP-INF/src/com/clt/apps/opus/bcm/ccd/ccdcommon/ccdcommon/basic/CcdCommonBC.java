/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : CcdCommonBC.java
*@FileTitle : Office Access Group
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0

=========================================================*/
package com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.basic; 

import java.util.List;

import com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.vo.ComboListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.GeneralEventResponse;

/**
 * Ccd common Business Logic Command Interface<br>
 *  An interface to the business logic for Ccd common<br>
 *
 * @author 
 * @see 
 * @since J2EE 1.4 
 */
 
public interface CcdCommonBC {

	/**
	 * Account Code checking.<br>
	 * 
	 * @param String acctCd
	 * @return String
	 * @exception EventException
	 */
	public String checkAcctCode(String acctCd) throws EventException;	
	
	/**
	 * Customer Code checking.<br>
	 * 
	 * @param String custCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCustCode(String custCd) throws EventException;	
	
	/**
	 * Country Code checking.<br>
	 * 
	 * @param String cntCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCntCode(String cntCd) throws EventException;
	
	/**
	 * Currency Code checking.<br>
	 * 
	 * @param String currCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCurrCode(String currCd) throws EventException;
	
	/**
	 * Group Commodity Code checking.<br>
	 * 
	 * @param String grpCmdt
	 * @return String
	 * @exception EventException
	 */
	public String checkGrpCmdt(String grpCmdt) throws EventException;
	
	/**
	 * Location Code checking.<br>
	 * 
	 * @param String locCd
	 * @return String
	 * @exception EventException
	 */
	public String checkLocCode(String locCd) throws EventException;
	
	/**
	 * Office Code checking.<br>
	 * 
	 * @param String ofcCd
	 * @return String
	 * @exception EventException
	 */
	public String checkOfcCode(String ofcCd) throws EventException;
	
	/**
	 * Repository Commodity Code checking.<br>
	 * 
	 * @param String repCmdt
	 * @return String
	 * @exception EventException
	 */
	public String checkRepCmdt(String repCmdt) throws EventException;
	
	/**
	 * Region Code checking.<br>
	 * 
	 * @param String rgnCd
	 * @return String
	 * @exception EventException
	 */
	public String checkRgnCode(String rgnCd) throws EventException;
	
	/**
	 * Sales Repository Code checking.<br>
	 * 
	 * @param String slsRepCd
	 * @return String
	 * @exception EventException
	 */
	public String checkSlsRepCode(String slsRepCd) throws EventException;
	
	/**
	 * State Code checking.<br>
	 * 
	 * @param String stateCd
	 * @return String
	 * @exception EventException
	 */
	public String checkStateCode(String stateCd) throws EventException;
	
	/**
	 * State Code checking.<br>
	 * 
	 * @param String stateCd
	 * @param String cntCd
	 * @return String
	 * @exception EventException
	 */
	public String checkStateCode(String stateCd, String cntCd) throws EventException;
	
	/**
	 * Sub Continent Code checking.<br>
	 * 
	 * @param String scontiCd
	 * @return String
	 * @exception EventException
	 */
	public String checkSubConti(String scontiCd) throws EventException;
	
	/**
	 * Sub Trade Code checking.<br>
	 * 
	 * @param String strdCd
	 * @return String
	 * @exception EventException
	 */
	public String checkSubTrdCode(String strdCd) throws EventException;
	
	/**
	 * Trade Code checking.<br>
	 * 
	 * @param String trdCd
	 * @return String
	 * @exception EventException
	 */
	public String checkTrdCode (String trdCd) throws EventException;
	
	/**
	 * Vender Code checking.<br>
	 * 
	 * @param String vndrCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVndrCode(String vndrCd) throws EventException;
	
	/**
	 * Vendor Code Name checking.<br>
	 * 
	 * @param String vndrCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVndrCodeName(String vndrCd) throws EventException;
	
	/**
	 * Vessel Service Lane Code checking.<br>
	 * 
	 * @param String slanCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVslSlanCode(String slanCd) throws EventException;
	
	/**
	 * Yard Code checking.<br>
	 * 
	 * @param String ydCd
	 * @return String
	 * @exception EventException
	 */
	public String checkYardCode(String ydCd) throws EventException;
	
	/**
	 * Zone Code checking.<br>
	 * 
	 * @param String znCd
	 * @return String
	 * @exception EventException
	 */
	public String checkZoneCode (String znCd) throws EventException;
	
	/**
	 * Carrier Code checking.<br>
	 * 
	 * @param String crrCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCrrCode (String crrCd) throws EventException;
	
	/**
	 * Group Customer Code checking.<br>
	 * 
	 * @param String grpCustCd
	 * @return String
	 * @exception EventException
	 */
	public String checkGrpCustCode(String grpCustCd) throws EventException;
	
	/**
	 * Code List retrieve.<br>
	 * 
	 * @param String codeItem
	 * @return List<ComboListVO>
	 * @exception EventException
	 */
	public List<ComboListVO> searchCodeList(String codeItem) throws EventException ;
	
	/**
     * function : return default combo,ibsheet codelist<p>
     * 
     * @param GeneralEventResponse eventResponse
     * @param String[][] array
     * @return GeneralEventResponse
     * @throws EventException
     */
	public GeneralEventResponse searchCommonCodeList(GeneralEventResponse eventResponse,String[][] array) throws EventException ;

	/**
	 * Vender Country Code retrieve.<br>
	 * 
	 * @param String vndrCd
	 * @return String
	 * @exception EventException
	 */
	public String searchVndrCntCode(String vndrCd) throws EventException;
	
	/**
	 * Lease Company Yard Code Check<br>
	 * 
	 * @param String ydCd
	 * @return String
	 * @exception EventException
	 */
	public String checkLseCoYdCode(String ydCd) throws EventException;
	
	/**
	 * EQ SCC Code Check<br>
	 * 
	 * @param String sccCd
	 * @return String
	 * @exception EventException
	 */
	public String checkSccCode(String sccCd) throws EventException;

	/**
	 * Group Customer Code checking.<br>
	 * 
	 * @param String grpCustCd
	 * @param String getCustCntCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCntResult(String grpCustCd, String getCustCntCd) throws EventException;
	
	/**
	 * Check whether Active Yard Code exists<br>
	 * 
	 * @param String locCd
	 * @return String
	 * @exception EventException
	 */
	public String checkActiveYardCode (String locCd) throws EventException;
}