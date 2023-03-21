function 로그인(){
	var id2 = 'root';
	id = prompt('아이디 입력');
	if (id == id2) {	//
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
}

function 비교(){
	n1 = 100
	n2 = 200
	if (n1==n2) {
		alert('숫자 같음')
	} else {
		alert('숫자 다름')
	}
	
	feeling_my = prompt('오늘 너의 기분은?')
	feeling_f = prompt('오늘 친구의 기분은?')
	
	if (feeling_my==feeling_f) {
		alert('너와 너 친구의 기분이 같네')
	} else {
		alert('너와 너 친구의 기분이 다르네')
	}
}