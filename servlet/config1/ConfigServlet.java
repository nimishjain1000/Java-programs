import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.*;

public class ConfigServlet extends HttpServlet
{    ServletConfig con;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    { con=getServletConfig();
	String image=con.getInitParameter("image");
	String driver=con.getInitParameter("driver");
	
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	out.println("<html><body  background="+image+">");
	out.println(driver);
	out.println("</body></html>");
	}
}
	