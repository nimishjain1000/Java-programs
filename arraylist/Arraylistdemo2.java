import java.util.*;
class Arraylistdemo2
{
public static void main (String... s)
{
ArrayList<Integer> al=  new ArrayList<>();
System.out.println(al.size());
int x[]={1,-1,2,-2,3,-3};
for(int i=0;i<x.length;i++)
{al.add(x[i]);}
Object o[]=al.toArray();
for(int i=0;i<o.length;i++)
{Integer z=(Integer)o[i];

System.out.println(z.intValue());
}

System.out.println("");
for(Integer i :al)
{
System.out.println(i.intValue()+"");
}
}
}
