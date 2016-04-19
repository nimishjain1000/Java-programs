import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class LoginSessionServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("Text/html");
	PrintWriter out= res.getWriter();
	out.println("<html><body>");
	String name= req.getParameter("name");
	String password= req.getParameter("password");
	 
	 try {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nimish123");
		   Statement s=c.createStatement();
		  // String s1="select * from Emp101 where name='"+name+"' and password='"+password+"'";
		   //ResultSet rs=s.executeQuery(s1);
		   PreparedStatement stmt=c.prepareStatement("insert into Emp101 values(?,?)");
				stmt.setString(1,"name");
				stmt.setString(2,"password");
				int i=stmt.executeUpdate();
		   if(i==1)
		   {
			   HttpSession se=req.getSession();
			   se.setAttribute("name",name);
			   se.setAttribute("password",password);
			   
			   out.println("user is valid "+se.isNew());
			   out.println("<br>");
			   out.println("<a href='demo '>demo </a>");
			   out.println("<br>");
			   out.println("<a href='log' >logout </a>");
		   }
		   else
		   {out.println("useris invalid");    out.println("<a href='demo '>demo </a>");}
	 }catch(Exception e)
	 {
		 out.println(e);
		 
	 }
	 
		out.println("</body></html>");
		
		   
		   
     	 
	
	}
}
