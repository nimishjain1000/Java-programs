import java.util.*;
class Arraylistdemo1
{
public static void main (String... s)
{
ArrayList<Integer> al=  new ArrayList<>();
System.out.println(al.size());
int x[]={1,-1,2,-2,3,-3};
for(int i=0;i<x.length;i++)
{al.add(x[i]);}
System.out.println(al);
Iterator<Integer> i= al.iterator();
while(i.hasNext())
{Integer z=i.next();
if(z.intValue()<0)
i.remove();
}

System.out.println(al.size());
System.out.println(al);
}
}
