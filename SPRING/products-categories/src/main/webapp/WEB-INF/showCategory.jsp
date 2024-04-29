<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
</head>
<body>
    <h1>${category.name}</h1>
    <h2>Products</h2>
    <ul>
        <c:forEach items="${category.products}" var="cat_product">
            <li>${cat_product.name}</li>
        </c:forEach>
    </ul>   

    <form:form action="/categories/${category.id}" method="post">
        <label for="prod_id">Add Product</label>
        <select name="prod_id">
            <c:forEach items="${products}" var="product">
                <option value="${product.id}">${product.name}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Add">
    </form:form>
</body>
</html>