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
<h1><c:out value="${majHeading}"/></h1>
<form action="searchCampsByArea">
<h1>SearchBy Area Code</h1>
<input type="text" name="search">Search
<input type="submit">
</form>
<div>
<a href="campRegister">New Register ?</a>
</div>
<div>
<a href="getAllDonorCamps">View  Records</a>
</div>



</body>
</html>