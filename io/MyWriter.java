import java.io.*;
class MyWriter
{
public static void main(String p[])throws IOException
{
FileOutputStream fw=new FileOutputStream("E:\\java program\\threading\\abcd.txt",true);//true for append mode
String s="Messasagsxhjgasjadba";
byte ch[]=s.getBytes();
fw.write(ch);fw.close();
System.out.print("success");
}
}