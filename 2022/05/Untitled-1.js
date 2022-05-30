/*=========================================================
 *Copyright(c) 2022 CyberLogitec
 *@FileName : DOU_TRN_0002.js
 *@FileTitle : Code Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2022.05.13
 *@LastModifier :
 *@LastVersion : 1.0
 * 2022.04.15
 * 1.0 Creation
=========================================================*/
/****************************************************************************************
	Event identification code: [Initialization]INIT=0; [input]ADD=1; [Query]SEARCH=2; [List inquiry]SEARCHLIST=3;
					[Edit] MODIFY=4; [Delete]REMOVE=5; [Remove list]REMOVELIST=6 [Multiprocessing]MULTI=7
					Other extra character constants COMMAND01=11; ~COMMAND20=30;
 ***************************************************************************************/

/*------------------The following code is added to make JSDoc well. ------------------*/
/**
 * @fileoverview This is a JavaScript file commonly used in work, and calendar-related functions are defined.
 * @author 한진해운
 */

//common global variable
var sheetObjects = new Array();
var sheetCnt = 0;
var rowcount = 0;
var announce = 0;
var flagM = null;
var flagD = null;
var flagMD = 0;
//Define an event handler that receives and handles button click events
document.onclick = processButtonClick;
document.onkeydown = logKey;


function logKey(key) {
	var sheetObject1 = sheetObjects[0];
	var formObj = document.form;

	if (key.code == 'Enter') {
		doActionIBSheet(sheetObject1, formObj, IBSEARCH);
	}
}

//{processButtonClick} function for branching to the corresponding logic when a button on the screen is pressed
function processButtonClick() {
	var sheetObject1 = sheetObjects[0];
	var formObject = document.form;
	try {
		var srcName = ComGetEvent("name");
		switch (srcName) {
			case "btn_Add":
				doActionIBSheet(sheetObject1, formObject, IBINSERT);
				break;
			case "btn_Retrieve":
				doActionIBSheet(sheetObject1, formObject, IBSEARCH);
				break;
			case "btn_Save":
				if ((sheetObjects[0].RowCount("I") + sheetObjects[0].RowCount("U") + sheetObjects[0].RowCount("D")) == 0 &&
					(sheetObjects[1].RowCount("I") + sheetObjects[1].RowCount("U") + sheetObjects[1].RowCount("D")) == 0) {
					ComShowCodeMessage("COM130503");
					return;
				}
				if ((sheetObjects[0].RowCount("I") + sheetObjects[0].RowCount("U") + sheetObjects[0].RowCount("D")) > 0) {
					doActionIBSheet(sheetObjects[0], formObject, IBSAVE);
				}
				if ((sheetObjects[1].RowCount("I") + sheetObjects[1].RowCount("U") + sheetObjects[1].RowCount("D")) > 0) {
					doActionIBSheet(sheetObjects[1], formObject, IBSAVE);
				}
				//			doActionIBSheet(sheetObjects[0],formObject,IBSAVE);
				break;
			case "btn_DownExcel":
				doActionIBSheet(sheetObject1, formObject, IBDOWNEXCEL);
				break;
			case "btn_rowadd_ms":
				doActionIBSheet(sheetObject1, formObject, IBINSERT);
				break;
			case "btn_rowdelete_ms":
				if (sheetObjects[1].SearchRows() == 0) {
					doActionIBSheet(sheetObject1, formObject, IBDELETE);
				}
				else {
					if (confirm("Do you delete detail table?")) {
						doActionIBSheet(sheetObject1, formObject, IBDELETE);
					}
					else {
						return;
					}
				}
				break;

			case "btn_rowadd_dl":
				doActionIBSheet(sheetObjects[1], formObject, IBINSERT);
				break;
			case "btn_rowdelete_dl":
				doActionIBSheet(sheetObjects[1], formObject, IBDELETE);
				break;
		}
	}
	catch (e) {
		if (e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		}
		else {
			ComShowMessage(e);
		}
	}
}

//{setSheetObject} to put sheet objects in global variable "sheetObjects"
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++] = sheet_obj;
}

//{loadPage} functions that calls a common function that sets the default settings of the sheet
//It is the first called area when fire jsp onload event
function loadPage() {
	for (i = 0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

//{initSheet} functions that define the basic properties of the sheet on the screen
function initSheet(sheetObj, sheetNo) {
	var cnt = 0;
	switch (sheetNo) {
		case 1:
			with (sheetObj) {
				var HeadTitle = "STS|SubSystem|Cd ID|Cd Name|Length|Cd Type|Table Name|Description Remark|Flag|Create User|Create Date|Update User|Update Date";
				var headCount = ComCountHeadTitle(HeadTitle);

				SetConfig({
					SearchMode: 2,
					MergeSheet: 5,
					Page: 20,
					FrozenCol: 0,
					DataRowMerge: 1
				});

				var info = {
					Sort: 1,
					ColMove: 1,
					HeaderCheck: 0,
					ColResize: 1
				};
				var headers = [{
					Text: HeadTitle,
					Align: "Center"
				}];
				InitHeaders(headers, info);

				var cols = [
					{ Type: "Status", Hidden: 1, Width: 50, Align: "Center", ColMerge: 0, SaveName: "ibflag", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1 },
					{ Type: "Text", Hidden: 0, Width: 70, Align: "Center", ColMerge: 0, SaveName: "ownr_sub_sys_cd", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1, AcceptKeys: "E", InputCaseSensitive: 1 },
					{ Type: "Text", Hidden: 0, Width: 60, Align: "Center", ColMerge: 0, SaveName: "intg_cd_id", KeyField: 1, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 0, InsertEdit: 1, AcceptKeys: "E", InputCaseSensitive: 1 },
					{ Type: "Text", Hidden: 0, Width: 200, Align: "Left", ColMerge: 0, SaveName: "intg_cd_nm", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1 },
					{ Type: "Text", Hidden: 0, Width: 50, Align: "Center", ColMerge: 0, SaveName: "intg_cd_len", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1, AcceptKeys: "N" },
					{ Type: "Combo", Hidden: 0, Width: 100, Align: "Center", ColMerge: 0, SaveName: "intg_cd_tp_cd", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1, ComboCode: "G", ComboText: "General" },
					{ Type: "Text", Hidden: 0, Width: 150, Align: "Left", ColMerge: 0, SaveName: "mng_tbl_nm", KeyField: 1, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 0, InsertEdit: 1 },
					{ Type: "Text", Hidden: 0, Width: 350, Align: "Left", ColMerge: 0, SaveName: "intg_cd_desc", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1 },
					{ Type: "Combo", Hidden: 0, Width: 40, Align: "Center", ColMerge: 0, SaveName: "intg_cd_use_flg", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1, ComboCode: "N|Y", ComboText: "N|Y" },
					{ Type: "Text", Hidden: 0, Width: 80, Align: "Center", ColMerge: 0, SaveName: "cre_usr_id", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 0, InsertEdit: 0 },
					{ Type: "Date", Hidden: 0, Width: 80, Align: "Center", ColMerge: 0, SaveName: "cre_dt", KeyField: 0, CalcLogic: "", Format: "Ymd", PointCount: 0, UpdateEdit: 0, InsertEdit: 0 },
					{ Type: "Text", Hidden: 0, Width: 80, Align: "Center", ColMerge: 0, SaveName: "upd_usr_id", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 0, InsertEdit: 0 },
					{ Type: "Date", Hidden: 0, Width: 80, Align: "Center", ColMerge: 0, SaveName: "upd_dt", KeyField: 0, CalcLogic: "", Format: "Ymd", PointCount: 0, UpdateEdit: 0, InsertEdit: 0 }
				];
				InitColumns(cols);
				SetEditable(1);
				SetWaitImageVisible(0);
				SetSheetHeight(240);
			}

			break;
		case 2:
			with (sheetObj) {
				var HeadTitle = "STS|Cd ID|Cd Val|Display Name|Description Remark|Order";
				var headCount = ComCountHeadTitle(HeadTitle);

				SetConfig({ SearchMode: 2, MergeSheet: 5, Page: 20, FrozenCol: 0, DataRowMerge: 0 });

				var info = { Sort: 1, ColMove: 1, HeaderCheck: 0, ColResize: 1 };
				var headers = [{ Text: HeadTitle, Align: "Center" }];
				InitHeaders(headers, info);

				var cols = [
					{ Type: "Status", Hidden: 0, Width: 50, Align: "Center", ColMerge: 0, SaveName: "ibflag", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1 },
					{ Type: "Text", Hidden: 1, Width: 10, Align: "Center", ColMerge: 0, SaveName: "intg_cd_id", KeyField: 1, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 0, InsertEdit: 1 },
					{ Type: "Text", Hidden: 0, Width: 60, Align: "Center", ColMerge: 0, SaveName: "intg_cd_val_ctnt", KeyField: 1, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 0, InsertEdit: 1 },
					{ Type: "Text", Hidden: 0, Width: 200, Align: "Center", ColMerge: 0, SaveName: "intg_cd_val_dp_desc", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1 },
					{ Type: "Text", Hidden: 0, Width: 600, Align: "Left", ColMerge: 0, SaveName: "intg_cd_val_desc", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1 },
					{ Type: "Text", Hidden: 0, Width: 50, Align: "Center", ColMerge: 0, SaveName: "intg_cd_val_dp_seq", KeyField: 0, CalcLogic: "", Format: "", PointCount: 0, UpdateEdit: 1, InsertEdit: 1 }
				];

				InitColumns(cols);
				SetEditable(1);
				SetWaitImageVisible(0);
				resizeSheet();
			}
			break;
	}
}

function resizeSheet() {
	ComResizeSheet(sheetObjects[1]);
}

//{doActionIBSheet} functions that define transaction logic between UI and server
function doActionIBSheet(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH:
			if (sheetObj.id == "sheet1") {
				ComOpenWait(true);
				formObj.f_cmd.value = SEARCH;
				sheetObj.DoSearch("DOU_TRN_0002GS.do", FormQueryString(formObj));
			}
			else if (sheetObj.id == "sheet2") {
				//			ComOpenWait(true);
				formObj.f_cmd.value = SEARCH01;
				var sXml2 = sheetObj.DoSearch("DOU_TRN_0002GS.do", FormQueryString(formObj));
				sheetObj.LoadSearchData(sXml2, { Sync: 1 });
				formObj.intg_cd_id.value = "";
			}
			break;
		case IBINSERT:
			with (sheetObj) {
				sheetObj.DataInsert(-1);
				if (sheetObj.id == "sheet1") {
					sheetObjects[1].RemoveAll();
					formObj.intg_cd_id.value = '';
				}
				else if (sheetObj.id == "sheet2") {
					if (sheetObj.SearchRows() == 0) {
						SetCellValue(LastRow(), "intg_cd_id", sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), "intg_cd_id"));
						//				console.log(sheetObjects[1].GetCellValue(sheetObjects[1].GetSelectRow(),"intg_cd_id"));
					} else {
						SetCellValue(LastRow(), "intg_cd_id", sheetObj.GetCellValue(1, "intg_cd_id"));
					}
				}
			}
			break;
		case IBDOWNEXCEL:
			if (sheetObj.RowCount() < 1) {
				ComShowCodeMessage("COM132501");
			}
			else {
				sheetObjects[0].Down2ExcelBuffer(true);
				sheetObjects[0].Down2Excel({ FileName: 'excel2', SheetName: 'sheet1', DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign: 1, Merge: 1 });
				sheetObjects[1].Down2Excel({ FileName: 'excel2', SheetName: 'sheet2', DownCols: makeHiddenSkipCol(sheetObjects[1]), SheetDesign: 1, Merge: 1 });
				sheetObjects[0].Down2ExcelBuffer(false);
			}
			break;
		case IBDELETE:
			var j = sheetObj.GetSelectRow();
			sheetObj.SetCellValue(j, "ibflag", "D");
			sheetObj.SetRowHidden(j, 1);
			//		flag = 'Delete';
			if (sheetObj.id == 'sheet1') {
				flagM = 'Delete';
				var codeid = sheetObj.GetCellValue(j, "intg_cd_id");
				if (sheetObjects[1].RowCount() > 0 && codeid == sheetObjects[1].GetCellValue(1, "intg_cd_id")) {
					for (i = sheetObjects[1].LastRow(); i > 0; i--) {
						//					sheetObjects[1].SetCellValue(i, "ibflag","D");
						sheetObjects[1].SetRowHidden(i, 1);
					}
				}
			}
			if (sheetObj.id == 'sheet2') {
				flagD = 'Delete';
			}
			break;
		case IBSAVE:
			switch (sheetObj.id) {
				case 'sheet1':
					formObj.f_cmd.value = MULTI;
					sheetObj.DoSave("DOU_TRN_0002GS.do", FormQueryString(formObj));
					break;
				case 'sheet2':
					formObj.f_cmd.value = MULTI01;
					sheetObj.DoSave("DOU_TRN_0002GS.do", FormQueryString(formObj));
					break;
			}
			//		formObj.f_cmd.value=MULTI;
			//		sheetObj.DoSave("DOU_TRN_0002GS.do", FormQueryString(formObj));
			break;
		case 'IBSAVE01':
			formObj.f_cmd.value = MULTI01;
			sheetObj.DoSave("DOU_TRN_0002GS.do", FormQueryString(formObj));
			break;
	}
}

//Handling validate
function validateForm(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
}

//handling event double click when double click one row in sheet1
function sheet1_OnDblClick(sheetObj, Row, Col, CellX, CellY, CellW, CellH) {
	document.form.intg_cd_id.value = sheetObjects[0].GetCellValue(Row, "intg_cd_id");
	doActionIBSheet(sheetObjects[1], document.form, IBSEARCH);
}
//Handling event after searching sheet1
function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
}
//Handling event after searching sheet2
function sheet2_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
}

//Get ibflag
function getIbFlagToShowMess(sheetObj) {
	var flag = null;
	if (sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ibflag") == 'I') {
		flag = 'Insert';
	}
	else if (sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ibflag") == 'U') {
		flag = 'Update';
	}
	return flag;
}

//Handling event before save sheet1
function sheet1_OnBeforeSave() {
	if (flagM == null)
		flagM = getIbFlagToShowMess(sheetObjects[0]);
	if (flagM == 'Delete' && sheetObjects[1].SearchRows() > 0)
		flagMD = 1;
}
//Handling event after save sheet1
function sheet1_OnSaveEnd(Code, Msg) {
	if (Msg >= 0) {
		if (flagM == 'Insert') {
			ComShowCodeMessage('COM130102', sheetObjects[0].id);
			flagM = null;
		}
		else if (flagM == 'Update') {
			ComShowCodeMessage('COM130502', sheetObjects[0].id);
			flagM = null;
		}
		else if (flagM == 'Delete') {
			if (flagMD == 1) {
				alert("Delete Master and Detail by Cd_id Successfully");
				flagM = null;
				flagMD = 0;
			}
			else {
				ComShowCodeMessage('COM130303', sheetObjects[0].id);
				flagM = null;
			}
		}
		//		alert("Save Master Successfully");
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	}
	else {
		ComShowCodeMessage('COM130103', sheetObjects[0].id);
	}

}

//Handling event before save sheet2
function sheet2_OnBeforeSave() {
	if (flagD == null)
		flagD = getIbFlagToShowMess(sheetObjects[1]);
}

//Handling event after save sheet2
function sheet2_OnSaveEnd(Code, Msg) {
	if (Msg >= 0) {
		if (flagD == 'Insert') {
			ComShowCodeMessage('COM130102', sheetObjects[1].id);
			flagD = null;
		}
		else if (flagD == 'Update') {
			ComShowCodeMessage('COM130502', sheetObjects[1].id);
			flagD = null;
		}
		else if (flagD == 'Delete') {
			ComShowCodeMessage('COM130303', sheetObjects[1].id);
			flagD = null;
		}
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	}
	else {
		ComShowCodeMessage('COM130103', sheetObjects[1].id);
	}
}

/**
 * @extends
 * @class PRACTICE_1 : Defines the business script used in the screen for generating DOU_TRN_0002.
 */
function DOU_TRN_0002() {
	this.processButtonClick = tprocessButtonClick;
	this.setSheetObject = setSheetObject;
	this.loadPage = loadPage;
	this.initSheet = initSheet;
	this.initControl = initControl;
	this.doActionIBSheet = doActionIBSheet;
	this.setTabObject = setTabObject;
	this.validateForm = validateForm;
}