<%@ page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    int no = Integer.parseInt(request.getParameter("no"));
    
    BbsDAO dao = new BbsDAO();
   	int result =  dao.delete(no);
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
글 삭제 요청 되었음<br>

NO : <%= no %><br>
<%= result %>건 삭제 완료

</body>
</html>