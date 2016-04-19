import java.util.*;
//import java.util.ArrayList.*;
//import java.util.Collections.*;
public class Containseg
{
public static void main(String... s)
{
ArrayList<String>al = new ArrayList<String>();
al.add("pen");
al.add("pen21");
al.add("pen2");
al.add("pen3");

System.out.println("Array contains the string "+al.contains("pen21"));
ArrayList<Integer> al1=new ArrayList<Integer>();
al1.add(2);
System.out.println("Array contains the no. "+al1.contains(2));
}
}


