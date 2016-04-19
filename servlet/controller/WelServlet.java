import javax.servlet.http.*;
import javax.servlet.*;
//import java.sql.*;
import java.io.*;

public class WelServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("Text/html");
	PrintWriter out= res.getWriter();
	out.println("<html><body>");
	
	out.println("<br> welcome");
	
	
	
	out.println("</body></html>");
	
	
}
}
