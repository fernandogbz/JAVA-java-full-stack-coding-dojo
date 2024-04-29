<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Category</title>
</head>
<body>
    <h1>New Category</h1>

    <form:form method="POST" action="/categories/new" modelAttribute="category">
        <form:label path="name" for="name">Name:</form:label>
        <form:errors path="name" cssClass="error"></form:errors>
        <form:input path="name" id="name" />

        <input type="submit" value="Create" />
    </form:form>
</body>
</html>