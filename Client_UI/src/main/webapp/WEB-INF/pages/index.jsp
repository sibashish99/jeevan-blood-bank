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
<div>
<a href="alreadyRegistered">Already Registered ?</a>
</div>
<div>
<a href="addDonor">New Register?</a>
</div>
<div>
<a href="getAllDonor">View the List</a>
</div>

<form action="searchByBloodGroup">
<h1>Search By blood group</h1>
<input type="text" name="search">Search
<input type="submit">
</form>

<form action="searchByarea">
<h1>Search By Area Code</h1>
<input type="text" name="search">Search
<input type="submit">
</form>

<form action="searchBycamp">
<h1>Search Donor of Particular Camp</h1>
<input type="text" name="search">Search
<input type="submit">
</form>

<form action="delete">
<h1>UnRegister </h1>
<input type="text" name="search">Search
<input type="submit">
</form>

<form action="update">
<h1>Update Data </h1>
<input type="text" name="search">Search
<input type="submit">
</form>

</body>
</html>