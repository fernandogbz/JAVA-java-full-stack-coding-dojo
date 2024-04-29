<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Product</title>
</head>
<body>
    <h1>New Product</h1>

    <form:form method="POST" action="/products/new" modelAttribute="product">
        <form:label path="name" for="name">Name:</form:label>
        <form:errors path="name" cssClass="error"></form:errors>
        <form:input path="name" id="name" />

        <form:label path="description" for="description">Description:</form:label>
        <form:errors path="description" cssClass="error"></form:errors>
        <form:input path="description" id="description" />

        <form:label path="price" for="price">Price:</form:label>
        <form:errors path="price" cssClass="error"></form:errors>
        <form:input path="price" id="price"/>

        <input type="submit" value="Create" />
    </form:form>
</body>
</html>