import java.util.*;
import java.io.*;

public class ArrayListserialization1
{
public static void main (String s[])
{
ArrayList<Emp>al=new List<Emp>();

al.add(new Emp(10));
al.add(new Emp(40));
al.add(new Emp(20));
al.add(new Emp(30));

try{
    FileOutputStream fo=new FileOutputStream("myfile");
    ObjectOutputStream out=new ObjectOutputStream(fo);
   out.writeObject(al);
   out.writeObject("l");

       FileInputStream fi=new FileInputStream("myfile");
    ObjectInputStream oi=new ObjectInputStream(fi);

ArrayList al1=(ArrayList)oi.readObject();// downcasting into arraylist

Iterator<Emp>i=al1.iterator();

while(i.hasNext())
{Emp e=i.next();
System.out.println(e.x);
}

}
catch(Exception e){}

}
}

class Emp implements Serializable
{int x;
Emp(int x)
{this.x=x;
}
}

	
    