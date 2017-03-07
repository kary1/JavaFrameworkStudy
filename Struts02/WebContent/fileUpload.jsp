<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
</head>
<body>
<a href="struts2_01.docx">struts2_01.docx</a>
<form action="file_upload.action" method="post" enctype="multipart/form-data">
	图片上传<input type="file" name="image">
	<input type="submit">

</form>

</body>
</html>