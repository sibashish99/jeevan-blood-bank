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
<div>
<form:form action="/addDonor" modelAttribute="command" method="post"  >
        <div>
            <label for="">ID</label>
            <form:input path="id"/>
        </div>
        
        <div>
            <label for="">Name</label>
            <form:input path="donorname"/>
        </div>
        
        <div>
            <label for="">Age</label>
            <form:input path="age"/>
        </div>
        <div>
        <label for="">Group</label>
        <form:input path="bloodgroup"/>
        </div>
        
        <div>
        <label for="">Code</label>
        <form:input path="areacode"/>
        </div>
        
        
        <div>
            <input type = "submit" value = "Register !">
        </div>
</form:form>
</div>




</body>
</html>