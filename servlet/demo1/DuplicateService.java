import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
//import java.sql.*;

public class DuplicateService extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {System.out.println("raghav");
	   super.service(req,res);
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   out.println("<html><body>");
   String name=req.getParameter("name");
   String pass=req.getParameter("pass");
   
   if(name.equals("DUCAT")&&pass.equals("DUCAT"))
   out.println("user is vakid through service method");
   else
   out.println("user is invalid service");
   out.println("</body></html>");
   }
   
   public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   out.println("<html><body>");
   String name=req.getParameter("name");
   String pass=req.getParameter("pass");
   
   if(name.equals("DUCAT")&&pass.equals("DUCAT"))
   out.println("user is valid through doget method");
   else
   out.println("user is invalid service");
   out.println("</body></html>");
   }
}
   
   
   
   