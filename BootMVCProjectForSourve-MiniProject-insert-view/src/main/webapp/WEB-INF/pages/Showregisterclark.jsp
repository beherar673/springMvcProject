<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
 <c:when test="${!empty itclark }">
      <h1 style="color:red;text-align:center">clark portal</h1>
      <table border=1 align="center" bgcolor="cyan">
      <tr style="color:red"><th>id</th><th>name</th> <th>age</th>
      
      <c:forEach var="clark" items="${clk }">
      <tr style="color:blue">
      <td>${clark.id}</td>
      <td>${clark.name}</td>
      <td>${clark.age}</td>
      </tr>
      </c:forEach>
      
      </table>
      
       </c:when>
       <c:otherwise>
       <h1>not respond</h1>
       </c:otherwise>
       </c:choose>
</body>
</html>