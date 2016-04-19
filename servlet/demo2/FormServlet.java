import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.*;

public class FormServlet extends HttpServlet
{ 	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {ServletOutputStream out=res.getOutputStream();
	res.setContentType("text/html");
	out.println("<html><head><title>basic form output </title></head>");
	out.println("here is uyour data");
	//extract the data
	
	String title= req.getParameter("title");
	String name= req.getParameter("name");
	String city= req.getParameter("city");
	String country= req.getParameter("country");
	String telephone= req.getParameter("telephone");
	String age= req.getParameter("age");
	
	//extrating data from checkbox
	String [] interest =req.getParameterValues("interest");
	
	//output of data
	out.println("your title"+title);
	out.println("<br>city"+city);
	out.println("your country"+country);
	out.println("your telephone"+telephone);
	out.println("your interst include");
	
	for(int i=0;i<interest.length;i++)
	{out.println("i.>"+interest[i]);
	
	}
	out.println("your age "+age);
	out.println("<html>"+title);
	out.println("</body></html>");
	}
}
	
	
	
	
	
	
