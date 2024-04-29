<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><c:out value="${language.name}" /></title>
</head>
<body>
    <form action="/languages/${language.id}" method="post">
        <input type="hidden" name="_method" value="delete">
        <input type="submit" value="Delete">
    </form>
    <form action="/languages" method="get">
        <input type="submit" value="Dashboard">
    </form>
    <form:form action="/languages/${language.id}" method="post" modelAttribute="language">
        <input type="hidden" name="_method" value="put"/>
        <form:label path="name" for="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name" type="text" name="name" value="${language.name}"/>
        <form:label path="creator" for="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator" type="text" name="creator" value="${language.creator}"/>
        <form:label path="currentVersion" for="currentVersion">Version</form:label>
        <form:errors path="currentVersion"/>
        <form:input path="currentVersion" type="text" name="currentVersion" value="${language.currentVersion}"/>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>