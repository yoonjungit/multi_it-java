<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String tel = request.getParameter("tel");
    String result = "";
	String pre = tel.substring(0, 3);
    switch(pre){
    case "010":
    	result="NewJeans";
    	break;
    case "011":
    	result="BTS";
    	break;
    case "017":
    	result="지오디";
    	break;
    case "019":
    	result="핑클";
    	break;
    }
    Random r = new Random();
    int post = r.nextInt(900)+100;
    result = result + post;
    %><%=result %>