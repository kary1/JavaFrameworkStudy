<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
  <script type="text/javascript" src="scripts/jquery-3.1.0.min.js"></script>
  <script type="text/javascript">
    $(function(){
    	$("#commit").click(function (){
    		$.ajax({
    			url : "addReply.do",
    			type : "POST",
    			data : "id="+${info.id}+"&content="+$("#content").val(),
    			dataType : "json",
    			success : function(rep){
    				$("#repList").append("<div>发表于："+rep.replytime+"</div><div>"+rep.content+"</div><br>");
    			},
    			error : function(){
    				alert("failed");
    			}
    		});
    	});
    });
  </script>
  </head>
  
  <body>
    <h1>${info.title}</h1>
    <p>发表于：<fmt:formatDate value="${info.reporttime}" pattern="yyyy-MM-dd HH:mm:ss"/></p><br>
    <p>${info.content}</p><br>
    <div id="repList">
    <h3>读者回应</h3><br>
    <c:if test="${repList ne null}">
      <c:forEach  items="${repList}" var="rep">
        <div>发表于：${rep.replytime}</div>
        <div>${rep.content}</div><br>
      </c:forEach>
    </c:if>
    </div> 
    <div>快速回复（字数200字以内）</div>
    <textarea  style="margin: 10px 0px" rows="20" cols="50" id="content"></textarea><br>
    <input id="commit" type="button" value="提交"/>
    <a href="showAll.do">返回首页</a>
  </body>
</html>