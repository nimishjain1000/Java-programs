import java.io.*;
class MyByteWriter
{
public static void main(String p[])throws IOException
{
ByteArrayOutputStream fw=new ByteArrayOutputStream();//true for append mode
String s="Messasagsxhjgasjadba";
byte ch[]=s.getBytes();
fw.write(ch);
fw.writeTo(new FileOutputStream("pqr.txt",true));
fw.writeTo(new FileOutputStream("pqrs.txt",true));
System.out.print("success");
}
}