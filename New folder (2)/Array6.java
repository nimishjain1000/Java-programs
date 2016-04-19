class Array6
{int z;
void sort(int x[][])

{
int a;
for (int k=0;k<x.length-1;k++)
{
for(int j=0;j<x[k].length-1;j++)
{

for(int i=0;i<x[k].length-1;i++) //bubble sort
{
   if(x[i][k]>x[i+1][k])
    {int temp;
     temp=x[i+1][k];
     x[i+1][k]=x[i][k];
     x[i][k]=temp;
    }
}
}
}
 
for(int j=0;j<x.length-1;j++)
{for(int i=0;i<x[j].length-1;i++)

{System.out.println(x[j][i]);
}
}
}

public static void main(String... s)
{
 Array6 d = new Array6();
 d.sort(new int [][]{{23,1,2},{1,2,4}});
}
}