<%@ page language="java" import="java.util.*" 
pageEncoding="utf-8"%>
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
   <center>
     <form action="addStudent" method="post">
       <table>
         <tr>
           <td>学员姓名</td>
           <td><input name="sname"></td>
         </tr>
          <tr>
            <td>学员年龄</td>
           <td><input name="sage"></td>
         </tr>
          <tr>
           <td>授课老师</td>
           <td>
               <select name="tid">
                   <option value="1">vin</option>
                   <option value="2">peter</option>
               </select>
           </td>
         </tr>
          <tr>
           <td colspan="2">
             <input type="submit" value="提交">
           </td> 
         </tr>
       </table>
     </form>
     </center>
   <center>
   <form action="batchAddStudent" method="post">
     <table>
       <tr>
         <td>学员姓名</td>
         <td>学员年龄</td>
         <td>授课老师</td>
       </tr>
       <tr>
         <td><input type="text" name="stus[0].sname"/></td>
         <td><input type="text" name="stus[0].sage"/></td>
         <td>
           <select name="stus[0].tid">
              <option value="1">vin</option>
              <option value="2">peter</option>
           </select>  
         </td>
       </tr>
       <tr>
         <td><input type="text" name="stus[1].sname"/></td>
         <td><input type="text" name="stus[1].sage"/></td>
         <td>
           <select name="stus[1].tid">
              <option value="1">vin</option>
              <option value="2">peter</option>
           </select>  
         </td>
       </tr>
       <tr>
         <td colspan="3" align="center">
           <input type="submit" value="提交">
         </td>
       </tr>
     </table>
   </form>
   <form action="deleteStudent">
     <input type="text" name="sids[]">
     <input type="text" name="sids[]">
     <input type="text" name="sids[]">
     <input type="submit" value="删除">
   </form>
   </center>  
     
  </body>
</html>
