<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="multi.MusicDAO"%>
<%@ page import="multi.MusicVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MusicDAO dao = new MusicDAO();
    ArrayList<MusicVO> chartList = dao.getChart();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music Chart</title>
<style>
@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo:wght@700&display=swap');
	body{
	background:#d7b1f0;
	font-family: 'Nanum Myeongjo', serif;
	}
	td {
	text-align: center;
	width : 200px;
	}
</style>

</head>
<body>

<table border="1">
	<tr>
		<td>순위 </td>
		<td>제목 </td>
		<td>아티스트 </td>
		<td>앨범아트</td>
		<td>감상</td>
	</tr>

	<% 
	for (int i = 0; i < chartList.size(); i++) {
	%>
	<tr>
		
		<td><%= i+1%></td>
		<td><%= chartList.get(i).getTitle() %></td>
		<td><%= chartList.get(i).getArtist() %></td>
		<td><p align="center"> <img src="img/<%= chartList.get(i).getImg() %>" width = 70></p></td>
		<td>
			<a href= "http://localhost:8888/web01/music_listen.jsp?song_id=<%= chartList.get(i).getSong_id() %>&hit=<%= chartList.get(i).getHit() %>"
				onclick="window.open('https://www.youtube.com/results?search_query=<%= chartList.get(i).getTitle() %>+<%= chartList.get(i).getArtist() %>')" >
				<button>듣기</button>
			</a>
		</td>
		
	</tr>
	<% 
	}
	%>
</table>
	
</body>
</html>