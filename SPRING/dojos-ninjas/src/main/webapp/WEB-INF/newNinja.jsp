<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Ninja</title>
</head>
<body>
    <h1>New Ninja</h1>
    <form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
        <form:label path="dojo">Dojo: </form:label>
        <form:errors path="dojo"></form:errors>
        <form:select path="dojo">
            <c:forEach items="${dojos}" var="dojo">
                <form:option value="${dojo}">${dojo.name}</form:option>
            </c:forEach>
        </form:select>

        <form:label path="firstName">First Name:</form:label>
        <form:errors path="firstName"></form:errors>
        <form:input path="firstName" type="text"></form:input>

        <form:label path="lastName">Last Name:</form:label>
        <form:errors path="lastName"></form:errors>
        <form:input path="lastName" type="text"></form:input>

        <form:label path="age">Age:</form:label>
        <form:errors path="age"></form:errors>
        <form:input path="age" type="number"></form:input>

        <input type="submit" value="Create">
    </form:form>
</body>
</html>
