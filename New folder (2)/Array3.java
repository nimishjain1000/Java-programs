class Array3
{  int z;
   int max(int x[][])
{
    int m;

    int a;
   a=x.length;
   m= x[0][0];
int i;
 for(i=1;i<a-1;i++)
{for(int j=1;j<x[i].length-1;j++)
{ if(x[i][j]>m)
    m=x[i][j];
else 
   m=m;
 }  
}
System.out.println(m);
return m;
}

public static void main(String... s)
{Array3 d=new Array3();
d.z= d.max(new int [][]{{12,22,1,2,3},{12,22,31,2,1},{1,2,3,12,11}});
System.out.println(d.z);
}
}

