import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class CarServlet extends HttpServlet
{
		public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{

		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession(false);//this ensures the session is used which is created 
		if(session!=null)
		{
		String cars[]=req.getParameterValues("car");
		session.setAttribute("cars",cars);
		RequestDispatcher rd=req.getRequest("/welcome.html");
		rd.forward(req,res);
		
		}
		else
		{
			RequestDispatcher rd=req.getRequest("/index.html");
		rd.forward(req,res);
		
		}
		}
}
		