import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public class ApplicationInitializer
extends HttpServlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        ServletContext servletContext = servletConfig.getServletContext();
        String string = servletContext.getInitParameter("oracletab");
        String string2 = servletContext.getRealPath("WEB-INF//db/db.properties");
        String string3 = servletContext.getRealPath("WEB-INF//dbtable/oracletable.txt");
        LoadProperties.propLoad((String)string2);
        if (string.equals("yes")) {
            TableCreate.createTab((String)string3);
            System.out.println("Table Created Successfully");
        }
    }
}