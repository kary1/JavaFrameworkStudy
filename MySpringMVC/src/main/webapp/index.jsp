<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <a href="welcome">sayHi</a>
    <form action="welcome" method="post">
      <input type="submit" value="helloworld">
    </form>
    <form action="show" method="post">
      name:<input type="text" name="name"><br>
      age:<input type="text" name="age"><br>
      like:<input type="text" name="like"><br>
      <input type="submit" value="提交">
    </form>
    <form action="list" method="post">
      name:<input type="text" name="tlist[0].name">
      age:<input type="text" name="tlist[0].age">
      adressNum:<input type="text" name="tlist[0].adress.num">
      adressStreet:<input type="text" name="tlist[0].adress.street"><br>
      name:<input type="text" name="tlist[1].name">
      age:<input type="text" name="tlist[1].age">
      adressNum:<input type="text" name="tlist[1].adress.num">
      adressStreet:<input type="text" name="tlist[1].adress.street"><br>
      name:<input type="text" name="tlist[2].name">
      age:<input type="text" name="tlist[2].age">
      adressNum:<input type="text" name="tlist[2].adress.num">
      adressStreet:<input type="text" name="tlist[2].adress.street"><br>
      name:<input type="text" name="tlist[3].name">
      age:<input type="text" name="tlist[3].age">
      adressNum:<input type="text" name="tlist[3].adress.num">
      adressStreet:<input type="text" name="tlist[3].adress.street"><br>
      <input type="submit" value="提交">
    </form>
    <a href="wel?id=444">注解传参</a>
    <form action="wel" method="post">
      name:<input type="text" name="stu.name"><br>
      age:<input type="text" name="stu.age"><br>
      like:<input type="text" name="stu.like"><br>
      <input type="submit" value="注解传对象">
    </form>
    <a href="setList">@ModelAttribute修饰方法</a>
    <a href="index">@ModelAttribute修饰返回值</a>
    <a href="print?l=4">@ModelAttribute修饰参数</a>
    <c:if test="${stringList ne null}">
      --${stringList}--
    </c:if>
  </body>
</html>
