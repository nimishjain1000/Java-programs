import java.io.*;
//import java.util.*;
import java.net.*;
public class MyClient1
Socket s;
DataInputStream din;
DataOutputStream dout;
public Myclient1()
{
	try{
	s=new Socket("local host",10);
	
	din=new DataInputStream(s.getInputStream());
	dout=DataOutputStream(s.getOutputStream());
	clientChat();
}
catch(Exception e){}
}

public void clientChat()throws IOException
{My m=new My(din);
Thread t1=new Thread(m);
t1.start();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1;

do
	{s1=br.readLine();
	dout.writeUTF(s1);
	dout.flush();
	}while(!s1.equals("stops"));
}
public static void main(String... s)
	{new Myclient1();
	}

class My implements Runnable
{
DataInputStream din;
My(DataInputStream din)
{this.din=din;
}
public void run()
{
String s2=" ";
do{
	try{s2=din.readUTF();
	System.out.println(s2);
	}catch(Exception e){}
}while(!s2equals("stop"));
}
}
