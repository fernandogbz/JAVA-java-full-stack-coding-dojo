<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dojo survey index</title>
</head>
<body>
    <form action="/result" method="post">
        <label for="name">Your name:</label>
        <input type="text" name="name">
        <label for="location">Dojo location:</label>
        <select name="location">
            <option value="San Jose">San Jose</option>    
            <option value="San Jose 2">San Jose 2</option>
        </select>
        <label for="language">Favorite Language:</label>
        <select name="language">
            <option value="C++">C++</option>    
            <option value="Java">Java</option>
        </select>
        <label for="comment">Coment (optional)</label>
        <input type="text" name="comment">
        <input type="submit" value="submit">
    </form>
</body>
</html>