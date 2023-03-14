<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //자바 코드 넣는 부분
    //HttpServletRequest request = new HttpServletRequest();
    //tomcat은 미리 request를 내장시켜 놓음
    String no = request.getParameter("no"); //"apple"
    String content = request.getParameter("content"); //"apple"
    %>
    <!--  3.브라우저에게 결과를 알려주기 위한 html 코드 -->
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
글 내용 수정 요청 되었음<br>

NO : <%= no %><br>
CONTENT : <%= content %><br>


</body>
</html>