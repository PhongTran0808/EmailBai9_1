<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="includes/header.html" %>
<link rel="stylesheet" href="css/main.css" type="text/css">

<h2>List of Albums</h2>
<ul>
    <%
        java.util.List<String> albums = (java.util.List<String>) request.getAttribute("albums");
        if (albums != null) {
            for (String album : albums) {
    %>
    <li><%= album %></li>
    <%
            }
        }
    %>
</ul>

<p style="text-align:center; margin-top:20px;">
    <a href="register.jsp">
        <button class="btn-primary">Register to download</button>
    </a>
</p>


<%@ include file="includes/footer.jsp" %>
