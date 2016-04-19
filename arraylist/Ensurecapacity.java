import java.util.ArrayList.*;
import java.util.*;

public class Ensurecapacity
{
	public static void main(String... s)
	{
	List<String>al=new ArrayList<String>(4);
	al.add("AS");
	al.add("AS3");
	al.add("AS1");
	al.add("AS2");
System.out.println(al);

al.ensureCapacity(2);
System.out.println(al);
	al.add("AS34");
	al.add("AS13");

for(String temp:al)
{
System.out.println(temp);
}

}
}

