import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class ValidateServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("Text/html");
	PrintWriter out= res.getWriter();
	out.println("<html><body>");
	out.println("validate servlet");
	String name=req.getParameter("name");
	String pass=req.getParameter("pass");
	
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","nimish123");
	Statement s=c.createStatement();
	String s1="Select * from emp101 where name='"+name+"' and pass='"+pass+"'";
	ResultSet rs =s.executeQuery(s1);
	if(rs.next())
	{
	RequestDispatcher rd=req.getRequestDispatcher("action?check=wel");
	rd.forward(req,res);
	
	}
	else
	{
	RequestDispatcher rd1=req.getRequestDispatcher("action?check=err");
	rd1.forward(req,res);
	
	}
	
	
	
	}
	catch(Exception e)
	{out.println(e);
	
	}
	}
}	