import java.io.*;
import java.net.*;
public class Myclient
{
Socket s;
DataInputStream din;
DataOutputStream dout;
public Myclient()
{
	try
	  {
	     s=new Socket("localhost",10);
	   System.out.println(s);
		din =new DataInputStream(s.getInputStream());
		dout=new DataOutputStream(s.getOutputStream());
                              clientChat();
	}catch(Exception e)
		{System.out.println(e);}
}
public void clientChat()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1;

do{s1=br.readLine();
dout.writeUTF(s1);
dout.flush();
 System.out.println("server message;"+din.readUTF());
}while(!s1.equals("Stop"));
}//end of client chat

public static void main(String... arg)
{
new Myclient();
}
}


