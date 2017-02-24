<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    This is my JSP page. <br>
    <a href="getFaps.do">getAll</a>
    --${faps }--
    <form action="add.do" method="post">
      <input type="text" name="id">
      <input type="text" name="cname">
      <input type="submit" value="addclasses">
    </form>
    <a href="getcla.do">getAll</a>
    --${cla}--
    <form action="add.do" method="post">
      类别名称：<input type="text" name="cname">
      内容：<input type="text" name="content">
      添加时间：<input type="text" name="createdate">
      标题：<input type="text" name="title">
      <input type="submit" value="addfap">
    </form>
    <form action="search.do" method="post">
      <input type="text" name="key">
      <input type="submit" value="search">
    </form>
    --${scrs}--
    <a href="searchAll.do">searchall</a>
    --${resu}--
  
  
  <!--
  <h1 align="center">常见问题检索</h1>
	<form action="like.do" method="post">
		<h3 style="display: inline-block;margin-left: 32%">请输入查询关键字：</h3>
		<input type="text" name="s"> <input type="submit" value="查询">
		&nbsp;&nbsp;
		<h3 style="display: inline-block;">
			<a href="#">添加常见问题</a>
		</h3>
	</form>
	<table id="like">
		<tr id="one">
			<th>编号</th>
			<th>标题</th>
			<th>分类</th>
			<th>创建时间</th>
		</tr>
		<c:forEach var="c" items="${f}">
			<tr>
				<td>${c.id}</td>
				<td><a href="#">${c.title}</a></td>
				<td>${c.cname}</td>
				<td>${c.createdate}</td>
			</tr>
		</c:forEach>
	</table>
  -->
  </body>
</html>
