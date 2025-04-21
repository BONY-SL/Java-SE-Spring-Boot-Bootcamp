<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%
    int age = 25;
    String name = "IICT";
%>

<p>
    <%=age%>
</p>
<p>
    <%=name%>
</p>
</body>
</html>