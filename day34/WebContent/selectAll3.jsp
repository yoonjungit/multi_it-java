<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="multi.ProductDAO"%>
<%@ page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    ProductDAO dao = new ProductDAO();
    ArrayList<ProductVO> listAll = dao.selectAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 글 보기</title>
<style>
@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo:wght@700&display=swap');
	body{
	background:#f7a8dd;
	font-family: 'Nanum Myeongjo', serif;
	}
	td {
	text-align: center;
	width : 200px;
	}
</style>
</head>
<body>

전체 케이크 리스트 <br><br><br>

<table border="1">
	<tr>
		<td>케이크 </td>
		<td>케이크 이름 </td>
		<td>케이크 가격 </td>
		<td>케이크 설명</td>
	</tr>

	<% 
	for (ProductVO productVO : listAll) {
	%>
	<tr>
		<td><p align="center"> <img src="img/<%= productVO.getImg() %>" height=300></p></td>
		<td><%= productVO.getName() %></td>
		<td><%= productVO.getPrice() %></td>
		<td><%= productVO.getContent() %></td>
	</tr>
	<% 
	}
	%>
	</table>
</body>
</html>