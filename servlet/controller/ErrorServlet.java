import javax.servlet.http.*;
import javax.servlet.*;
//import java.sql.*;
import java.io.*;

public class ErrorServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("Text/html");
	PrintWriter out= res.getWriter();
	out.println("<html><body>");
	
	out.println("<br> invalid");
	
	
	
	out.println("</body></html>");
	
	
}
}
