<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    int money = Integer.parseInt(request.getParameter("money"));
    int choice = Integer.parseInt(request.getParameter("choice"));
    
    if(choice==1){
    	money-=1000;
    }else if(choice==2){
    	money+=1000;
    }
    %><%=money %>