import java.util.*;
//import java.util.ArrayList.*;
import java.util.Collections.*;
public class Containseg1
{
public static void main(String... s)
{
ArrayList<Emp>al = new ArrayList<Emp>();
al.add(new Emp(1002));
al.add(new Emp(1022));
al.add(new Emp(1003));
al.add(new Emp(1004));
Emp e2=new Emp(1005);
al.add(e2);
System.out.println("Array contains emp ");
for(Emp e:al)
{System.out.println(e.id);
}

System.out.println("Array contains 1002 "+al.contains(e2));
}
}
class Emp
{
int id;
Emp (int id)
{this.id=id;}

public boolean equals(Object o)
{System.out.println("check");
Emp e=(Emp)o;
if(this.id==e.id)
return true;
else return false;
}
}



