import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="MyAnnotationServlet",urlPatterns={"/hello"})

public class MyAnnotationServlet extends HttpServlet
{  @Inject Mybean mybean;
  public void service (HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {
  res.setContentType("text/html");
  PrintWriter out=res.getWriter();
  out.println("<h2>hi via annotation</h2>");
  out.println(mybean.getMessage());
  out.close();
  }
}
