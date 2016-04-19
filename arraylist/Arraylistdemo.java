import java.util.*;
class Arraylistdemo
{
public static void main (String... s)
{
ArrayList al=  new ArrayList();
System.out.println(al.size());
al.add("bb");
al.add("ad");
al.add("s");
al.add("c");
al.add(new Integer(9));

System.out.println(al.size());
al.remove(3);

System.out.println(al.size());
System.out.println(al);
}
}

