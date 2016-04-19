class Array5
{int z;
void sort(int x[])
{
int a;
a=x.length;
for(int j=0;j<a-1;j++)
{

for(int i=0;i<a-1;i++) //bubble sort
{
   if(x[i]>x[i+1])
    {int temp;
     temp=x[i+1];
     x[i+1]=x[i];
     x[i]=temp;
    }
}
}
 for(int j=0;j<=a-1;j++)
{System.out.println(x[j]);
}
}

public static void main(String... s)
{
 Array5 d = new Array5();
 d.sort(new int []{23,1,2,32,12,22,14,1,65,33,3});
}
}