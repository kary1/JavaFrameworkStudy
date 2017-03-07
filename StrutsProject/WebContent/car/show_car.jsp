<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有车辆</title>
</head>
<body>
<s:iterator value="#request.list" var="car">
名字：<s:property value="#car.name"/><br>
类型：<s:property value="#car.type"/><br>
颜色：<s:property value="#car.color"/><br>
<pre></pre>

</s:iterator>

</body>
</html>