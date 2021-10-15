<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib   uri="http://www.springframework.org/tags/form"  prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jeevan-blood-bank</title>
</head>
<body>
<header>Register For Donotion Camp</header>
<div>
<form:form action="/campRegister" modelAttribute="command2" method="post"  >
        <div>
            <label for="">DonorCamp ID</label>
            <form:input path="campname"/>
        </div>
        
        <div>
            <label for="">Donor Name</label>
            <form:input path="donorname"/>
        </div>
        
        <div>
            <label for="">Donorcamp Address</label>
            <form:input path="address"/>
        </div>
        
        <div>
        <label for="">Area Code</label>
        <form:input path="areacode"/>
        </div>
        
        <div>
            <input type = "submit" value = "Register !">
        </div>
</form:form>
</div>

</body>
</html>