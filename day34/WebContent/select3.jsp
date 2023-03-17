<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="multi.ProductDAO"%>
<%@ page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String name = request.getParameter("name");	//검색하고자 하는 글 번호 입력
    
    ProductDAO dao = new ProductDAO();
    ArrayList<ProductVO> selectResult = dao.select(name);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cake Search</title>
<style>
	@import url('https://fonts.googleapis.com/css2?family=Gowun+Batang&display=swap');
	body{
	background:#8aedd3;
	font-family: 'Gowun Batang', serif;
	font-size: 20px;
	}
	td {
	text-align: center;
	width : 200px;
	}
</style>
</head>
<body>
케이크 검색 결과 >> <br><br><br>

<% if(selectResult.size() > 0){ %>
<table border="1">
	<tr>
		<td>케이크 </td>
		<td>케이크 이름 </td>
		<td>케이크 가격 </td>
		<td>케이크 설명</td>
	</tr>
	<% 
	for (ProductVO productVO : selectResult) {
	%>
	<tr>
		<td><p align="center"> <img src="img/<%= productVO.getImg() %>" height=300></p></td>
		<td><%= productVO.getName() %></td>
		<td><%= productVO.getPrice() %></td>
		<td><%= productVO.getContent() %></td>
	</tr>
	<% 
	}
}else{
%>
검색 결과 없음
<% } %>
</table>
</body>
</html>