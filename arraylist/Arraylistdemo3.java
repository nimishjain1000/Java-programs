import java.util.*;
class Arraylistdemo3
{
public static void main (String... s)
{
ArrayList<ArrayList> al=  new ArrayList<>();
ArrayList<String> als=  new ArrayList<>();
System.out.println(al.size());
als.add("dw");
als.add("ad");
als.add("s");
als.add("c");
al.add(als);
al.add(al);


System.out.println(al.size());
//al.remove(3);

System.out.println(al.size());
System.out.println(al);
}
}
