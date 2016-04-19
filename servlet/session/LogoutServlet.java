import javax.servlet.http.*;
import javax.servlet.*;
//import java.sql.*;
import java.io.*;

public class LogoutServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("Text/html");
	PrintWriter out= res.getWriter();
	out.println("<html><body>");
	HttpSession s= req.getSession();
	s.invalidate();
	out.println("<br> successfully logged out");
	out.println("<a href='index.html'>login</a>}");
	String p=s.getId();
	out.println(p);
	out.println(s.getCreationTime());
	out.println(s.getLastAccessTime());
	
	
	out.println("</body></html>");
	
	
}
}
