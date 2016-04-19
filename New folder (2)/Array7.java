class Array7
{
 void mergesort(int x[],int y[])
{
int a,b,c;
 a=x.length;
 b=y.length;
 c=a+b;
int z[]=new int[c];
 for(int i=0;i<a;i++)
{  z[i]=x[i];
}
 for(int j=a;j<c;j++)
{z[j]=y[j];
}
Array7 p=new Array7();
p.sort(z,c);
}

void sort(int x[],int y)
{

for(int j=0;j<y;j++)
{

for(int i=0;i<y-j;i++) //bubble sort
{
   if(x[i]>x[i+1])
    {int temp;
     temp=x[i+1];
     x[i+1]=x[i];
     x[i]=temp;
    }
}
}
 for(int j=0;j<y;j++)
{System.out.println(x[j]);
}
}
public static void main(String... s)
{
Array7 d=new Array7();
d.mergesort(new int []{1,3,22,12,21},new int []{2,4,6,3,5,7});
}
}
