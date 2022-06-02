/*================================================== ==========
 *Copyright(c) 2022 CyberLogitec
 *@FileName : PRAC_TRN_001.js
 *@FileTitle : Error Message Management
 *Open Issues:
 *Change history:
 *@LastModifyDate: 2022.05.13
 *@LastModifier :
 *@LastVersion : 1.0
 * 2022.05.13
 * 1.0 Creation
==================================================== ========*/
/**************************************************** *****************************************
 Event identification code: [Initialization]INIT=0; [input]ADD=1; [Query]SEARCH=2; [List inquiry]SEARCHLIST=3;
 [Edit] MODIFY=4; [Delete]REMOVE=5; [Remove list]REMOVELIST=6 [Multiprocessing]MULTI=7
 Other extra character constants COMMAND01=11; ~COMMAND20=30;
 ************************************************** *****************************************/

/*------------------The following code is added to make JSDoc well ----- */
/**
 * @fileoverview This is a JavaScript file commonly used in work, and calendar-related functions are defined.
 * @author Hanjin Shipping
 */

/**
 * @extends
 * @class PRAC_TRN_001 : Defines the work script used in the screen for PRAC_TRN_001 creation.
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

function initSheet(sheetObj,sheetNo) {
	var cnt=0;
	var sheetID=sheetObj.id;
    switch(sheetNo) {
    	case 1:
    		with(sheetObj){
    			// define a string to store head titles
            	var HeadTitle="STS|Del|Msg Cd|Msg Type|Msg level|Message|Description" ;
            	// SetConfig: configure how to fetch initialized sheet, location of frozen rows or columns and other basic configurations
            		// SearchMode: 2 (is where you can configure search mode)
            			// LazyLoad mode
            			// Search all data and display search result data on the screen by page as set in Page property value according to the scroll location
            		// MergeSheet: 5 (is where you can configure merge styles)
            			// Value: msHeaderOnly
            			// Allow merge in the header rows only
            		// FrozenCol: 0 (is where you can select the frozen column count in the left)
            		// DataRowMerge: 1 (Whether to allow horizontal merge of the entire row.)
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
                //Define header functions such as sorting and column movement permissions in json format
                	// Sort: 1 (allow sorting by clicking on the header)
                	// ColMove: 1 (allow column movement in header)
                	// HeaderCheck : 0 (the CheckAll in the header is not checked)
                	// ColResize: 1 (allow resizing of column width)
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                // Define header title and alignment in json format.
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                // Define the header title and function using this method.
                InitHeaders(headers, info);
                // Type			 (String) : Column data type
                // Hidden 		 (Boolean): Whether a column is hidden
                // Width		 (Number) : Column width
                // Align 		 (String) : Data alignment
                // ColMerge 	 (Boolean): Whether to allow column merging
                // SaveName		 (String) : A parameter name used to save or search data
                // KeyField 	 (Boolean): Required fields
                // UpdateEdit    (Boolean): Whether to allow data editing when transaction is in "Search" state
                // InsertEdit 	 (Boolean): Whether to allow data editing when transaction is in "Insert" state
                // EditLen 	     (Number) : Editable data length
                // ComboText 	 (String) : Combo list text string group
                // ComboCode 	 (String) : Combo list code group
                // MultiLineText (Boolean): Whether to use multilines
                var cols = [ 
                    {Type:"Status", Hidden:1, Width:30, Align:"Center", ColMerge:0, SaveName:"ibflag" },
                    {Type:"DelCheck", Hidden:0, Width:45, Align:"Center", ColMerge:0, SaveName:"DEL", KeyField:0, UpdateEdit:1, InsertEdit:1 },
	                {Type:"Text", Hidden:0, Width:80, Align:"Center", ColMerge:1, SaveName:"err_msg_cd", KeyField:1, UpdateEdit:0, InsertEdit:1, EditLen: 8 },
	                {Type:"Combo", Hidden:0, Width:80, Align:"Center", ColMerge:1, SaveName:"err_tp_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, ComboText:"Server|UI|Both", ComboCode:"S|U|B" },
	                {Type:"Combo", Hidden:0, Width:80, Align:"Center", ColMerge:1, SaveName:"err_lvl_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, ComboText:"ERR|WARNING|INFO", ComboCode:"E|W|I" },
	                {Type:"Text", Hidden:0, Width:400, Align:"Left", ColMerge:0, SaveName:"err_msg", KeyField:1, UpdateEdit:1, InsertEdit:1, MultiLineText:1 },
	                {Type:"Text", Hidden:0, Width:250, Align:"Left", ColMerge:0, SaveName:"err_desc", KeyField:0, UpdateEdit:1, InsertEdit:1 } 
	            ];
                // Configure data type, format and functionality of each column.
                InitColumns(cols);
                //Set not to display waiting image for processing
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

      // set command for search function
      formObj.f_cmd.value = SEARCH;
      // ComOpenWait:configure whether a loading image will appears and lock
      // the screen
      // true: lock the screen.
      // false: return normal.
      ComOpenWait(true);
      // DoSearch = GetSearch + LoadSearch
      sheetObj.DoSearch("PRAC_TRN_001GS.do", FormQueryString(formObj));
      // var sParam=FormQueryString(formObj);
      // var sXml=sheetObj.GetSearchData("DOU_TRN_001GS.do", sParam);
      // sheetObj.LoadSearchData(sXml,{Sync:1});
      break;
    case IBSAVE: // Save
      formObj.f_cmd.value = MULTI;
      // Call input valid function to check before save "0" is set default
      // Doaction not to check again
      if (validateForm(sheetObj, formObj, 0)) {
        sheetObj.DoSave("PRAC_TRN_001GS.do", FormQueryString(formObj));
        // ComShowCodeMessage("COM130102","Msg cd");
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
        Filename: 'getexcel',
        SheetName: 'main',
        DownCols: '2|3|4|5|6'
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
//function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
//    console.log("12345");
//    ComShowCodeMessage("COM130102", "Action");
//}

function validateForm(sheetObj, formObj, sAction) {
  var regexString = "^[A-Z]{3}[0-9]{5}$";
  var regex = new RegExp(regexString);
  for (var i = sheetObj.LastRow(); i >= sheetObj.HeaderRows(); i--) {
    if (sheetObj.GetCellValue(i, "ibflag") == 'I'
      && !regex.test(sheetObj.GetCellValue(i, "err_msg_cd"))) {
      ComShowCodeMessage("COM132201", "Msg cd");
      return false;
    }
  }
  return true;

  // sheetObj.ShowDebugMsg(false);

}
/* 개발자 작업 */

/* 개발자 작업 끝 */