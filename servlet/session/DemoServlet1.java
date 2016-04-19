import javax.servlet.http.*;
import javax.servlet.*;
//import java.sql.*;
import java.io.*;

public class DemoServlet1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("Text/html");
	PrintWriter out= res.getWriter();
	out.println("<html><body>");
	HttpSession s= req.getSession(false);
	if(s!=null)
	{
	String s1=(String)s.getAttribute("name");
	String s2=(String)s.getAttribute("password");
	//out.println(s1+"="+s2" "+s.isNew());
	out.println(s2);
	out.println(s.isNew());
	out.println("<br>");
	out.println("<a href='log'logout</a>}");
	out.println("</body></html>");
	}
	else out.println("first login and then come");
	
}
}

	