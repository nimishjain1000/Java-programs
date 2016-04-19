class Array16 
{int q;
void findmaxone(int x[][])
{
int a,b;
a=x.length;
b=a;
int sum[]=new int [b];
for(int i=0;i<a;i++)
{int count =0;
for(int j=0;j<x[i].length;j++)
{if(x[i][j]==1)
 count++;
}
sum[i]=count;
}
Array16 p=new Array16();
p.q=p.max1(sum[]);
System.out.println(p.q);
}


int max1(int x[])
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
{Array16 d = new Array16();
d.findmaxone(new int [][]{{1,1,1,0},{1,0,0,0},{1,1,1,1},{0,0,0,0}});

}
}
