<%@ page import="java.util.ArrayList"%>
<%@ page import="multi.BbsVO"%>
<%@ page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	BbsDAO dao = new BbsDAO();
    	ArrayList<BbsVO> listAll = dao.selectAll();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 글 보기</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo:wght@700&display=swap');
	body{
	background:#8aedd3;
	font-family: 'Nanum Myeongjo', serif;
	font-size: 30px;
	}
</style>
</head>
<body>

전체 글 리스트 <br><br><br>

<table class="table table-hover">
	<tr class="table-danger">
		<td>글 번호 </td>
		<td>글 제목 </td>
		<td>글 내용 </td>
		<td>글 작성자 </td>
	</tr>

	<% 
	for (BbsVO bbsVO : listAll) {
	%>
		<tr class="table-warning">
			<td><%= bbsVO.getNo() %></td>
			<td> 
			<a href="http://localhost:8888/web01/select2.jsp?no=<%= bbsVO.getNo() %>"><%= bbsVO.getTitle() %> </a>
			</td>
			<td> <%= bbsVO.getContent() %> </td>
			<td> <%= bbsVO.getWriter() %> </td>
		</tr>
	<% 
	}
	%>
	</table>
</body>
</html>