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

</head>

<body>
	<form action="">
	  <table>
	    <tr>
			<td>编号</td>
			<td><input type="text" readonly/>${c.id}</td>
	    </tr>
	    <tr>
			<td>标题</td>
			<td><input type="text" readonly/>${c.id}</td>
	    </tr>
	    <tr>
			<td>编号</td>
			<td><input type="text" readonly/>${c.id}</td>
	    </tr>
	  </table>
	  
	  
	  
	</form>
	<table>
		<tr>
			<td>${c.id}</td>
			<td><a>${c.title}</a></td>
			<td>${c.cname}</td>
			<td>${c.createdate}</td>
		</tr>
	</table>


</body>
</html>
