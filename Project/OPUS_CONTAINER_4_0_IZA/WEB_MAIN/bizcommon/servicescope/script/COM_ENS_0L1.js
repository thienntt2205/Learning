/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0L1.js
*@FileTitle  : Service Scope
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/09
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/* 공통전역변수 */
var sheetObjects=new Array();
var sheetCnt=0;
/* 업무별전역변수는 아래 부분에 추가 선언하여 사용한다. */
    /**
     * IBSheet Object를 배열로 등록
     * comSheetObject(id)에서 호출한다
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setSheetObject(sheet_obj){
        sheetObjects[sheetCnt++]=sheet_obj;
    }
    /**
     * Sheet 기본 설정 및 초기화 
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
    function loadPage() {
        for(i=0;i<sheetObjects.length;i++){
        //khlee-시작 환경 설정 함수 이름 변경
            ComConfigSheet(sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
        }
        // 초기화면에서 조회내용을 보기 위한 소스 추후 삭제
        var sheetObject=sheetObjects[0];
        var formObject=document.form;
      	doActionIBSheet(sheetObject,formObject,IBSEARCH);
      	initControl();
    }
     function initControl() {
     	var formObject=document.form;
         //Axon 이벤트 처리1. 이벤트catch(개발자변경)
//         axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
//         axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
     }
   //업무 자바스크립트 OnKeyPress 이벤트 처리
     function keypressFormat() {
     	obj=ComGetEvent();
   	    if(obj.dataformat == null) return;
   	    window.defaultStatus=obj.dataformat;
   	    switch(ComGetEvent("name")) {
   	       case "svc_scp_cd":
  	        	ComKeyOnlyAlphabet('upper');
  	        	break;
   	       case "svc_scp_nm":
   	    	   ComKeyOnlyAlphabet('upper');
   	    	   break;
   	    }
     }
    /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
            case 1:      //IBSheet1 init
                with(sheetObj){
                
            		var mdmYN=document.form.mdm_yn.value;
            		
            		var HeadTitle="||Seq.|Code|Name" ;
            		if(mdmYN.replace(/\s/g,"") != ""){
            			HeadTitle += "|Status";
            		}

            		SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, FrozenCol:0, DataRowMerge:0 } );

            		var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            		var headers = [ { Text:HeadTitle, Align:"Center"} ];
            		InitHeaders(headers, info);

            		var cols = [ {Type:"Radio",     Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"radio",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            		             {Type:"CheckBox",  Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            		             {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
            		             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"svc_scp_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
            		             {Type:"Text",      Hidden:0,  Width:290,  Align:"Left",    ColMerge:0,   SaveName:"svc_scp_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
                  	if(mdmYN.replace(/\s/g,"") != ""){
                  		cols.push({Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                  	}
         
                  	InitColumns(cols);
                  	SetEditable(1);
                  	SetWaitImageVisible(0);
                  	SetSheetHeight(220);
            	}
                break;
        }
    }
    /* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
    document.onclick=processButtonClick;
    /* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */    
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
        try {
            var srcName=ComGetEvent("name");
            /***********************************************************************************************************
                이미지 클릭 이벤트 처리, popup도 역시 이곳에서 함
                공통코드: CoFormControl.js 에 정의 되어있습니다. 이 변수를 통하여 ServiceCommand에서 분기 합니다.        
             **********************************************************************************************************/
            /*
               이곳에 document.form 혹은 document.form[0]식으로 코딩하시는 것을 삼가해 주십시오.
               메뉴가 적용되면 left_menu.jsp에 form 이 존재할 것이기 때문에 더이상 form[0]이 아닙니다.
               (순서상도 form[1]이 되겠죠?) 
               그리고 위에서 with(document.form)라고 했기때문에 (브라우저의 DOM 객체중 특정부분만 잡는다는 의미니깐!)
                document.form.f_cmd.value=INSERT;   이런식의 코딩은 지양해주십시오.
            */
            switch(srcName) {
                case "btn_Retrieve":                    
    	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	        break;
        	    case "btn_New":
    	            sheetObject.RemoveAll();
    	            formObject.reset();
        	        break;
                case "btn_Close":
                	ComClosePopup(); 
        	        break;
        	    case "btn_OK":
                    comPopupOK();
        	        break;
        	    case "btn2_Down_Excel":
        	    	if(sheetObject.RowCount() < 1){//no data
        	    		ComShowCodeMessage("COM132501");
        	    	}else{
        	    		sheetObject.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1});
        	    		
       	    		}
        	    	
        	        break;
            } // end switch
        }catch(e) {            
            /*
            자바 스크립트 에러가 발생할시 오동작이 납니다. 고객에게 이 경우 아래의 메세지가 뿌려지게 해야합니다.
            물론 화면에서 다음의 메세지를 보시면 무조건 '자바스크립트 에러구나'라고 확인하실수 가 있습니다.
            */
            if( e == "[object Error]") {
            	ComShowMessage(OBJECT_ERROR);
            } else {
            	ComShowMessage(e.message);
            }
        }
    }
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
        switch(sAction) {
          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH;                
                sheetObj.DoSearch("COM_ENS_0L1GS.do", FormQueryString(formObj) );
           break;
        }
    }
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
            /*if(formObj.cnt_cd.value == "") {
              showErrMessage("You must input Country code");
              setFocus(formObj.cnt_cd);
              return false;
            }
            if(formObj.cnt_cd.value.length < 2) {
              showErrMessage("Country code must be 2 characters");
              setFocus(formObj.cnt_cd);
              return false;
            }
            if(formObj.cnt_cd.value == "US" && formObj.loc_state.value == "") {
              showErrMessage("You must input State");
              setFocus(formObj.loc_state);
              return false;
            }*/     
        }
        return true;
    }
    /**
     * 조회결과가 오류가 발생했을 때 공통처리하는 함수
     * IBSheetConfig.js에서 DataSheetObject.prototype.event_OnSearchEnd에서 정의
     */
    function sheet_OnSearchEnd(sheetObj, code, errMsg){
    	ComOpenWait(false);
        if(errMsg!=0 ){
        	ComShowMessage(errMsg);
        }
    }
    
    function sheet_OnSort(sheetObj, Col, SortArrow){
    	sheetObj.ReNumberSeq(); 
    }