<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Dojo</title>
</head>
<body>
    <h1>New Dojo</h1>
    <form:form action="/dojos/new" method="POST" modelAttribute="dojo">
        <form:label path="name">Name: </form:label>
        <form:errors path="name"></form:errors>
        <form:input path="name"></form:input>
        
        <input type="submit" value="Create">
    </form:form>
</body>
</html>
