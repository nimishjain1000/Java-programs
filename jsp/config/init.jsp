<html>
<body>
<%! String s;
public void jspInit()
{
ServletCOnfig con=getSErvletCOnfig();
s=con.getInitParameter("name");
}
%>

<%
String s1=application.getInitParameter("name1");
String s2=application.getInitParameter("name");
out.println(s1);
out.println("<br>");
out.println(s+s2);
%>
</body>
</html>


