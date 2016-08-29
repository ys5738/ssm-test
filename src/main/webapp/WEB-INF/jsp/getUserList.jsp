<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page import= "ys.pojo.*"%>
<%@ page import= "java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<h2>
getuserlist

</h2>
<%

List<User>users =(List) request.getAttribute("users");
for(User u: users){

%>
<table border="1">
  <tr>
    <th>Name</th>
    <th>Psw</th>
    <th>Age</th>
  </tr>
  <tr>
    <td><%=u.getName()%></td>
    <td><%=u.getPsw()%></td>
    <td><%=u.getAge()%></td>
  </tr>
</table>

<%} %>
</body>
</html>