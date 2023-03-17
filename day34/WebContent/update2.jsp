<%@ page import="multi.BbsDAO"%>
<%@ page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    int no = Integer.parseInt(request.getParameter("no"));
    String content = request.getParameter("content");
    
    BbsVO vo = new BbsVO();
    BbsDAO dao = new BbsDAO();
    
    vo.setNo(no);
    vo.setContent(content);
    
    dao.updateC(vo);
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
글 내용 수정 요청 되었음<br>

NO : <%= no %><br>
CONTENT : <%= content %><br>


</body>
</html>