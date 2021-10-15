<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jeevan-blood-bank</title>
</head>
<body>
<header>Donors Availabe</header>
<table>
	<tr>
		<th>Camp Name</th>
		<th>Donor Name</th>
		<th>Address</th>
		<th>Area Code</th>
	</tr>
	
<c:forEach  items="${data2 }"  var="eachItem">
     <tr>
          <th>${eachItem.campname }</th>
          <th>${eachItem.donorname }</th>
          <th>${eachItem.address }</th>
          <th>${eachItem.areacode }</th>
     </tr>
</c:forEach>
</table>

</body>
</html>