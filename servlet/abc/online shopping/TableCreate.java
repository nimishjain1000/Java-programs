import java.sql.*;
import java.util.StringTokenizer;
import java.io.*;

public class TableCreate {
    public static void createTab(String string) {
        try {
            FileInputStream fin = new FileInputStream(string);
            byte[] ar = new byte[fin.available()];
            fin.read(ar);
            fin.close();
            String string2 = new String(ar);
            StringTokenizer stringTokenizer = new StringTokenizer(string2, "/");
            Connection connection = ConnectionProvider.getConn();
            Statement statement = connection.createStatement();
            while (stringTokenizer.hasMoreTokens()) {
                String string3 = stringTokenizer.nextToken();
                if (!string3.trim().equals("stop")) {
                    statement.executeUpdate(string3);
                    System.out.println(string3);
                    continue;
                } else {
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}