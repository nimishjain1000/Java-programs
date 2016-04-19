<html>
<body>
<%
String site=new String("http://www.google.com/");
response.setStatus(response.SC_MOVED_TEMPORARILY);
response.setHeader("Location",site);
out.println("hello jsp"); %>
</body>
</html>
