class Array11 
{
 void unionab(int a[],int b[])
{

int x,y,z=0;
x=a.length;
y=b.length;
z=x+y;
int p=x;
int c[]=new int[z];//assigning size to new array
for(int i=0;i<=x-1;i++)
{
c[i]=a[i];
}
for(int i=0;i<=x-1;i++)
{ for(int j=0;j<=y-1;j++)
{ if(b[j]!=a[i])
   {c[p]=b[j];
    p++;
   }
}
}

z=c.length;
for(int i =0;i<=z-1;i++)
{System.out.println(c[i]);
}
}


public static void main(String arg[])
{Array11 d=new Array11();
d.unionab(new int []{1,2,3,4},new int []{3,4,5,6});
}
}


















