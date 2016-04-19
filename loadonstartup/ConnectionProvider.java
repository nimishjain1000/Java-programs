import java.sql.*;
public class ConnectionProvider
{
public static Connection con=null;

	public static Connection getCon()
	{
	if(con==null)
		{
		try
			{
			String driver=System.getProperty("driver");
			String url=System.getProperty("url");
			String user=System.getProperty("user");
			String pass=System.getProperty("pass");
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pass);
			
			}catch(Exception e){}
		}return con;
	}
}
