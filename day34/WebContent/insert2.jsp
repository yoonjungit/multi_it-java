<%@ page import="multi.BbsDAO"%>
<%@ page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String title = request.getParameter("TITLE"); 
    String content = request.getParameter("CONTENT");
    String writer = request.getParameter("WRITER");
    
    BbsVO vo = new BbsVO();
    vo.setTitle(title);
    vo.setContent(content);
    vo.setWriter(writer);
    
    BbsDAO dao = new BbsDAO();
    int result = dao.insert(vo);
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
게시판 글쓰기 요청 되었음<br>

TITLE : <%= title %><br>
CONTENT : <%= content %><br>
WRITER : <%= writer %><br>

<%= result %>건 등록 완료
</body>
</html>