<%@page import="multi.MemberDAO"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//1. HTML에서 클라아언트가 입력한 값 가져오기
        String id = request.getParameter("id"); //"apple"
        String pw = request.getParameter("pw"); //"1234"
        String name = request.getParameter("name"); //"apple"
        String tel = request.getParameter("tel"); //"010"
        
      	//2. 입력받은 데이터를 VO(DTO) 객체 생성 후 set
      	MemberVO bag = new MemberVO();
        bag.setId(id);
        bag.setPw(pw);
        bag.setName(name);
        bag.setTel(tel);

        //3. 이를 DAO에 전달 후 원하는 메소드 실행
        MemberDAO dao = new MemberDAO();
    	int result = dao.insert(bag);   //DAO에서 쿼리 실행 후 변경된 행수 result로 받기
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
	background:#8aedd3;
	}
</style>
</head>
<body>
회원 가입 요청 되었음<br>

ID : <%= id %><br>
PW : <%= pw %><br>
NAME : <%= name %><br>
TEL : <%= tel %><br>

</body>
</html>