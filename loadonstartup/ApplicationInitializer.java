import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
import java.util.*;
public class ApplicationInitializer extends HttpServlet
{
		public void init(javax.servlet.ServletConfig sc)throws javax.servlet.ServletException
		
		{
		ServletContext ctx=sc.getServletContext();
		String val=ctx.getInitParameter("oracletab");
		String prop=ctx.getRealPath("WEB-INF//db//dp.properties");
		String oracle=ctx.getRealPath("WEB-INF//dbtable//oracletable.sql");
		LoadProperties.propLoad(prop);
		if(val.equals("yes"))
		{
		TableCreate.createTable(oracle);
		System.out.println("success");
		}
		}
}
		