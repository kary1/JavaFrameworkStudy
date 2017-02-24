<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
	$(function() {
		$("#like tr:even").css("background-color", "#0066ff");
		$("#one").css("background-color", "green");
	});
</script>
<style type="text/css">
#like {
	margin: auto;
}
</style>

</head>

<body>
	<h1 align="center">常见问题检索</h1>
	<form action="search.do" method="post">
		<h3 style="display: inline-block;margin-left: 32%">请输入查询关键字：</h3>
		<input id="i" name="key"> <input type="submit" value="查询">
		&nbsp;&nbsp;
		<h3 style="display: inline-block;">
			<a href="index.jsp">添加常见问题</a>
		</h3>
	</form>
	<c:if test="${scrs != null&&fn:length(scrs) == 0}">
	<div>
	<h1 id="two"></h1>
	</div>
	<div>
	<h1>请修改关键字后重试</h1>
	</div>
	<script type="text/javascript">
	
		
		var i = "没有找到和\""+$("#i").val()+"\"相关的内容,";
		$("#two").text(i);
		
	
	</script>
	</c:if>
	
	<c:if test="${fn:length(scrs) != 0}">
		<table id="like">
			<tr id="one">
				<th>编号</th>
				<th>标题</th>
				<th>分类</th>
				<th>创建时间</th>
			</tr>

			<c:forEach var="c" items="${scrs}">
				<tr>
					<td>${c.id}</td>
					<td><a href="goDetail.do">${c.title}</a></td>
					<td>${c.cname}</td>
					<td>${c.createdate}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

	<form action="do.do" method="post">
		<input type="submit" value="Classes">
	</form>

</body>
</html>
