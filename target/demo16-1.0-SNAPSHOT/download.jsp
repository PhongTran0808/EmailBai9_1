<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="includes/header.html" %>
<link rel="stylesheet" href="css/main.css" type="text/css">

<h2>Download Page</h2>

<%
    com.example.demo16.model.User user = (com.example.demo16.model.User) session.getAttribute("user");
    if (user != null) {
%>
<p><b>Email:</b> <%= user.getEmail() %></p>
<p><b>First Name:</b> <%= user.getFirstName() %></p>
<p><b>Last Name:</b> <%= user.getLastName() %></p>
<%
    }
%>

<h3>Available Downloads</h3>
<ul>
    <li><a href="download?file=86_true_life.mp3">86 (the band) - True Life Songs and Pictures</a></li>
    <li><a href="download?file=paddlefoot_first.mp3">Paddlefoot - The First CD</a></li>
    <li><a href="download?file=paddlefoot_second.mp3">Paddlefoot - The Second CD</a></li>
    <li><a href="download?file=joe_rut_genuine.mp3">Joe Rut - Genuine Wood Grained Finish</a></li>
</ul>

<form action="albums" method="get" style="margin-top:20px;">
    <input type="submit" value="Back to Album List">
</form>

<%@ include file="includes/footer.jsp" %>
