import java.io.*;
class MyfileReader
{public static void main(String s[])throws IOException
{FileInputStream fr=new FileInputStream("abc.txt");
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
}
}
