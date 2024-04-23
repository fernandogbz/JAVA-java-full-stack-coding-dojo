<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ninja Gold</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div id="wrapper">
        <h1>Your gold: <c:out value="${sessionScope.gold}"/></h1>
        <div id="activities">
            <form action="/gold" method="post">
                <h2>Farm</h2>
                <p>(earns 10-20 gold)</p>
                <input type="hidden" name="action" value="farm">
                <button type="submit">Find Gold</button>
            </form>
            <form action="/gold" method="post">
                <h2>Cave</h2>
                <p>(earns 5-10 gold)</p>
                <input type="hidden" name="action" value="cave">
                <button type="submit">Find Gold</button>
            </form>
            <form action="/gold" method="post">
                <h2>House</h2>
                <p>(earns 2-5 gold)</p>
                <input type="hidden" name="action" value="house">
                <button type="submit">Find Gold</button>
            </form>
            <form action="/gold" method="post">
                <h2>Casino!</h2>
                <p>(earns/takes 0-50 gold)</p>
                <input type="hidden" name="action" value="casino">
                <button type="submit">Find Gold</button>
            </form>
            <form action="/gold" method="post">
                <h2>Spa</h2>
                <p>(takes 5-20 gold)</p>
                <input type="hidden" name="action" value="spa">
                <button type="submit">Find Gold</button>
            </form>

        </div>
        <form action="/gold" method="post" id="reset">
            <input type="hidden" name="action" value="reset">
            <button type="submit">Restart</button>
        </form>
        <h2>Activities:</h2>
        <div id="log">
            <c:forEach var="logPair" items="${sessionScope.log}">
                <p class=""><c:out value="${logPair}"/></p>
            </c:forEach>
        </div>
    </div>
</body>
</html>