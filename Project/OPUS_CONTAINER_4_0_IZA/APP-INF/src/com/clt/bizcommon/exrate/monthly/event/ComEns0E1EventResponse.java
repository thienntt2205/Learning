/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0E1EventResponse.java
*@FileTitle : Monthly
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-24
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-24 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.exrate.monthly.event;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.support.layer.event.EventResponseSupport;



/**
 * RDTO(Data Transfer Object including DB ResultSet)<br>
 * - COM_ENS_0E1 요청을 처리한 서버 실행 정보(DB ResultSet)를 담은 Data Transfer Object<br>
 * - COM_ENS_0E1 호출시 서버에서 View(JSP) Layer로 Argument 형태로 반환<br>
 *
 * @author Hyung Choon_Roh
 * @see BIZCOMMONSC 참조
 * @since J2EE 1.4
 */
public class ComEns0E1EventResponse extends EventResponseSupport {

	// Database ResultSet
	private DBRowSet   rowSet;

	// Success Flag
	private String successFlag;
	
	private int cnt = 0;

	/**
	 * Count 반환<br>
	 * @return
	 */
	public int getCnt() {
		return cnt;
	}

	/**
	 * Count 세팅<br>
	 * @param cnt
	 */
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	/**
	 * COM_ENS_0E1EventResponse 객체를 생성
	 */
	public ComEns0E1EventResponse() {
	}

	/**
	 * COM_ENS_0E1 요청을 처리한 서버 실행 결과(DB ResultSet)를 담아 COM_ENS_0E1EventResponse 객체를 생성
	 * @param rowSet 서버 실행 결과
	 */
	public ComEns0E1EventResponse(DBRowSet rowSet) {
		this.rowSet = rowSet;
	}

	/**
	 * COM_ENS_0E1 요청을 처리한 서버 실행 결과(DB ResultSet)와 성공여부(successFlag)를 담아 COM_ENS_0E1EventResponse 객체를 생성
	 * @param rowSet 서버 실행 결과
	 * @param successFlag 성공여부
	 */
	public ComEns0E1EventResponse(DBRowSet rowSet, String successFlag) {
		this.rowSet=rowSet;
		this.successFlag=successFlag;
	}

	/**
	 * DB ResultSet 반환작업
	 * @return DBRowSet 서버 실행 결과
	 */
	public DBRowSet getRs() {
		return this.rowSet;
	}

	/**
	 * SuccessFlg 반환
	 * @return 
	 */
	public String getSuccessFlag() {
		return this.successFlag ;
	}

	/**
	 * 객체 표현 문자열(COM_ENS_0E1EventResponse)을 반환
	 * @return String COM_ENS_0E1EventResponse
	 */
	public String toString() {
		return "COM_ENS_0E1EventResponse";
	}

	/**
	 * 이벤트 명(COM_ENS_0E1EventResponse)을 반환
	 * @return String COM_ENS_0E1EventResponse
	 */
	public String getEventName() {
		return "COM_ENS_0E1EventResponse";
	}

}