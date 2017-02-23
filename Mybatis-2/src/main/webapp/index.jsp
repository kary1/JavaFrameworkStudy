<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <form action="addStu.do" method="post">
      <table>
        <tr>
          <td>学生编号</td>
          <td><input type="text" name="stuid"></td>
        </tr>
        <tr>
          <td>学生姓名</td>
          <td><input type="text" name="stuname"></td>
        </tr>
        <tr>
          <td>学生年龄</td>
          <td><input type="text" name="stuage"></td>
        </tr>
      </table>
      <input type="submit" value="新增学生">
    </form>
  </body>
</html>
