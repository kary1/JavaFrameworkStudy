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
  </head>
  
  <body>
<!--    This is my JSP page. <br>
    
    <form action="addInfo.do" method="post">
      id:<input type="text" name="id"><br>
      标题:<input type="text" name="title"><br>
      内容：<input type="text" name="content"><br>
     回复：<input type="text" name="replycount"><br>
    查看： <input type="text" name="viewcount"><br>
      发表时间：<input type="text" name="reporttime"><br>
     最新回复：<input type="text" name="lastposttime"><br>
      <input type="submit" value="addInfo"><br>
    </form>  -->
    <center>
    <h1>手机咨询</h1>
    <table>
      <tr>
        <td>序号</td>
        <td>标题</td>
        <td>回复/查看</td>
        <td>发表时间</td>
        <td>最新回复</td>
      </tr>
      <c:if test="${infoList ne null}">
        <c:forEach var="info" items="${infoList}">        
          <tr>
           <td>${info.id}</td>
           <td><a href="detail.do?id=${info.id}">${info.title}</a></td>
           <td>${info.replycount}/${info.viewcount}</td>
           <td><fmt:formatDate value="${info.reporttime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
           <td><fmt:formatDate value="${info.lastposttime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
          </tr>
        </c:forEach>
      </c:if>
    </table>
    </center>
  </body>
</html>