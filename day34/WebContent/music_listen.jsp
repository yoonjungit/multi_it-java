<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="multi.MusicDAO"%>
<%@ page import="multi.MusicVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    int song_id = Integer.parseInt(request.getParameter("song_id"));
    int hit = Integer.parseInt(request.getParameter("hit"));
    
    MusicDAO dao = new MusicDAO();
    dao.update(song_id, hit);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music Listen</title>
</head>
<body>
Hi!
</body>
</html>