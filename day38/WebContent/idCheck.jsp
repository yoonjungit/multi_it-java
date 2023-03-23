<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%	//줄바꿈, 공백 있는 경우 ajax에서 공백 인식
	//1. ajax4 id에 입력한 값 받아온 후
	//2. 배열 원소값과 중복 여부 체크 후 결과 반환
    	
    //1.
    String id = request.getParameter("id");
    	
    //2.
    String[] list = {"root", "admin", "hong"};
    String result ="사용가능한 ID입니다."; 
    
    for(String s : list){
    	if(s.equals(id)){
    		result = "중복된 ID입니다.";
    		break;
    	}
    }%><%=result %>