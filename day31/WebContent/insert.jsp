<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//1. HTML에서 클라아언트가 입력한 값 가져오기
        String id = request.getParameter("id"); //"apple"
        String pw = request.getParameter("pw"); //"1234"
        String name = request.getParameter("name"); //"apple"
        String tel = request.getParameter("tel"); //"010"

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