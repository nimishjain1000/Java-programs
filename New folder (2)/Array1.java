class Array1
{  int z;
   int max(int x[])
{
    int m;

    int a;
   a=x.length;
   m= x[0];
int i;
 for(i=1;i<a-1;i++)
{ if(x[i]>m)
    m=x[i];
else 
m=m;

   
}
System.out.println(m);
return m;
}

public static void main(String... s)
{Array1 d=new Array1();
d.z= d.max(new int []{12,22,1,23,3,24,1,25,9});
System.out.println(d.z);
}
}

