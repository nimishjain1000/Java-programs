import java.util.*;
import java.util.ArrayList.*;

class MyClone
{
public static void main(String... s)
{
ArrayList<String>al=new ArrayList<String>();
al.add("a");
al.add("ad");
al.add("ac");
al.add("ab");
System.out.println(al);
ArrayList<String>al1=new ArrayList<String>();

al1=(ArrayList<String>)al.clone();
System.out.println("new"+al1);

if(al.get(0)==al1.get(0))
{
System.out.println("shallow");
}
if(al!=al1)
{System.out.println("copy");
}
}
}




