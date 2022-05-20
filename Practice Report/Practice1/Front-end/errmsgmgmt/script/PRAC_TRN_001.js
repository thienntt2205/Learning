/*=========================================================
 *Copyright(c) 2022 CyberLogitec
 *@FileName : PRAC_TRN_001.js
 *@FileTitle : Error Message Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2022.05.13
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2022.05.13 
 * 1.0 Creation
=========================================================*/
/****************************************************************************************
 이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
 [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
 기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
/**
 * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
 * @author 한진해운
 */

/**
 * @extends
 * @class PRAC_TRN_001 : PRAC_TRN_001 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
 */
var sheetObjects = new Array();
var sheetCnt = 0;
document.onclick = processButtonClick;

function processButtonClick() {
	/** *** setting sheet object **** */
	var sheetObject1 = sheetObjects[0];
	/** **************************************************** */
	var formObj = document.form;
	try {
		var srcName = ComGetEvent("name");
		if (srcName == null) {
			return;
		}
		switch (srcName) {
		case "btn_Retrieve":
			doActionIBSheet(sheetObject1, formObj, IBSEARCH);
			break;
		case "btn_Save":
			doActionIBSheet(sheetObject1, formObj, IBSAVE);
			break;
		case "btn_DownExcel":
			doActionIBSheet(sheetObject1, formObj, IBDOWNEXCEL);
			break;
		case "btn_Add":
			doActionIBSheet(sheetObject1, formObj, IBINSERT);
			break;
		default:
			break;
		}
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('JOO00001');
		} else {
			ComShowMessage(e.message);
		}
	}
}

function loadPage() {
	// generate Grid Layout
	for (i = 0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}

	// auto search data after loading finish.
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

function initSheet(sheetObj, sheetNo) {
	var cnt = 0;
	switch (sheetNo) {
	case 1: // sheet1 init
		with (sheetObj) {

			var HeadTitle = "STS|Del|Msg Cd|Msg Type|Msg Level|Message|Description";
			var headCount = ComCountHeadTitle(HeadTitle);
			// (headCount, 0, 0, true);

			SetConfig({
				SearchMode : 2,
				MergeSheet : 5,
				Page : 20,
				DataRowMerge : 0
			});

			var info = {
				Sort : 1,
				ColMove : 1,
				HeaderCheck : 0,
				ColResize : 1
			};
			var headers = [ {
				Text : HeadTitle,
				Align : "Center"
			} ];
			InitHeaders(headers, info);

			var cols = [ {
				Type : "Status",
				Hidden : 1,
				Width : 50,
				Align : "Center",
				ColMerge : 0,
				SaveName : "ibflag"
			}, {
				Type : "DelCheck",
				Hidden : 0,
				Width : 50,
				Align : "Center",
				ColMerge : 0,
				SaveName : "del_chk"
			}, {
				Type : "Text",
				Hidden : 0,
				Width : 100,
				Align : "Center",
				ColMerge : 0,
				SaveName : "err_msg_cd",
				KeyField : 1,
				Format : "",
				UpdateEdit : 0,
				InsertEdit : 1,
				EditLen : 8
			}, {
				Type : "Combo",
				Hidden : 0,
				Width : 100,
				Align : "Center",
				ColMerge : 0,
				SaveName : "err_tp_cd",
				KeyField : 1,
				Format : "",
				UpdateEdit : 1,
				InsertEdit : 1,
				EditLen : 5,
				ComboText : "Server|UI|Both",
				ComboCode : "S|U|B"
			}, {
				Type : "Combo",
				Hidden : 0,
				Width : 100,
				Align : "Center",
				ColMerge : 0,
				SaveName : "err_lvl_cd",
				KeyField : 1,
				Format : "",
				UpdateEdit : 1,
				InsertEdit : 1,
				EditLen : 6,
				ComboText : "ERR|WARNING|INFO",
				ComboCode : "E|W|I"
			}, {
				Type : "Text",
				Hidden : 0,
				Width : 600,
				Align : "Left",
				ColMerge : 0,
				SaveName : "err_msg",
				KeyField : 1,
				Format : "",
				UpdateEdit : 1,
				InsertEdit : 1
			// EditLen :
			}, {
				Type : "Text",
				Hidden : 0,
				Width : 100,
				Align : "Left",
				ColMerge : 0,
				SaveName : "err_desc",
				KeyField : 1,
				Format : "",
				UpdateEdit : 1,
				InsertEdit : 1
			// EditLen : 6
			} ];

			InitColumns(cols);
			SetEditable(1);
			// SetColProperty("jo_crr_cd", { AcceptKeys : "E|N",
			// InputCaseSensitive : 1 });
			// SetColProperty("vndr_seq", { AcceptKeys : "N"});
			// SetColProperty("cust_cnt_cd", { AcceptKeys : "E|N",
			// InputCaseSensitive : 1});
			// SetColProperty("cust_seq", { AcceptKeys : "N"});
			// SetColProperty("trd_cd", { AcceptKeys : "E|N", InputCaseSensitive
			// : 1 });
			SetWaitImageVisible(0);
			resizeSheet();
		}
		break;
	}

}

function resizeSheet() {
	ComResizeSheet(sheetObjects[0]);
}

function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++] = sheet_obj;
}

// function setComboObject(combo_obj) {
// comboObjects[comboCnt++] = combo_obj;
// }

function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	// if (!validateForm(sheetObj, formObj, sAction)) {
	// return false;
	// }
	switch (sAction) {
	case IBSEARCH: // retrieve
		
		// set command for search funtion
		formObj.f_cmd.value = SEARCH;
		// ComOpenWait:configure whether a loading image will appears and lock the screen
		// true: lock the screen.
		// false: return normal.
		ComOpenWait(true);
		//DoSearch = GetSearch + LoadSearch
		sheetObj.DoSearch("PRAC_TRN_001GS.do", FormQueryString(formObj));
		// var sParam=FormQueryString(formObj);
		// var sXml=sheetObj.GetSearchData("DOU_TRN_001GS.do", sParam);
		// sheetObj.LoadSearchData(sXml,{Sync:1});
		break;
	case IBSAVE: // Save
		formObj.f_cmd.value = MULTI;
		// Call input valid function to check before save "0" is set default Doaction not to check again
		if (validateForm(sheetObj, formObj, 0)) {
			sheetObj.DoSave("PRAC_TRN_001GS.do", FormQueryString(formObj));
		}
		break;
	case IBINSERT: // Row Add button event
		sheetObj.DataInsert();
		break;
	// case IBDELETE: // Row Delete button event
	// for (var i = sheetObj.LastRow(); i >= sheetObj.HeaderRows(); i--) {
	// if (sheetObj.GetCellValue(i, "del_chk") == 1) {
	// sheetObj.SetRowHidden(i, 1);
	// sheetObj.SetRowStatus(i, "D");
	// }
	// }
	// break;
	case IBDOWNEXCEL: // downexcel
		sheetObj.Down2Excel({
			Filename : 'getexcel',
			SheetName : 'main',
			DownCols : '2|3|4|5|6'
		});
		break;
	// case IBADDROW: // addrow to current line
	// sheetObj.DataInsert();
	// break;
	}
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
}

function validateForm(sheetObj, formObj, sAction) {
	var regexString = "^[A-Z]{3}[0-9]{5}$";
	var regex = new RegExp(regexString);
	for (var i = sheetObj.LastRow(); i >= sheetObj.HeaderRows(); i--) {
		if (sheetObj.GetCellValue(i, "ibflag") == 'I'
				&& !regex.test(sheetObj.GetCellValue(i, "err_msg_cd"))) {
			ComShowCodeMessage("COM132201","Msg cd");
			return false;
		}
	}
	return true;

	// sheetObj.ShowDebugMsg(false);

}

function PRAC_TRN_001() {
	this.processButtonClick = tprocessButtonClick;
	this.setSheetObject = setSheetObject;
	this.loadPage = loadPage;
	this.initSheet = initSheet;
	this.initControl = initControl;
	this.doActionIBSheet = doActionIBSheet;
	this.setTabObject = setTabObject;
	this.validateForm = validateForm;
}

/* 개발자 작업 */

/* 개발자 작업 끝 */