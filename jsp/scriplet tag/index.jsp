<html>
<body>
<%!
int x=3;
int square(int y)
{return y*y;
}
%>
<% int s=square(10);
out.println(s);
%>
<%=square(x)%>
</body>
</html>
