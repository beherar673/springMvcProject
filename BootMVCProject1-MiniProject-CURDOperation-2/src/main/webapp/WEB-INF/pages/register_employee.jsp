<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:red;text-align:center">Register Employee</h1>

<frm:form modelAttribute="emp">

  <table align="center "bgcolor="cyan">
      <tr>
           
           <td>Employee name::</td>
           <td><frm:input path="ename"/></td>
      </tr> 
      <tr> 
           <td>Employee desg::</td>
           <td><frm:input path="job"/></td>         
      </tr>
      <tr> 
           <td>Employee salary::</td>
           <td><frm:input path="sal"/></td>         
      </tr>
       <tr> 
           <td>Employee deptno::</td>
           <td><frm:input path="deptno"/></td>         
      </tr>
       <tr> 
           <td><input type="submit" value="submit"></td>
           <td><input type="reset" value="cancel"></td>
                    
       </tr>

  </table>

</frm:form>

</body>
</html>