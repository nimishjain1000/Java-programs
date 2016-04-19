<%! int day=7;%>

<html>

<body>

<%
response.setIntHeader("Refresh",5);
out.println(day++);
%>
</body>
</html>
