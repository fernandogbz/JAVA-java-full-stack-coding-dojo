<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><c:out value="${language.name}"/></title>
</head>
<body>
    <form action="/languages" method="get">
        <input type="submit" value="Dashboard">
    </form>
    <h1><c:out value="${language.name}"/></h1>
    <p>Creator: <c:out value="${language.creator}"/></p>
    <p>Current Version: <c:out value="${language.currentVersion}"/></p>
    <form action="/languages/${language.id}/edit" method="get">
        <input type="submit" value="Edit">
    </form>
    <form action="/languages/${language.id}" method="post">
        <input type="hidden" name="_method" value="delete">
       <input type="submit" value="Delete">
    </form>
</body>
</html>