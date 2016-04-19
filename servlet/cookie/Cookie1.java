import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=req.getWriter();
		out.println("<html><body>");
		Cookie c[]=getCookies();
		if(c.length==null)
		{
			Cookie c1=new Cookie("name","nimish");
			Cookie c2 =new Cookie("value","jain");
			addCookie(c1);
			addCookie(c2);
			
		}
		else{
			for(i=0;i<c.length;i++)
			{
					out.println(c[i].getName());
				out.println(c[i].getValue());
				out.println("<br>");
				
			}
		}
		out.println("</body></html>");
		
	}
}