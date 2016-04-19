import javax.servlet.http.*;
import javax.servlet.*;
//import java.sql.*;
import java.io.*;

public class ActionServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("Text/html");
	PrintWriter out= res.getWriter();
	out.println("<html><body>");
	String url=req.getParameter("check");
	out.println(url);
	RequestDispatcher rd=req.getRequestDispatcher(url);
	rd.forward(req,res);
	}
}	