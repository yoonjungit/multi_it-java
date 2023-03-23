<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
    int money = Integer.parseInt(request.getParameter("money"));
    String currency = request.getParameter("currency").trim();
    System.out.println(currency);
	int result = 0;
	
    if(currency.equals("won")){
    	result = money/1300;
    }else if(currency.equals("dollar")){
    	System.out.println("d");
    	result = money*1300;
    }
    System.out.println(result);
%><%= result %>