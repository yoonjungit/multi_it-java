<%@page import="multi.MemberDAO"%>
<%@page import="multi.MemberVO"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //자바 코드 넣는 부분
    //HttpServletRequest request = new HttpServletRequest();
    //tomcat은 미리 request를 내장시켜 놓음
    String id = request.getParameter("id");
    
    MemberDAO dao = new MemberDAO();
    MemberVO vo = dao.select(id);
    %>
    <!--  3.브라우저에게 결과를 알려주기 위한 html 코드 -->
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
		<td class="t1">회원 ID </td>
		<td class="t2"> <%= id %> </td>
	</tr>
	<tr>
		<td class="t1">PW </td>
		<td class="t2"> <%= vo.getPw() %> </td>
	</tr>
	<tr>
		<td class="t1">이름 </td>
		<td class="t2"> <%= vo.getName() %> </td>
	</tr>
	<tr>
		<td class="t1">회원 연락처 </td>
		<td class="t2"> <%= vo.getTel() %> </td>
	</tr>
</table>
</body>
</html>