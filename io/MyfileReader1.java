import java.io.*;
class MyfileReader1
{public static void main(String s[])throws IOException
{FileInputStream fr=new FileInputStream("abc.txt");
//int i=;
byte b[]=new byte[fr.available()];
fr.read(b);
String S =new String(b);
System.out.print(S);
fr.close();
}
}
