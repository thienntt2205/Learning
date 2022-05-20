/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : PracTrn001Event.java
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

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.esm.clv.thientraining.errmsgmgmt.vo.ErrMsgVO;


/**
 * PRAC_TRN_001 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  PRAC_TRN_001HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Thien
 * @see PRAC_TRN_001HTMLAction 참조
 * @since J2EE 1.6
 */

public class PracTrn001Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	ErrMsgVO errMsgVO = null;
	
	/** Table Value Object Multi Data 처리 */
	ErrMsgVO[] errMsgVOs = null;

	public PracTrn001Event(){}
	
	public void setErrMsgVO(ErrMsgVO errMsgVO){
		this. errMsgVO = errMsgVO;
	}

	public void setErrMsgVOS(ErrMsgVO[] errMsgVOs){
		this. errMsgVOs = errMsgVOs;
	}

	public ErrMsgVO getErrMsgVO(){
		return errMsgVO;
	}

	public ErrMsgVO[] getErrMsgVOS(){
		return errMsgVOs;
	}

}