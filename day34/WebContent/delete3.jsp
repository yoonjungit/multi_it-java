<%@ page import="multi.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String no = request.getParameter("no");
    
    ProductDAO dao = new ProductDAO();
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
상품삭제 요청 되었음<br>

NO : <%= no %><br>
<%= result %>건 삭제 완료

</body>
</html>