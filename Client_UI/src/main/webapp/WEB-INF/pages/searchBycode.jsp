<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jeevan-blood-bank</title>
</head>
<body>
<header>List Of Donors Availabe by Area Code</header>
<table>
	<tr>
		<th>ID</th>
		<th>Donor Name</th>
		<th>Age</th>
		<th>Blood group </th>
		<th>Area Code </th>
	</tr>
	
<c:forEach  items="${data }"  var="eachItem">
     <tr>
          <th>${eachItem.id }</th>
          <th>${eachItem.donorname }</th>
          <th>${eachItem.age }</th>
          <th>${eachItem.bloodgroup }</th>
          <th>${eachItem.areacode }</th>
     </tr>
</c:forEach>
</table>

</body>
</html>