import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Refresh extends HttpServlet
{
static int count=0;

	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	res.setHeader("Refresh","2");
	out.println(new Date().toString()+"time"+count++);
	
	}
}
	