import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class AllServlet extends HttpServlet
{ 	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {PrintWriter out=res.getWriter();
	res.setContentType("text/html");
		out.println("<html><body>");
	out.println("<head><title>basic form output </title></head>");
	out.println("here is uyour data");
	
	Enumeration e=req.getParameterNames();
	while(e.hasMoreElements())
	{
		String name=(String)e.nextElement();
		String value =req.getParameter(name);
		out.println(name+"="+value);
		out.println("<br>");
		
	}
	out.println("<br>");
	out.println("</body></html>");
	}
	
	
}	