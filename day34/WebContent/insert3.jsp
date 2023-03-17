<%@ page import="multi.ProductDAO"%>
<%@ page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="vo" class="multi.ProductVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo"/>

<%
    ProductDAO dao = new ProductDAO();
    dao.insert(vo);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
상품등록 완료<br>
제조회사명 : <jsp:getProperty property="company" name="vo"/> <br>
<img src="img/<%= vo.getImg() %>" width=200>
</body>
</html>
