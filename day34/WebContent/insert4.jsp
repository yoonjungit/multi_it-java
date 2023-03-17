<%@ page import="multi.MovieDAO"%>
<%@ page import="multi.MovieVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="vo" class="multi.MovieVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo"/>
    
<%
    	MovieDAO dao = new MovieDAO();
    	dao.insert(vo);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= vo.getTitle() %> 등록 완료<br>
</body>
</html>
