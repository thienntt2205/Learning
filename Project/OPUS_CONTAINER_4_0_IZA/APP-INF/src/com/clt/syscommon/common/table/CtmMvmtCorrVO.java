/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CtmMvmtCorrVO.java
*@FileTitle : CtmMvmtCorrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.11
*@LastModifier : 김상수
*@LastVersion : 1.0
* 2009.05.11 김상수 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김상수
 * @since J2EE 1.5
 * @see ..
 */

public class CtmMvmtCorrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CtmMvmtCorrVO> models = new ArrayList<CtmMvmtCorrVO>();
	
	/* Column Info */
	private String mvmtEdiTpCd = null;
	/* Column Info */
	private String cnmvSeq = null;
	/* Column Info */
	private String obCntrFlg = null;
	/* Column Info */
	private String bkgRcvTermCd = null;
	/* Column Info */
	private String mvmtEdiMsgTpId = null;
	/* Column Info */
	private String bkgKnt = null;
	/* Column Info */
	private String mvmtCreTpCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String fcntrFlg = null;
	/* Column Info */
	private String cnmvCoCd = null;
	/* Column Info */
	private String blNoChk = null;
	/* Column Info */
	private String cntrHngrBarAtchKnt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrSealNo = null;
	/* Column Info */
	private String ctrtSeq = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String mvmtEdiMsgSeq = null;
	/* Column Info */
	private String cntrDmgFlg = null;
	/* Column Info */
	private String imdtExtFlg = null;
	/* Column Info */
	private String deltUsrId = null;
	/* Column Info */
	private String cnmvLvlNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String deltDt = null;
	/* Column Info */
	private String trnkSkdVoyNo = null;
	/* Column Info */
	private String wblNo = null;
	/* Column Info */
	private String cnmvSplitNo = null;
	/* Column Info */
	private String inpYdCd = null;
	/* Column Info */
	private String substRuleCd = null;
	/* Column Info */
	private String cntrActCd = null;
	/* Column Info */
	private String inlndTrspLicNo = null;
	/* Column Info */
	private String spclCgoFlg = null;
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String fdrVslCd = null;
	/* Column Info */
	private String blNoTp = null;
	/* Column Info */
	private String orgYdCd = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String cnmvCycNo = null;
	/* Column Info */
	private String pkupNo = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String gmtDt = null;
	/* Column Info */
	private String fdrSkdDirCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cnmvIdNo = null;
	/* Column Info */
	private String cntrSvrId = null;
	/* Column Info */
	private String ctrtOfcCtyCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String mvmtEdiMsgYrmondy = null;
	/* Column Info */
	private String cntrDispFlg = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String trnkSkdDirCd = null;
	/* Column Info */
	private String mvmtEdiMsgAreaCd = null;
	/* Column Info */
	private String cntrXchCd = null;
	/* Column Info */
	private String cnmvEvntDt = null;
	/* Column Info */
	private String fdrSkdVoyNo = null;
	/* Column Info */
	private String n4thCostCd = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Column Info */
	private String cntrRfubFlg = null;
	/* Column Info */
	private String cnmvDelYdCd = null;
	/* Column Info */
	private String usrNm = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trnkVslCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cnmvRmk = null;
	/* Column Info */
	private String cntrHngrRckFlg = null;
	/* Column Info */
	private String mgstNo = null;
	/* Column Info */
	private String mvmtTrspModCd = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String destYdCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CtmMvmtCorrVO() {}

	public CtmMvmtCorrVO(String ibflag, String pagerows, String cntrNo, String cnmvYr, String cnmvIdNo, String cnmvSeq, String cnmvSplitNo, String cntrTpszCd, String cnmvCycNo, String cnmvStsCd, String cnmvLvlNo, String cnmvEvntDt, String orgYdCd, String destYdCd, String inpYdCd, String cnmvDelYdCd, String fdrVslCd, String fdrSkdVoyNo, String fdrSkdDirCd, String trnkVslCd, String trnkSkdVoyNo, String trnkSkdDirCd, String chssNo, String mgstNo, String cntrSealNo, String bkgCgoTpCd, String cntrDmgFlg, String fcntrFlg, String obCntrFlg, String bkgRcvTermCd, String vndrSeq, String mvmtTrspModCd, String locCd, String cnmvRmk, String usrNm, String mvmtCreTpCd, String substRuleCd, String spclCgoFlg, String bkgKnt, String bkgNo, String bkgNoSplit, String blNo, String blNoTp, String blNoChk, String cntrHngrRckFlg, String cntrHngrBarAtchKnt, String cntrActCd, String cntrRfubFlg, String cntrDispFlg, String imdtExtFlg, String cntrXchCd, String inlndTrspLicNo, String ctrtOfcCtyCd, String ctrtSeq, String gmtDt, String mvmtEdiTpCd, String mvmtEdiMsgTpId, String mvmtEdiMsgAreaCd, String mvmtEdiMsgYrmondy, String mvmtEdiMsgSeq, String wblNo, String pkupNo, String n4thCostCd, String cntrSvrId, String ofcCd, String cnmvCoCd, String creDt, String updDt, String deltDt, String deltUsrId, String creUsrId, String updUsrId) {
		this.mvmtEdiTpCd = mvmtEdiTpCd;
		this.cnmvSeq = cnmvSeq;
		this.obCntrFlg = obCntrFlg;
		this.bkgRcvTermCd = bkgRcvTermCd;
		this.mvmtEdiMsgTpId = mvmtEdiMsgTpId;
		this.bkgKnt = bkgKnt;
		this.mvmtCreTpCd = mvmtCreTpCd;
		this.ofcCd = ofcCd;
		this.fcntrFlg = fcntrFlg;
		this.cnmvCoCd = cnmvCoCd;
		this.blNoChk = blNoChk;
		this.cntrHngrBarAtchKnt = cntrHngrBarAtchKnt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.cntrSealNo = cntrSealNo;
		this.ctrtSeq = ctrtSeq;
		this.locCd = locCd;
		this.mvmtEdiMsgSeq = mvmtEdiMsgSeq;
		this.cntrDmgFlg = cntrDmgFlg;
		this.imdtExtFlg = imdtExtFlg;
		this.deltUsrId = deltUsrId;
		this.cnmvLvlNo = cnmvLvlNo;
		this.ibflag = ibflag;
		this.deltDt = deltDt;
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		this.wblNo = wblNo;
		this.cnmvSplitNo = cnmvSplitNo;
		this.inpYdCd = inpYdCd;
		this.substRuleCd = substRuleCd;
		this.cntrActCd = cntrActCd;
		this.inlndTrspLicNo = inlndTrspLicNo;
		this.spclCgoFlg = spclCgoFlg;
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.fdrVslCd = fdrVslCd;
		this.blNoTp = blNoTp;
		this.orgYdCd = orgYdCd;
		this.bkgNoSplit = bkgNoSplit;
		this.cnmvCycNo = cnmvCycNo;
		this.pkupNo = pkupNo;
		this.bkgNo = bkgNo;
		this.cnmvYr = cnmvYr;
		this.gmtDt = gmtDt;
		this.fdrSkdDirCd = fdrSkdDirCd;
		this.cntrNo = cntrNo;
		this.cnmvIdNo = cnmvIdNo;
		this.cntrSvrId = cntrSvrId;
		this.ctrtOfcCtyCd = ctrtOfcCtyCd;
		this.cntrTpszCd = cntrTpszCd;
		this.vndrSeq = vndrSeq;
		this.mvmtEdiMsgYrmondy = mvmtEdiMsgYrmondy;
		this.cntrDispFlg = cntrDispFlg;
		this.chssNo = chssNo;
		this.trnkSkdDirCd = trnkSkdDirCd;
		this.mvmtEdiMsgAreaCd = mvmtEdiMsgAreaCd;
		this.cntrXchCd = cntrXchCd;
		this.cnmvEvntDt = cnmvEvntDt;
		this.fdrSkdVoyNo = fdrSkdVoyNo;
		this.n4thCostCd = n4thCostCd;
		this.cnmvStsCd = cnmvStsCd;
		this.cntrRfubFlg = cntrRfubFlg;
		this.cnmvDelYdCd = cnmvDelYdCd;
		this.usrNm = usrNm;
		this.creDt = creDt;
		this.trnkVslCd = trnkVslCd;
		this.creUsrId = creUsrId;
		this.cnmvRmk = cnmvRmk;
		this.cntrHngrRckFlg = cntrHngrRckFlg;
		this.mgstNo = mgstNo;
		this.mvmtTrspModCd = mvmtTrspModCd;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.destYdCd = destYdCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("mvmt_edi_tp_cd", getMvmtEdiTpCd());
		this.hashColumns.put("cnmv_seq", getCnmvSeq());
		this.hashColumns.put("ob_cntr_flg", getObCntrFlg());
		this.hashColumns.put("bkg_rcv_term_cd", getBkgRcvTermCd());
		this.hashColumns.put("mvmt_edi_msg_tp_id", getMvmtEdiMsgTpId());
		this.hashColumns.put("bkg_knt", getBkgKnt());
		this.hashColumns.put("mvmt_cre_tp_cd", getMvmtCreTpCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("fcntr_flg", getFcntrFlg());
		this.hashColumns.put("cnmv_co_cd", getCnmvCoCd());
		this.hashColumns.put("bl_no_chk", getBlNoChk());
		this.hashColumns.put("cntr_hngr_bar_atch_knt", getCntrHngrBarAtchKnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_seal_no", getCntrSealNo());
		this.hashColumns.put("ctrt_seq", getCtrtSeq());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("mvmt_edi_msg_seq", getMvmtEdiMsgSeq());
		this.hashColumns.put("cntr_dmg_flg", getCntrDmgFlg());
		this.hashColumns.put("imdt_ext_flg", getImdtExtFlg());
		this.hashColumns.put("delt_usr_id", getDeltUsrId());
		this.hashColumns.put("cnmv_lvl_no", getCnmvLvlNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("trnk_skd_voy_no", getTrnkSkdVoyNo());
		this.hashColumns.put("wbl_no", getWblNo());
		this.hashColumns.put("cnmv_split_no", getCnmvSplitNo());
		this.hashColumns.put("inp_yd_cd", getInpYdCd());
		this.hashColumns.put("subst_rule_cd", getSubstRuleCd());
		this.hashColumns.put("cntr_act_cd", getCntrActCd());
		this.hashColumns.put("inlnd_trsp_lic_no", getInlndTrspLicNo());
		this.hashColumns.put("spcl_cgo_flg", getSpclCgoFlg());
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("fdr_vsl_cd", getFdrVslCd());
		this.hashColumns.put("bl_no_tp", getBlNoTp());
		this.hashColumns.put("org_yd_cd", getOrgYdCd());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("cnmv_cyc_no", getCnmvCycNo());
		this.hashColumns.put("pkup_no", getPkupNo());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("gmt_dt", getGmtDt());
		this.hashColumns.put("fdr_skd_dir_cd", getFdrSkdDirCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cnmv_id_no", getCnmvIdNo());
		this.hashColumns.put("cntr_svr_id", getCntrSvrId());
		this.hashColumns.put("ctrt_ofc_cty_cd", getCtrtOfcCtyCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("mvmt_edi_msg_yrmondy", getMvmtEdiMsgYrmondy());
		this.hashColumns.put("cntr_disp_flg", getCntrDispFlg());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("trnk_skd_dir_cd", getTrnkSkdDirCd());
		this.hashColumns.put("mvmt_edi_msg_area_cd", getMvmtEdiMsgAreaCd());
		this.hashColumns.put("cntr_xch_cd", getCntrXchCd());
		this.hashColumns.put("cnmv_evnt_dt", getCnmvEvntDt());
		this.hashColumns.put("fdr_skd_voy_no", getFdrSkdVoyNo());
		this.hashColumns.put("n4th_cost_cd", getN4thCostCd());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("cntr_rfub_flg", getCntrRfubFlg());
		this.hashColumns.put("cnmv_del_yd_cd", getCnmvDelYdCd());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trnk_vsl_cd", getTrnkVslCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cnmv_rmk", getCnmvRmk());
		this.hashColumns.put("cntr_hngr_rck_flg", getCntrHngrRckFlg());
		this.hashColumns.put("mgst_no", getMgstNo());
		this.hashColumns.put("mvmt_trsp_mod_cd", getMvmtTrspModCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dest_yd_cd", getDestYdCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("mvmt_edi_tp_cd", "mvmtEdiTpCd");
		this.hashFields.put("cnmv_seq", "cnmvSeq");
		this.hashFields.put("ob_cntr_flg", "obCntrFlg");
		this.hashFields.put("bkg_rcv_term_cd", "bkgRcvTermCd");
		this.hashFields.put("mvmt_edi_msg_tp_id", "mvmtEdiMsgTpId");
		this.hashFields.put("bkg_knt", "bkgKnt");
		this.hashFields.put("mvmt_cre_tp_cd", "mvmtCreTpCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("fcntr_flg", "fcntrFlg");
		this.hashFields.put("cnmv_co_cd", "cnmvCoCd");
		this.hashFields.put("bl_no_chk", "blNoChk");
		this.hashFields.put("cntr_hngr_bar_atch_knt", "cntrHngrBarAtchKnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_seal_no", "cntrSealNo");
		this.hashFields.put("ctrt_seq", "ctrtSeq");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("mvmt_edi_msg_seq", "mvmtEdiMsgSeq");
		this.hashFields.put("cntr_dmg_flg", "cntrDmgFlg");
		this.hashFields.put("imdt_ext_flg", "imdtExtFlg");
		this.hashFields.put("delt_usr_id", "deltUsrId");
		this.hashFields.put("cnmv_lvl_no", "cnmvLvlNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("trnk_skd_voy_no", "trnkSkdVoyNo");
		this.hashFields.put("wbl_no", "wblNo");
		this.hashFields.put("cnmv_split_no", "cnmvSplitNo");
		this.hashFields.put("inp_yd_cd", "inpYdCd");
		this.hashFields.put("subst_rule_cd", "substRuleCd");
		this.hashFields.put("cntr_act_cd", "cntrActCd");
		this.hashFields.put("inlnd_trsp_lic_no", "inlndTrspLicNo");
		this.hashFields.put("spcl_cgo_flg", "spclCgoFlg");
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("fdr_vsl_cd", "fdrVslCd");
		this.hashFields.put("bl_no_tp", "blNoTp");
		this.hashFields.put("org_yd_cd", "orgYdCd");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("cnmv_cyc_no", "cnmvCycNo");
		this.hashFields.put("pkup_no", "pkupNo");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("gmt_dt", "gmtDt");
		this.hashFields.put("fdr_skd_dir_cd", "fdrSkdDirCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cnmv_id_no", "cnmvIdNo");
		this.hashFields.put("cntr_svr_id", "cntrSvrId");
		this.hashFields.put("ctrt_ofc_cty_cd", "ctrtOfcCtyCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("mvmt_edi_msg_yrmondy", "mvmtEdiMsgYrmondy");
		this.hashFields.put("cntr_disp_flg", "cntrDispFlg");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("trnk_skd_dir_cd", "trnkSkdDirCd");
		this.hashFields.put("mvmt_edi_msg_area_cd", "mvmtEdiMsgAreaCd");
		this.hashFields.put("cntr_xch_cd", "cntrXchCd");
		this.hashFields.put("cnmv_evnt_dt", "cnmvEvntDt");
		this.hashFields.put("fdr_skd_voy_no", "fdrSkdVoyNo");
		this.hashFields.put("n4th_cost_cd", "n4thCostCd");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("cntr_rfub_flg", "cntrRfubFlg");
		this.hashFields.put("cnmv_del_yd_cd", "cnmvDelYdCd");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trnk_vsl_cd", "trnkVslCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cnmv_rmk", "cnmvRmk");
		this.hashFields.put("cntr_hngr_rck_flg", "cntrHngrRckFlg");
		this.hashFields.put("mgst_no", "mgstNo");
		this.hashFields.put("mvmt_trsp_mod_cd", "mvmtTrspModCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dest_yd_cd", "destYdCd");
		return this.hashFields;
	}
	
	public String getMvmtEdiTpCd() {
		return this.mvmtEdiTpCd;
	}
	public String getCnmvSeq() {
		return this.cnmvSeq;
	}
	public String getObCntrFlg() {
		return this.obCntrFlg;
	}
	public String getBkgRcvTermCd() {
		return this.bkgRcvTermCd;
	}
	public String getMvmtEdiMsgTpId() {
		return this.mvmtEdiMsgTpId;
	}
	public String getBkgKnt() {
		return this.bkgKnt;
	}
	public String getMvmtCreTpCd() {
		return this.mvmtCreTpCd;
	}
	public String getOfcCd() {
		return this.ofcCd;
	}
	public String getFcntrFlg() {
		return this.fcntrFlg;
	}
	public String getCnmvCoCd() {
		return this.cnmvCoCd;
	}
	public String getBlNoChk() {
		return this.blNoChk;
	}
	public String getCntrHngrBarAtchKnt() {
		return this.cntrHngrBarAtchKnt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCntrSealNo() {
		return this.cntrSealNo;
	}
	public String getCtrtSeq() {
		return this.ctrtSeq;
	}
	public String getLocCd() {
		return this.locCd;
	}
	public String getMvmtEdiMsgSeq() {
		return this.mvmtEdiMsgSeq;
	}
	public String getCntrDmgFlg() {
		return this.cntrDmgFlg;
	}
	public String getImdtExtFlg() {
		return this.imdtExtFlg;
	}
	public String getDeltUsrId() {
		return this.deltUsrId;
	}
	public String getCnmvLvlNo() {
		return this.cnmvLvlNo;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getDeltDt() {
		return this.deltDt;
	}
	public String getTrnkSkdVoyNo() {
		return this.trnkSkdVoyNo;
	}
	public String getWblNo() {
		return this.wblNo;
	}
	public String getCnmvSplitNo() {
		return this.cnmvSplitNo;
	}
	public String getInpYdCd() {
		return this.inpYdCd;
	}
	public String getSubstRuleCd() {
		return this.substRuleCd;
	}
	public String getCntrActCd() {
		return this.cntrActCd;
	}
	public String getInlndTrspLicNo() {
		return this.inlndTrspLicNo;
	}
	public String getSpclCgoFlg() {
		return this.spclCgoFlg;
	}
	public String getBkgCgoTpCd() {
		return this.bkgCgoTpCd;
	}
	public String getFdrVslCd() {
		return this.fdrVslCd;
	}
	public String getBlNoTp() {
		return this.blNoTp;
	}
	public String getOrgYdCd() {
		return this.orgYdCd;
	}
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getCnmvCycNo() {
		return this.cnmvCycNo;
	}
	public String getPkupNo() {
		return this.pkupNo;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	public String getGmtDt() {
		return this.gmtDt;
	}
	public String getFdrSkdDirCd() {
		return this.fdrSkdDirCd;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getCnmvIdNo() {
		return this.cnmvIdNo;
	}
	public String getCntrSvrId() {
		return this.cntrSvrId;
	}
	public String getCtrtOfcCtyCd() {
		return this.ctrtOfcCtyCd;
	}
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getMvmtEdiMsgYrmondy() {
		return this.mvmtEdiMsgYrmondy;
	}
	public String getCntrDispFlg() {
		return this.cntrDispFlg;
	}
	public String getChssNo() {
		return this.chssNo;
	}
	public String getTrnkSkdDirCd() {
		return this.trnkSkdDirCd;
	}
	public String getMvmtEdiMsgAreaCd() {
		return this.mvmtEdiMsgAreaCd;
	}
	public String getCntrXchCd() {
		return this.cntrXchCd;
	}
	public String getCnmvEvntDt() {
		return this.cnmvEvntDt;
	}
	public String getFdrSkdVoyNo() {
		return this.fdrSkdVoyNo;
	}
	public String getN4thCostCd() {
		return this.n4thCostCd;
	}
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
	}
	public String getCntrRfubFlg() {
		return this.cntrRfubFlg;
	}
	public String getCnmvDelYdCd() {
		return this.cnmvDelYdCd;
	}
	public String getUsrNm() {
		return this.usrNm;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getTrnkVslCd() {
		return this.trnkVslCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getCnmvRmk() {
		return this.cnmvRmk;
	}
	public String getCntrHngrRckFlg() {
		return this.cntrHngrRckFlg;
	}
	public String getMgstNo() {
		return this.mgstNo;
	}
	public String getMvmtTrspModCd() {
		return this.mvmtTrspModCd;
	}
	public String getBlNo() {
		return this.blNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getDestYdCd() {
		return this.destYdCd;
	}

	public void setMvmtEdiTpCd(String mvmtEdiTpCd) {
		this.mvmtEdiTpCd = mvmtEdiTpCd;
		//this.mvmtEdiTpCd=true;
	}
	public void setCnmvSeq(String cnmvSeq) {
		this.cnmvSeq = cnmvSeq;
		//this.cnmvSeq=true;
	}
	public void setObCntrFlg(String obCntrFlg) {
		this.obCntrFlg = obCntrFlg;
		//this.obCntrFlg=true;
	}
	public void setBkgRcvTermCd(String bkgRcvTermCd) {
		this.bkgRcvTermCd = bkgRcvTermCd;
		//this.bkgRcvTermCd=true;
	}
	public void setMvmtEdiMsgTpId(String mvmtEdiMsgTpId) {
		this.mvmtEdiMsgTpId = mvmtEdiMsgTpId;
		//this.mvmtEdiMsgTpId=true;
	}
	public void setBkgKnt(String bkgKnt) {
		this.bkgKnt = bkgKnt;
		//this.bkgKnt=true;
	}
	public void setMvmtCreTpCd(String mvmtCreTpCd) {
		this.mvmtCreTpCd = mvmtCreTpCd;
		//this.mvmtCreTpCd=true;
	}
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
		//this.ofcCd=true;
	}
	public void setFcntrFlg(String fcntrFlg) {
		this.fcntrFlg = fcntrFlg;
		//this.fcntrFlg=true;
	}
	public void setCnmvCoCd(String cnmvCoCd) {
		this.cnmvCoCd = cnmvCoCd;
		//this.cnmvCoCd=true;
	}
	public void setBlNoChk(String blNoChk) {
		this.blNoChk = blNoChk;
		//this.blNoChk=true;
	}
	public void setCntrHngrBarAtchKnt(String cntrHngrBarAtchKnt) {
		this.cntrHngrBarAtchKnt = cntrHngrBarAtchKnt;
		//this.cntrHngrBarAtchKnt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCntrSealNo(String cntrSealNo) {
		this.cntrSealNo = cntrSealNo;
		//this.cntrSealNo=true;
	}
	public void setCtrtSeq(String ctrtSeq) {
		this.ctrtSeq = ctrtSeq;
		//this.ctrtSeq=true;
	}
	public void setLocCd(String locCd) {
		this.locCd = locCd;
		//this.locCd=true;
	}
	public void setMvmtEdiMsgSeq(String mvmtEdiMsgSeq) {
		this.mvmtEdiMsgSeq = mvmtEdiMsgSeq;
		//this.mvmtEdiMsgSeq=true;
	}
	public void setCntrDmgFlg(String cntrDmgFlg) {
		this.cntrDmgFlg = cntrDmgFlg;
		//this.cntrDmgFlg=true;
	}
	public void setImdtExtFlg(String imdtExtFlg) {
		this.imdtExtFlg = imdtExtFlg;
		//this.imdtExtFlg=true;
	}
	public void setDeltUsrId(String deltUsrId) {
		this.deltUsrId = deltUsrId;
		//this.deltUsrId=true;
	}
	public void setCnmvLvlNo(String cnmvLvlNo) {
		this.cnmvLvlNo = cnmvLvlNo;
		//this.cnmvLvlNo=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setDeltDt(String deltDt) {
		this.deltDt = deltDt;
		//this.deltDt=true;
	}
	public void setTrnkSkdVoyNo(String trnkSkdVoyNo) {
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		//this.trnkSkdVoyNo=true;
	}
	public void setWblNo(String wblNo) {
		this.wblNo = wblNo;
		//this.wblNo=true;
	}
	public void setCnmvSplitNo(String cnmvSplitNo) {
		this.cnmvSplitNo = cnmvSplitNo;
		//this.cnmvSplitNo=true;
	}
	public void setInpYdCd(String inpYdCd) {
		this.inpYdCd = inpYdCd;
		//this.inpYdCd=true;
	}
	public void setSubstRuleCd(String substRuleCd) {
		this.substRuleCd = substRuleCd;
		//this.substRuleCd=true;
	}
	public void setCntrActCd(String cntrActCd) {
		this.cntrActCd = cntrActCd;
		//this.cntrActCd=true;
	}
	public void setInlndTrspLicNo(String inlndTrspLicNo) {
		this.inlndTrspLicNo = inlndTrspLicNo;
		//this.inlndTrspLicNo=true;
	}
	public void setSpclCgoFlg(String spclCgoFlg) {
		this.spclCgoFlg = spclCgoFlg;
		//this.spclCgoFlg=true;
	}
	public void setBkgCgoTpCd(String bkgCgoTpCd) {
		this.bkgCgoTpCd = bkgCgoTpCd;
		//this.bkgCgoTpCd=true;
	}
	public void setFdrVslCd(String fdrVslCd) {
		this.fdrVslCd = fdrVslCd;
		//this.fdrVslCd=true;
	}
	public void setBlNoTp(String blNoTp) {
		this.blNoTp = blNoTp;
		//this.blNoTp=true;
	}
	public void setOrgYdCd(String orgYdCd) {
		this.orgYdCd = orgYdCd;
		//this.orgYdCd=true;
	}
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setCnmvCycNo(String cnmvCycNo) {
		this.cnmvCycNo = cnmvCycNo;
		//this.cnmvCycNo=true;
	}
	public void setPkupNo(String pkupNo) {
		this.pkupNo = pkupNo;
		//this.pkupNo=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
		//this.cnmvYr=true;
	}
	public void setGmtDt(String gmtDt) {
		this.gmtDt = gmtDt;
		//this.gmtDt=true;
	}
	public void setFdrSkdDirCd(String fdrSkdDirCd) {
		this.fdrSkdDirCd = fdrSkdDirCd;
		//this.fdrSkdDirCd=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setCnmvIdNo(String cnmvIdNo) {
		this.cnmvIdNo = cnmvIdNo;
		//this.cnmvIdNo=true;
	}
	public void setCntrSvrId(String cntrSvrId) {
		this.cntrSvrId = cntrSvrId;
		//this.cntrSvrId=true;
	}
	public void setCtrtOfcCtyCd(String ctrtOfcCtyCd) {
		this.ctrtOfcCtyCd = ctrtOfcCtyCd;
		//this.ctrtOfcCtyCd=true;
	}
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
		//this.cntrTpszCd=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setMvmtEdiMsgYrmondy(String mvmtEdiMsgYrmondy) {
		this.mvmtEdiMsgYrmondy = mvmtEdiMsgYrmondy;
		//this.mvmtEdiMsgYrmondy=true;
	}
	public void setCntrDispFlg(String cntrDispFlg) {
		this.cntrDispFlg = cntrDispFlg;
		//this.cntrDispFlg=true;
	}
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
		//this.chssNo=true;
	}
	public void setTrnkSkdDirCd(String trnkSkdDirCd) {
		this.trnkSkdDirCd = trnkSkdDirCd;
		//this.trnkSkdDirCd=true;
	}
	public void setMvmtEdiMsgAreaCd(String mvmtEdiMsgAreaCd) {
		this.mvmtEdiMsgAreaCd = mvmtEdiMsgAreaCd;
		//this.mvmtEdiMsgAreaCd=true;
	}
	public void setCntrXchCd(String cntrXchCd) {
		this.cntrXchCd = cntrXchCd;
		//this.cntrXchCd=true;
	}
	public void setCnmvEvntDt(String cnmvEvntDt) {
		this.cnmvEvntDt = cnmvEvntDt;
		//this.cnmvEvntDt=true;
	}
	public void setFdrSkdVoyNo(String fdrSkdVoyNo) {
		this.fdrSkdVoyNo = fdrSkdVoyNo;
		//this.fdrSkdVoyNo=true;
	}
	public void setN4thCostCd(String n4thCostCd) {
		this.n4thCostCd = n4thCostCd;
		//this.n4thCostCd=true;
	}
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
		//this.cnmvStsCd=true;
	}
	public void setCntrRfubFlg(String cntrRfubFlg) {
		this.cntrRfubFlg = cntrRfubFlg;
		//this.cntrRfubFlg=true;
	}
	public void setCnmvDelYdCd(String cnmvDelYdCd) {
		this.cnmvDelYdCd = cnmvDelYdCd;
		//this.cnmvDelYdCd=true;
	}
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
		//this.usrNm=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setTrnkVslCd(String trnkVslCd) {
		this.trnkVslCd = trnkVslCd;
		//this.trnkVslCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setCnmvRmk(String cnmvRmk) {
		this.cnmvRmk = cnmvRmk;
		//this.cnmvRmk=true;
	}
	public void setCntrHngrRckFlg(String cntrHngrRckFlg) {
		this.cntrHngrRckFlg = cntrHngrRckFlg;
		//this.cntrHngrRckFlg=true;
	}
	public void setMgstNo(String mgstNo) {
		this.mgstNo = mgstNo;
		//this.mgstNo=true;
	}
	public void setMvmtTrspModCd(String mvmtTrspModCd) {
		this.mvmtTrspModCd = mvmtTrspModCd;
		//this.mvmtTrspModCd=true;
	}
	public void setBlNo(String blNo) {
		this.blNo = blNo;
		//this.blNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setDestYdCd(String destYdCd) {
		this.destYdCd = destYdCd;
		//this.destYdCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setMvmtEdiTpCd(JSPUtil.getParameter(request, "mvmt_edi_tp_cd", ""));
		setCnmvSeq(JSPUtil.getParameter(request, "cnmv_seq", ""));
		setObCntrFlg(JSPUtil.getParameter(request, "ob_cntr_flg", ""));
		setBkgRcvTermCd(JSPUtil.getParameter(request, "bkg_rcv_term_cd", ""));
		setMvmtEdiMsgTpId(JSPUtil.getParameter(request, "mvmt_edi_msg_tp_id", ""));
		setBkgKnt(JSPUtil.getParameter(request, "bkg_knt", ""));
		setMvmtCreTpCd(JSPUtil.getParameter(request, "mvmt_cre_tp_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setFcntrFlg(JSPUtil.getParameter(request, "fcntr_flg", ""));
		setCnmvCoCd(JSPUtil.getParameter(request, "cnmv_co_cd", ""));
		setBlNoChk(JSPUtil.getParameter(request, "bl_no_chk", ""));
		setCntrHngrBarAtchKnt(JSPUtil.getParameter(request, "cntr_hngr_bar_atch_knt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCntrSealNo(JSPUtil.getParameter(request, "cntr_seal_no", ""));
		setCtrtSeq(JSPUtil.getParameter(request, "ctrt_seq", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setMvmtEdiMsgSeq(JSPUtil.getParameter(request, "mvmt_edi_msg_seq", ""));
		setCntrDmgFlg(JSPUtil.getParameter(request, "cntr_dmg_flg", ""));
		setImdtExtFlg(JSPUtil.getParameter(request, "imdt_ext_flg", ""));
		setDeltUsrId(JSPUtil.getParameter(request, "delt_usr_id", ""));
		setCnmvLvlNo(JSPUtil.getParameter(request, "cnmv_lvl_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDeltDt(JSPUtil.getParameter(request, "delt_dt", ""));
		setTrnkSkdVoyNo(JSPUtil.getParameter(request, "trnk_skd_voy_no", ""));
		setWblNo(JSPUtil.getParameter(request, "wbl_no", ""));
		setCnmvSplitNo(JSPUtil.getParameter(request, "cnmv_split_no", ""));
		setInpYdCd(JSPUtil.getParameter(request, "inp_yd_cd", ""));
		setSubstRuleCd(JSPUtil.getParameter(request, "subst_rule_cd", ""));
		setCntrActCd(JSPUtil.getParameter(request, "cntr_act_cd", ""));
		setInlndTrspLicNo(JSPUtil.getParameter(request, "inlnd_trsp_lic_no", ""));
		setSpclCgoFlg(JSPUtil.getParameter(request, "spcl_cgo_flg", ""));
		setBkgCgoTpCd(JSPUtil.getParameter(request, "bkg_cgo_tp_cd", ""));
		setFdrVslCd(JSPUtil.getParameter(request, "fdr_vsl_cd", ""));
		setBlNoTp(JSPUtil.getParameter(request, "bl_no_tp", ""));
		setOrgYdCd(JSPUtil.getParameter(request, "org_yd_cd", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setCnmvCycNo(JSPUtil.getParameter(request, "cnmv_cyc_no", ""));
		setPkupNo(JSPUtil.getParameter(request, "pkup_no", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCnmvYr(JSPUtil.getParameter(request, "cnmv_yr", ""));
		setGmtDt(JSPUtil.getParameter(request, "gmt_dt", ""));
		setFdrSkdDirCd(JSPUtil.getParameter(request, "fdr_skd_dir_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCnmvIdNo(JSPUtil.getParameter(request, "cnmv_id_no", ""));
		setCntrSvrId(JSPUtil.getParameter(request, "cntr_svr_id", ""));
		setCtrtOfcCtyCd(JSPUtil.getParameter(request, "ctrt_ofc_cty_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setMvmtEdiMsgYrmondy(JSPUtil.getParameter(request, "mvmt_edi_msg_yrmondy", ""));
		setCntrDispFlg(JSPUtil.getParameter(request, "cntr_disp_flg", ""));
		setChssNo(JSPUtil.getParameter(request, "chss_no", ""));
		setTrnkSkdDirCd(JSPUtil.getParameter(request, "trnk_skd_dir_cd", ""));
		setMvmtEdiMsgAreaCd(JSPUtil.getParameter(request, "mvmt_edi_msg_area_cd", ""));
		setCntrXchCd(JSPUtil.getParameter(request, "cntr_xch_cd", ""));
		setCnmvEvntDt(JSPUtil.getParameter(request, "cnmv_evnt_dt", ""));
		setFdrSkdVoyNo(JSPUtil.getParameter(request, "fdr_skd_voy_no", ""));
		setN4thCostCd(JSPUtil.getParameter(request, "n4th_cost_cd", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, "cnmv_sts_cd", ""));
		setCntrRfubFlg(JSPUtil.getParameter(request, "cntr_rfub_flg", ""));
		setCnmvDelYdCd(JSPUtil.getParameter(request, "cnmv_del_yd_cd", ""));
		setUsrNm(JSPUtil.getParameter(request, "usr_nm", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrnkVslCd(JSPUtil.getParameter(request, "trnk_vsl_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCnmvRmk(JSPUtil.getParameter(request, "cnmv_rmk", ""));
		setCntrHngrRckFlg(JSPUtil.getParameter(request, "cntr_hngr_rck_flg", ""));
		setMgstNo(JSPUtil.getParameter(request, "mgst_no", ""));
		setMvmtTrspModCd(JSPUtil.getParameter(request, "mvmt_trsp_mod_cd", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDestYdCd(JSPUtil.getParameter(request, "dest_yd_cd", ""));
	}

	public CtmMvmtCorrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CtmMvmtCorrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CtmMvmtCorrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] mvmtEdiTpCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_tp_cd".trim(), length));
			String[] cnmvSeq = (JSPUtil.getParameter(request, prefix	+ "cnmv_seq".trim(), length));
			String[] obCntrFlg = (JSPUtil.getParameter(request, prefix	+ "ob_cntr_flg".trim(), length));
			String[] bkgRcvTermCd = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_term_cd".trim(), length));
			String[] mvmtEdiMsgTpId = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_msg_tp_id".trim(), length));
			String[] bkgKnt = (JSPUtil.getParameter(request, prefix	+ "bkg_knt".trim(), length));
			String[] mvmtCreTpCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_cre_tp_cd".trim(), length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd".trim(), length));
			String[] fcntrFlg = (JSPUtil.getParameter(request, prefix	+ "fcntr_flg".trim(), length));
			String[] cnmvCoCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_co_cd".trim(), length));
			String[] blNoChk = (JSPUtil.getParameter(request, prefix	+ "bl_no_chk".trim(), length));
			String[] cntrHngrBarAtchKnt = (JSPUtil.getParameter(request, prefix	+ "cntr_hngr_bar_atch_knt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] cntrSealNo = (JSPUtil.getParameter(request, prefix	+ "cntr_seal_no".trim(), length));
			String[] ctrtSeq = (JSPUtil.getParameter(request, prefix	+ "ctrt_seq".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] mvmtEdiMsgSeq = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_msg_seq".trim(), length));
			String[] cntrDmgFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_dmg_flg".trim(), length));
			String[] imdtExtFlg = (JSPUtil.getParameter(request, prefix	+ "imdt_ext_flg".trim(), length));
			String[] deltUsrId = (JSPUtil.getParameter(request, prefix	+ "delt_usr_id".trim(), length));
			String[] cnmvLvlNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_lvl_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix	+ "delt_dt".trim(), length));
			String[] trnkSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_voy_no".trim(), length));
			String[] wblNo = (JSPUtil.getParameter(request, prefix	+ "wbl_no".trim(), length));
			String[] cnmvSplitNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_split_no".trim(), length));
			String[] inpYdCd = (JSPUtil.getParameter(request, prefix	+ "inp_yd_cd".trim(), length));
			String[] substRuleCd = (JSPUtil.getParameter(request, prefix	+ "subst_rule_cd".trim(), length));
			String[] cntrActCd = (JSPUtil.getParameter(request, prefix	+ "cntr_act_cd".trim(), length));
			String[] inlndTrspLicNo = (JSPUtil.getParameter(request, prefix	+ "inlnd_trsp_lic_no".trim(), length));
			String[] spclCgoFlg = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_flg".trim(), length));
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd".trim(), length));
			String[] fdrVslCd = (JSPUtil.getParameter(request, prefix	+ "fdr_vsl_cd".trim(), length));
			String[] blNoTp = (JSPUtil.getParameter(request, prefix	+ "bl_no_tp".trim(), length));
			String[] orgYdCd = (JSPUtil.getParameter(request, prefix	+ "org_yd_cd".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] cnmvCycNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_cyc_no".trim(), length));
			String[] pkupNo = (JSPUtil.getParameter(request, prefix	+ "pkup_no".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr".trim(), length));
			String[] gmtDt = (JSPUtil.getParameter(request, prefix	+ "gmt_dt".trim(), length));
			String[] fdrSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "fdr_skd_dir_cd".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] cnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_id_no".trim(), length));
			String[] cntrSvrId = (JSPUtil.getParameter(request, prefix	+ "cntr_svr_id".trim(), length));
			String[] ctrtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cty_cd".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] mvmtEdiMsgYrmondy = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_msg_yrmondy".trim(), length));
			String[] cntrDispFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_disp_flg".trim(), length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no".trim(), length));
			String[] trnkSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_dir_cd".trim(), length));
			String[] mvmtEdiMsgAreaCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_edi_msg_area_cd".trim(), length));
			String[] cntrXchCd = (JSPUtil.getParameter(request, prefix	+ "cntr_xch_cd".trim(), length));
			String[] cnmvEvntDt = (JSPUtil.getParameter(request, prefix	+ "cnmv_evnt_dt".trim(), length));
			String[] fdrSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "fdr_skd_voy_no".trim(), length));
			String[] n4thCostCd = (JSPUtil.getParameter(request, prefix	+ "n4th_cost_cd".trim(), length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd".trim(), length));
			String[] cntrRfubFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_rfub_flg".trim(), length));
			String[] cnmvDelYdCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_del_yd_cd".trim(), length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] trnkVslCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] cnmvRmk = (JSPUtil.getParameter(request, prefix	+ "cnmv_rmk".trim(), length));
			String[] cntrHngrRckFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_hngr_rck_flg".trim(), length));
			String[] mgstNo = (JSPUtil.getParameter(request, prefix	+ "mgst_no".trim(), length));
			String[] mvmtTrspModCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_trsp_mod_cd".trim(), length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] destYdCd = (JSPUtil.getParameter(request, prefix	+ "dest_yd_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CtmMvmtCorrVO();
				if (mvmtEdiTpCd[i] != null)
					model.setMvmtEdiTpCd(mvmtEdiTpCd[i]);
				if (cnmvSeq[i] != null)
					model.setCnmvSeq(cnmvSeq[i]);
				if (obCntrFlg[i] != null)
					model.setObCntrFlg(obCntrFlg[i]);
				if (bkgRcvTermCd[i] != null)
					model.setBkgRcvTermCd(bkgRcvTermCd[i]);
				if (mvmtEdiMsgTpId[i] != null)
					model.setMvmtEdiMsgTpId(mvmtEdiMsgTpId[i]);
				if (bkgKnt[i] != null)
					model.setBkgKnt(bkgKnt[i]);
				if (mvmtCreTpCd[i] != null)
					model.setMvmtCreTpCd(mvmtCreTpCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (fcntrFlg[i] != null)
					model.setFcntrFlg(fcntrFlg[i]);
				if (cnmvCoCd[i] != null)
					model.setCnmvCoCd(cnmvCoCd[i]);
				if (blNoChk[i] != null)
					model.setBlNoChk(blNoChk[i]);
				if (cntrHngrBarAtchKnt[i] != null)
					model.setCntrHngrBarAtchKnt(cntrHngrBarAtchKnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrSealNo[i] != null)
					model.setCntrSealNo(cntrSealNo[i]);
				if (ctrtSeq[i] != null)
					model.setCtrtSeq(ctrtSeq[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (mvmtEdiMsgSeq[i] != null)
					model.setMvmtEdiMsgSeq(mvmtEdiMsgSeq[i]);
				if (cntrDmgFlg[i] != null)
					model.setCntrDmgFlg(cntrDmgFlg[i]);
				if (imdtExtFlg[i] != null)
					model.setImdtExtFlg(imdtExtFlg[i]);
				if (deltUsrId[i] != null)
					model.setDeltUsrId(deltUsrId[i]);
				if (cnmvLvlNo[i] != null)
					model.setCnmvLvlNo(cnmvLvlNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (trnkSkdVoyNo[i] != null)
					model.setTrnkSkdVoyNo(trnkSkdVoyNo[i]);
				if (wblNo[i] != null)
					model.setWblNo(wblNo[i]);
				if (cnmvSplitNo[i] != null)
					model.setCnmvSplitNo(cnmvSplitNo[i]);
				if (inpYdCd[i] != null)
					model.setInpYdCd(inpYdCd[i]);
				if (substRuleCd[i] != null)
					model.setSubstRuleCd(substRuleCd[i]);
				if (cntrActCd[i] != null)
					model.setCntrActCd(cntrActCd[i]);
				if (inlndTrspLicNo[i] != null)
					model.setInlndTrspLicNo(inlndTrspLicNo[i]);
				if (spclCgoFlg[i] != null)
					model.setSpclCgoFlg(spclCgoFlg[i]);
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (fdrVslCd[i] != null)
					model.setFdrVslCd(fdrVslCd[i]);
				if (blNoTp[i] != null)
					model.setBlNoTp(blNoTp[i]);
				if (orgYdCd[i] != null)
					model.setOrgYdCd(orgYdCd[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (cnmvCycNo[i] != null)
					model.setCnmvCycNo(cnmvCycNo[i]);
				if (pkupNo[i] != null)
					model.setPkupNo(pkupNo[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (gmtDt[i] != null)
					model.setGmtDt(gmtDt[i]);
				if (fdrSkdDirCd[i] != null)
					model.setFdrSkdDirCd(fdrSkdDirCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cnmvIdNo[i] != null)
					model.setCnmvIdNo(cnmvIdNo[i]);
				if (cntrSvrId[i] != null)
					model.setCntrSvrId(cntrSvrId[i]);
				if (ctrtOfcCtyCd[i] != null)
					model.setCtrtOfcCtyCd(ctrtOfcCtyCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (mvmtEdiMsgYrmondy[i] != null)
					model.setMvmtEdiMsgYrmondy(mvmtEdiMsgYrmondy[i]);
				if (cntrDispFlg[i] != null)
					model.setCntrDispFlg(cntrDispFlg[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (trnkSkdDirCd[i] != null)
					model.setTrnkSkdDirCd(trnkSkdDirCd[i]);
				if (mvmtEdiMsgAreaCd[i] != null)
					model.setMvmtEdiMsgAreaCd(mvmtEdiMsgAreaCd[i]);
				if (cntrXchCd[i] != null)
					model.setCntrXchCd(cntrXchCd[i]);
				if (cnmvEvntDt[i] != null)
					model.setCnmvEvntDt(cnmvEvntDt[i]);
				if (fdrSkdVoyNo[i] != null)
					model.setFdrSkdVoyNo(fdrSkdVoyNo[i]);
				if (n4thCostCd[i] != null)
					model.setN4thCostCd(n4thCostCd[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (cntrRfubFlg[i] != null)
					model.setCntrRfubFlg(cntrRfubFlg[i]);
				if (cnmvDelYdCd[i] != null)
					model.setCnmvDelYdCd(cnmvDelYdCd[i]);
				if (usrNm[i] != null)
					model.setUsrNm(usrNm[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trnkVslCd[i] != null)
					model.setTrnkVslCd(trnkVslCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cnmvRmk[i] != null)
					model.setCnmvRmk(cnmvRmk[i]);
				if (cntrHngrRckFlg[i] != null)
					model.setCntrHngrRckFlg(cntrHngrRckFlg[i]);
				if (mgstNo[i] != null)
					model.setMgstNo(mgstNo[i]);
				if (mvmtTrspModCd[i] != null)
					model.setMvmtTrspModCd(mvmtTrspModCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (destYdCd[i] != null)
					model.setDestYdCd(destYdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCtmMvmtCorrVOs();
	}

	public CtmMvmtCorrVO[] getCtmMvmtCorrVOs(){
		CtmMvmtCorrVO[] vos = (CtmMvmtCorrVO[])models.toArray(new CtmMvmtCorrVO[models.size()]);
		return vos;
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.mvmtEdiTpCd = this.mvmtEdiTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvSeq = this.cnmvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obCntrFlg = this.obCntrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvTermCd = this.bkgRcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiMsgTpId = this.mvmtEdiMsgTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgKnt = this.bkgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtCreTpCd = this.mvmtCreTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcntrFlg = this.fcntrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvCoCd = this.cnmvCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNoChk = this.blNoChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHngrBarAtchKnt = this.cntrHngrBarAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSealNo = this.cntrSealNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtSeq = this.ctrtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiMsgSeq = this.mvmtEdiMsgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDmgFlg = this.cntrDmgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdtExtFlg = this.imdtExtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltUsrId = this.deltUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvLvlNo = this.cnmvLvlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdVoyNo = this.trnkSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wblNo = this.wblNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvSplitNo = this.cnmvSplitNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inpYdCd = this.inpYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.substRuleCd = this.substRuleCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrActCd = this.cntrActCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inlndTrspLicNo = this.inlndTrspLicNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoFlg = this.spclCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrVslCd = this.fdrVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNoTp = this.blNoTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdCd = this.orgYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvCycNo = this.cnmvCycNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNo = this.pkupNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gmtDt = this.gmtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrSkdDirCd = this.fdrSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIdNo = this.cnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSvrId = this.cntrSvrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtOfcCtyCd = this.ctrtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiMsgYrmondy = this.mvmtEdiMsgYrmondy .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDispFlg = this.cntrDispFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdDirCd = this.trnkSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtEdiMsgAreaCd = this.mvmtEdiMsgAreaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrXchCd = this.cntrXchCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvEvntDt = this.cnmvEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrSkdVoyNo = this.fdrSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thCostCd = this.n4thCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRfubFlg = this.cntrRfubFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvDelYdCd = this.cnmvDelYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCd = this.trnkVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvRmk = this.cnmvRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHngrRckFlg = this.cntrHngrRckFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstNo = this.mgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtTrspModCd = this.mvmtTrspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdCd = this.destYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
