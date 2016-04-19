import java.util.*;
import java.util.ArrayList.*;

class ListArray
{
 public static void main(String s[])
{
ArrayList<String>al=new ArrayList<String>();
al.add("a");
al.add("ad");
al.add("ac");
al.add("ab");
System.out.println(al);
String str[]=new String[al.size()];
al.toArray(str);
for( String st :str)
{System.out.println(st);
}
}
}
