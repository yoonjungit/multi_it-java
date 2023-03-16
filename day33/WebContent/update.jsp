<%@page import="multi.MemberDAO"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//자바 코드 넣는 부분
        //HttpServletRequest request = new HttpServletRequest();
        //tomcat은 미리 request를 내장시켜 놓음
        String id = request.getParameter("id"); //"apple"
        String tel = request.getParameter("tel"); //"apple"
        
      	//받은 데이터를 VO(DTO)로 
      	MemberVO bag = new MemberVO();
        bag.setId(id);
        bag.setTel(tel);
        //이를 DAO에 전달
        MemberDAO dao = new MemberDAO();
    	int result = dao.update(bag);
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
회원 전화번호 수정 요청 되었음<br>

ID : <%= id %><br>
TEL : <%= tel %><br>

<%= result %>건 처리 완료

</body>
</html>