import java.io.*;
class Printstream
{public static void main(String s[])throws IOException
{FileOutputStream fr=new FileOutputStream("abc.txt");
PrintStream ps=new PrintStream(fr);
ps.println("hello");
}
}