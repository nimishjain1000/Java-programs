import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class SendRedirect extends HttpServlet
{ 	
    public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{ res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html><body>");
	out.println("before");
	String name=req.getParameter("name");
	String pass=req.getParameter("pass");
	
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","nimish123");
	Statement s=c.createStatement();
	String s1="Select * from nimish where id="+name+" and name='"+pass+"'";
	ResultSet rs=s.executeQuery(s1);
	
	if(rs.next())
	{
	res.sendRedirect("http://facebook.com");}
	else res.sendRedirect("http://google.com");
	
	}
	catch(Exception e)
	{
	out.println(e);}
	out.println("after");
	out.println("</body></html>");
	}
}
	
	
	
	
	
	