import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="MyAnnotationServlet1",urlPatterns={"/hello"})

public class MyAnnotationServlet extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {res.setContentType("text/html");
    PrintWriter out=res.getWriter();
	out.println("<html><head><title>via annotation </title></head>");
	out.println("</html>");
     out.close();
	 
   }
}