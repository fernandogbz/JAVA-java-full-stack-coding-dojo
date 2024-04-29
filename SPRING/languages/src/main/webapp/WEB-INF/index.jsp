<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Languages</h1>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${languages}" var="language">
        <tr>
            <td><a href='/languages/<c:out value="${language.id}"/>'><c:out value="${language.name}"/></a></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.currentVersion}"/></td>
            <td><form action="/languages/${language.id}" method="post">
                <input type="hidden" name="_method" value="delete">
                <input type="submit" value="delete">
            </form></td>
            <td>
            <form action="/languages/${language.id}/edit" method="get">
                <input type="submit" value="edit">
            </form>
            </td>
        </tr>
        </c:forEach>
    </tbody>
</table>

<form:form action="/languages" method="post" modelAttribute="language">
    <form:label path="name" for="name">Name</form:label>
    <form:errors path="name"/>
    <form:input path="name" type="text" name="name"/>
    <form:label path="creator" for="creator">Creator</form:label>
    <form:errors path="creator"/>
    <form:input path="creator" type="text" name="creator"/>
    <form:label path="currentVersion" for="currentVersion">Version</form:label>
    <form:errors path="currentVersion"/>
    <form:input path="currentVersion" type="text" name="currentVersion"/>
    <input type="submit" value="Submit">
</form:form>
