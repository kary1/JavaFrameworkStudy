<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <script type="text/javascript" src="scripts/jquery-3.1.0.min.js"></script>
    <script type="text/javascript">
     $(function(){
         $.ajax({
    	    type : "GET",
    	    url : "stu/1/10.do",
    	    dataType : "json",
    	    success :  function(data){
    	    	var d = data;
    	    	alert(d.id);
    	    }
         });
         $.ajax({
        	type : "POST",
        	url : "stu.do",
        	datatype : "json",
        	success : function(data){
        		for (var stu in data) {
        			/* alert(data[stu].name);
					$("#one")[0].innerHTML += "<div><span>"+data[stu].name+"</span><span>"+
					data[stu].age+"</span><span>"+data[stu].like+"<span></div>"; */
					$("#table").append("<tr><td>"+data[stu].stuId+"</td><td>"+data[stu].stuAge+"</td><td>"+data[stu].stuName+"</td></tr>");
				}
        	}
         });
     });
    </script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    <div>
      <span>name:</span>
      <span>age:</span>
      <span>like:</span>
    </div>
    <div id="one">
    </div>
    <table id="table" border="1px">
      <tr><th>name</th><th>age</th><th>like</th></tr>
    </table>
    <a href="showAll.do">showAllStu</a>
    <c:if test="${list}">
      --${list}--
    </c:if>
    <form action="add.do" method="POST">
      <input type="text" name="stuAge">
      <input type="text" name="stuName">
      <input type="submit" value="提交">
    </form>
  </body>
</html>
