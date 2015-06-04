/**
 * 로그인 입력시 영어와 숫자만 입력하도록 체크
 */
function check(){
	if(document.frm.id.value == ""){
		alert("아이디를 입력해 주세요");
		document.frm.id.focus();
		return false;
	}else if(document.form.age.value==""){
		alert("나이를 입력해 주세요");
		document.frm.id.focus();
		return false;
	}else if(isNaN(document.frm.age.value)){
		alert("숫자로 입력해 주세요");
		document.frm.id.focus();
		return false;
	}else{
		return true;
	}
}