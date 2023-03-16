<%@ page import="multi.BbsDAO"%>
<%@ page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    int no = Integer.parseInt(request.getParameter("no"));	//검색하고자 하는 글 번호 입력
    
    BbsDAO dao = new BbsDAO();
   	BbsVO vo = dao.select(no);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	@import url('https://fonts.googleapis.com/css2?family=Gowun+Batang&display=swap');
	body{
	background:#8aedd3;
	font-family: 'Gowun Batang', serif;
	font-size: 20px;
	}
	.t1{
	width : 100px;
	height : 30px;
	}
	.t2{
	width : 200px;
	height : 30px;
	}
</style>
</head>
<body>
글 검색 결과 >> <br><br><br>

<table border="1">
	<tr>
		<td class="t1">글 번호 </td>
		<td class="t2"> <%= no %> </td>
	</tr>
	<tr>
		<td class="t1">글 제목 </td>
		<td class="t2"> <%= vo.getTitle() %> </td>
	</tr>
	<tr>
		<td class="t1">글 내용 </td>
		<td class="t2"> <%= vo.getContent() %> </td>
	</tr>
	<tr>
		<td class="t1">글 작성자 </td>
		<td class="t2"> <%= vo.getWriter() %> </td>
	</tr>
</table>
</body>
</html>