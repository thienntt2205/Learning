/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0007.js
*@FileTitle  : Error Message Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
   	/* 개발자 작업	*/
  	// 공통전역변수
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	var rowcount=0;
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject1=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
            	case "btn_Add":
            		doActionIBSheet(sheetObject1,formObject,IBINSERT);
            		break;
            	case "btn_Retrieve":
            		doActionIBSheet(sheetObject1,formObject,IBSEARCH);
            		break;
            	case "btn_Save":
            		doActionIBSheet(sheetObject1,formObject,IBSAVE);
            		break;
            	case "btn_DownExcel":
            		doActionIBSheet(sheetObject1,formObject,IBDOWNEXCEL);
            		break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e);
    		}
    	}
    }
    /**
     * 페이지에 생성된 IBSheet Object를 sheetObjects배열에 등록한다. <br>
     * sheetObjects 배열은 공통전역변수로 상단에 정의하고, 이 함수는 {@link CoObject#ComSheetObject} 함수에 의해서 IBSheet Object가 생성되면서 자동 호출된다. <br>
     * @param {ibsheet} sheet_obj    IBSheet Object
     **/
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    /**
     * body.onload 이벤트에서 호출되는 함수로 페이지 로드완료 후 선처리해야할 기능을 추가한다. <br>
     * HTML컨트롤의 각종 이벤트와 IBSheet, IBTab 등을 초기화 한다. <br>
     **/
    function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			//khlee-시작 환경 설정 함수 이름 변경
			ComConfigSheet (sheetObjects[i]);
			initSheet(sheetObjects[i],i+1);
			//khlee-마지막 환경 설정 함수 추가
			ComEndConfigSheet(sheetObjects[i]);
			doActionIBSheet(sheetObjects[i],document.form,IBSEARCH)
		}
	}
    /**
     * 페이지에 있는 IBSheet Object를 초기화 한다. <br>
     * IBSheet가 여러개일 경우 개수만큼 case를 추가하여 IBSheet 초기화 모듈을 구성한다. <br>
     * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {int}     sheetNo     sheetObjects 배열에서 순번
     **/
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
		var sheetID=sheetObj.id;
        switch(sheetID) {
            case "sheet1":
            	with(sheetObj){
                var HeadTitle="|Del|Msg Cd|Msg Type|Msg level|Message|Description" ;
                var headCount=ComCountHeadTitle(HeadTitle);

                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);

                var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
	                     {Type:"DelCheck",  Hidden:0, Width:45,   Align:"Center",  ColMerge:1,   SaveName:"DEL",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"err_msg_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"err_tp_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"Server|UI|Both", ComboCode:"S|U|B" },
	                     {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"err_lvl_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"ERR|WARNING|INFO", ComboCode:"E|W|I" },
	                     {Type:"Text",      Hidden:0, Width:400,  Align:"Left",    ColMerge:0,   SaveName:"err_msg",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, MultiLineText:1 },
	                     {Type:"Text",      Hidden:0, Width:250,  Align:"Left",    ColMerge:0,   SaveName:"err_desc",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
                  
                InitColumns(cols);
                SetWaitImageVisible(0);
                resizeSheet();
                }
            break;
        }
    }
    
    function resizeSheet(){
   	         ComResizeSheet(sheetObjects[0]);
   }
    /**
     * IBSheet 관련 각종 기능(조회,저장 등)을 처리한다. <br>
     * {@link #processButtonClick}함수에서 이 함수를 호출하여 버튼에서 IBSheet의 기능을 호추할 때 사용한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function doActionIBSheet(sheetObj,formObj,sAction) {
        switch(sAction) {
			case IBSEARCH:      //조회
				if(!validateForm(sheetObj,formObj,sAction)) return
                //조회처리
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH;
 				sheetObj.DoSearch("ADM_SYS_0007GS.do", FormQueryString(formObj) );
				break;
			case IBSAVE:        //저장
				if(!validateForm(sheetObj,formObj,sAction))return;
                //저장처리
            	formObj.f_cmd.value=MULTI;
                sheetObj.DoSave("ADM_SYS_0007GS.do", FormQueryString(formObj));
				break;
			case IBINSERT:      // 입력
				rowcount=sheetObj.RowCount();
				row=sheetObj.DataInsert(-1);
				break;
			case IBDOWNEXCEL:	//엑셀다운로드
				if(sheetObj.RowCount() < 1){
					ComShowCodeMessage("COM132501");
				}else{
					sheetObj.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1, Merge:1});
				}
				break;
        }
    }
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(formObj.iPage)) {
//                return false;
//            }
        }
        return true;
    }
    /**
     * Program Name Data List OpenWindow. <br>
     * @param {int}	Row	행번호
     * @param {int}	Col	컬럼번호
     **/
    function sheet1_OnPopupClick(sheetObj,Row,Col){
        switch (sheetObj.ColSaveName(Col)) {
       	case "dev_dt" :
			var cal=new ComCalendarGrid();
			cal.select(sheetObj, Row, Col, 'yyyyMMdd');
            break;
        case "roles" :
			if(sheetObj.GetCellValue(Row,"ibflag")=="I" || sheetObj.GetCellValue(Row,"ibflag")=="U"){
            	 ComShowCodeMessage('COM12151','Program');
			}else if(sheetObj.GetCellValue(Row,"ibflag")=="R" && sheetObj.GetCellValue(Row,"pgm_mnu_div_cd")=="01"){
				 ComShowCodeMessage('COM12190');
             }else{
            	 alert('wait!!!!!!!!')
    		       //noRtnPopup('progRoleMapping.do?pgm_no='+sheetObj.CellValue(Row,"pgm_no")+"&pgm_nm="+escape(sheetObj.CellValue(Row,"pgm_nm")),'width=700,height=474,left=200,top=100,menubar=0,status=0,scrollbars=0,resizable=1');
             }
             break;
        }
	}
     function sheet1_OnChange(sheetObj,Row,Col){
    	 if(Col == 2){
			var code=sheetObj.GetCellValue(Row, Col);
    	    for(var int=1; int < sheetObj.RowCount(); int++) {
			var orlcode=sheetObj.GetCellValue(int, Col);
			/* null 인 경우와 자기 자신은 비교할 필요가 없음 */
				if(code != '' && int != Row && code == orlcode){
    				 //ComShowMessage("동일한 Message Code가 존재합니다.");
    				 ComShowCodeMessage('COM131302',code);
    				 sheetObj.SetCellValue(Row, Col,"");
    				 return;
    			 }
    		 }
    	 }
     }
	/* 개발자 작업  끝 */
     
     function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
     	ComOpenWait(false);
     }