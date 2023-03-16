<%@ page import="multi.ProductDAO"%>
<%@ page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("ID");
    String content = request.getParameter("CONTENT");
    
    ProductVO vo = new ProductVO();
    ProductDAO dao = new ProductDAO();
    
    vo.setId(id);
    vo.setContent(content);
    
    dao.update(vo);
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
상품 내용 수정 요청 되었음<br>

ID : <%= id %><br>
CONTENT : <%= content %><br>


</body>
</html>