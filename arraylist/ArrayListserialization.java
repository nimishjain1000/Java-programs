import java.util.ArrayList.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;
public class ArrayListserialization
{

public static void main(String a[])//throws IOException
{ ArrayList<String> al=new ArrayList<String>();
//Scanner scan= new Scanner(System.in);

    //For string

//    String text= scan.nextLine();
    //int text1= scan.nextInt();
//al.add(text);
al.add("ASD");
al.add("AS");
al.add("asdxxxxfg");

System.out.println(al);

try{
			//serialization
FileOutputStream fos=new FileOutputStream("my");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(al);
oos.close();
fos.close();
			//deserialization
FileInputStream fin =new FileInputStream("my");
ObjectInputStream oin =new ObjectInputStream(fin);
ArrayList<String> al1=(ArrayList)oin.readObject();
System.out.println(al1);
}
catch(Exception e){}
}
}



