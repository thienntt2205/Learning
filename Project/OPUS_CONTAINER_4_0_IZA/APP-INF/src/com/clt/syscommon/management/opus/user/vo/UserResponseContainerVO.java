/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UserResponseContainerVO.java
*@FileTitle : User Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.19
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.19 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.vo;
/**
 * 
 * 
 *
 * @author KyungBum Kim
 * @see 
 * @since J2EE 1.4
 */
public class UserResponseContainerVO {

	private String usrMessage = null;
	private String etcKey1 = null;
	private String etcKey2 = null;
	private String etcKey3 = null;
	private String etcKey4 = null;
	private String etcKey5 = null;
	
	private ComUserVO[] comuservo = null;

	public void setEtcKey3(String etcKey3) {
		this.etcKey3 = etcKey3;
	}

	public String getEtcKey3() {
		return etcKey3;
	}

	public void setEtcKey1(String etcKey1) {
		this.etcKey1 = etcKey1;
	}

	public String getEtcKey1() {
		return etcKey1;
	}

	public void setEtcKey2(String etcKey2) {
		this.etcKey2 = etcKey2;
	}

	public String getEtcKey2() {
		return etcKey2;
	}

	public void setEtcKey4(String etcKey4) {
		this.etcKey4 = etcKey4;
	}

	public String getEtcKey4() {
		return etcKey4;
	}

	public void setEtcKey5(String etcKey5) {
		this.etcKey5 = etcKey5;
	}

	public String getEtcKey5() {
		return etcKey5;
	}

	public void setUsrMessage(String usrMessage) {
		this.usrMessage = usrMessage;
	}

	public String getUsrMessage() {
		return usrMessage;
	}
	
	public void setComUserVO(ComUserVO[] comuservo) {
		this.comuservo = comuservo;
	}

	public ComUserVO[] getComUserVO() {
		return comuservo;
	}
	
}
