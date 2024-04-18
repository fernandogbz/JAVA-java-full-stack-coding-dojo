<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Checkerboard</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <%
    int board_w = Integer.parseInt(request.getParameter("width"));
    int board_h = Integer.parseInt(request.getParameter("height"));
    %>
    <h1>Checkerboard: <%=board_w%>w X <%=board_h%>h</h1>
    <% for(int i = 0; i < board_h; i++){ %>
        <div class="row">
        <% for(int j = 0; j < board_w; j++){ %>
            <div class='<%= (i + j) % 2 == 0 ? "black-square" : "white-square" %>'></div>
        <% } %>
        </div>
    <% } %>

</body>
</html>