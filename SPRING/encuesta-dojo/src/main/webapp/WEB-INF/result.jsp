<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Results</title>
</head>
<body>
    <h1>Submitted info</h1>
    <h2>Name: <c:out value="${name}"/></h2>
    <h2>Dojo location: <c:out value="${location}"/></h2>
    <h2>Favorite Language: <c:out value="${language}"/></h2>
    <h2>Comment: <c:out value="${comment}"/></h2>
    <a href="/">Go Back</a>
</body>
</html>