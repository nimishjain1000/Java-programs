<html>
<body>
<%
 String name=request.getParameter("name");
 String pass=request.getParameter("pass");
 RequestDispatcher rd =request.getRequestDispatcher("index.jsp");
 rd.forward(request,response);
 if(name.equals("ducat")&&pass.equals("ducat"))
 {out.println("valid");
 
 }
else
{out.println("invalid");
 
 }
%>
</body>
</html>
