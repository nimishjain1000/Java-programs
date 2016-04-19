import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;

public class ImageServlet extends HttpServlet
{ 
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException
	{ 
	String filename="T2.docx";
	ServletOutputStream out=null;// 
	BufferedInputStream buf=null;
	out=res.getOutputStream();
	
	String s1=getServletContext().getRealPath("/T2.docx");
	File doc=new File(s1);
	res.setContentType("application/msword");
	//res.addHeader("Context-Disposition","attachment;filename="+filename);
	res.setContentLength((int)doc.length());
	FileInputStream input =new FileInputStream(doc);
	buf=new BufferedInputStream(input);
	
	int readBytes=0;
	while((readBytes=buf.read())!=-1)
	  out.write(readBytes);
	
	}
}
