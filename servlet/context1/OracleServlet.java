import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.*;
import java.sql.*;
import java.util.*;

public class OracleServlet extends HttpServlet
{
     public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	 {
	    res.setContentType("text/html");
		ServletContext ctx=getServletContext();
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
       //Enumeration e=ctx.getInitParameterNames();
	   String driver=ctx.getInitParameter("driver");
	   String url=ctx.getInitParameter("url");
	   String user=ctx.getInitParameter("user");
	   String pass1=ctx.getInitParameter("pass1");
	   try
	   { 
	   Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","nimish123");
		Statement s=con.createStatement();
		int x=s.executeUpdate("insert into nimish values(100,'shanu')");
		ResultSet rs=s.executeQuery("select*from nimish");
		while(rs.next())
		{
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
	}}
	catch(Exception e)
		{
		System.out.println(e);
		}
	   
	 out.println("</body></html>");
	 
	    
	 }


}