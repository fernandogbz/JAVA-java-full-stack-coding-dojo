<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Page</title>
</head>
<body>
    <h1>${product.name}</h1>

    <h2>Categories</h2>
    <ul>
        <c:forEach items="${product.categories}" var="prod_category">
            <li>${prod_category.name}</li>
        </c:forEach>
    </ul>

    <form action="/products/${product.id}" method="POST" modelAttribute = "product">
        <label for="cat_id">Add Category</label>
        <select name="cat_id">
            <c:forEach items="${categories}" var="category">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Add"/>
    </form>
</body>
</html>