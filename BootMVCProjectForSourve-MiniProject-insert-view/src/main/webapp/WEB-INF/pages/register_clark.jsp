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
<frm:form modelAttribute="clk">
   
   <table align="center"bgcolor="red">
       <tr>
          <td>Enter your name</td>	
          <td><frm:input path="name"/></td>
       </tr>
       <tr>
           <td>Enter your age</td>
           <td><frm:input path="age"/></td>
       </tr>
       <tr>
           <td><input type=submit ,value=save> </a></td>
           <td><input type=reset ,value=cancle></td>
       </tr>
       
   
   </table>
</frm:form>

<a href="saveAll">Show all register data</a>

</body>
</html>