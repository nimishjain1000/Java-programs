import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet implements Servlet
{
public  void init(ServletConfig con)
{
}

public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException

{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
out.println("kuch bhi krega");
out.println("</body></html>");
}
public void destroy()
{}
public ServletConfig getServletConfig()
{return null;}
public String getServletInfo()
{return null;}

}

