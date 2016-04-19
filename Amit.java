import java.sql.*;
public class Amit
{
public static void main(String[] args)
{
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
}
}
