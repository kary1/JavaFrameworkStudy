<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	  function dopage(op){
		  var currentPage = parseInt('${currentPage}');
		  var totalPage = parseInt('${totalpage}');
		  switch(op){
		    case "first":
		    	currentPage = 1;
		    	break;
		    case "next":
		    	if (currentPage + 1 >= totalPage) {
		    		currentPage = totalPage;
				}else {
					currentPage = currentPage + 1;
				}
		    	break;
		    case "pre":
		    	if (currentPage <= 1) {
		    		currentPage = 1;
				}else{					
					currentPage = currentPage - 1;
				}
		    	break;
		    case "last":
		    	currentPage = totalPage;
		    	break;
		  }
		 location.href = "queryByPage.do?currentPage="+currentPage;
	  };
	  function query(){
		 var row = document.getElementById("row").value;
		 location.href = "show.do?row="+row;
	  }
	</script>
  </head>
  
  <body>
    This is my JSP page. <br>
    <input id="row" type="text" ><a href="javascript:query()">show</a>
    <c:if test="${stus ne null}">
    <table>
      <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>老师</td>
      <tr>
      <c:forEach items="${stus}" var="stu">
        <tr>
          <td>${stu.sid}</td>
          <td>${stu.sname}</td>
          <td>${stu.sage}</td>
          <td>${stu.tname}</td>
        </tr>
      </c:forEach>
      <tr>
        <td colspan="4">
         <a href="javascript:dopage('first')">第一页</a>
         <a href="javascript:dopage('pre')">上一页</a>
         <a href="javascript:dopage('next')">下一页</a>
         <a href="javascript:dopage('last')">最后一页</a>
         <span>共${totalpage}页</span>
         <span>当前是第${currentPage}页</span>
         <span>共${fn:length(stus)}行</span>
        </td>
      </tr>
    </table>
    </c:if>
  </body>
</html>
