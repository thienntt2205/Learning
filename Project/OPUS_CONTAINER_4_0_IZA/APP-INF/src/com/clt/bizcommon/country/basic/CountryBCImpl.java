/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CountryBCImpl.java
*@FileTitle : Country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.country.basic;

import java.util.List;

import com.clt.bizcommon.country.integration.CountryDBDAO;
import com.clt.bizcommon.country.vo.CountryListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0M1EventResponse,CountryBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CountryBCImpl   extends BasicCommandSupport implements CountryBC {

	// Database Access Object
	private transient CountryDBDAO dbDao=null;

	/**
	 * CountryBCImpl 객체 생성<br>
	 * CountryDBDAO를 생성한다.<br>
	 */
	public CountryBCImpl(){
		dbDao = new CountryDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Country화면에 대한 조회 이벤트 처리<br>
	 * @param CountryListVO countryListVO
	 * @param int iPage
	 * @return List<CountryListVO>
	 * @exception EventException
	 */
	public List<CountryListVO> searchCountryList(CountryListVO countryListVO, int iPage) throws EventException {
		List<CountryListVO> list = null;
        int cnt = 0;
        
        try {
        	cnt    = dbDao.totalCountry(countryListVO);
            list = dbDao.searchCountryList(countryListVO, iPage);
        	if(list.size()>0){
        		list.get(0).setMaxRows(cnt);
        	}
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
		} catch (Exception e2) {
			log.error("err "+e2.toString(),e2);
            throw new EventException(e2.getMessage());
		}
		return list;
	}

	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * Country업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}