class Array12   //performing on square matrix only as this also print diagonal sum
{
      void matrixsum(int x[][])
{int a,b;
a=b=x.length-1;
     for(int i=0;i<a;i++)
{x[i][b]=0;
     for(int j=0;j<b;j++)
{x[i][b]=x[i][b]+x[i][j];
}
}

    for(int j=0;j<b;j++)
{x[a][j]=0;
x[a][b]=0;
    for(int i=0;i<a;i++)
{x[a][j]=x[a][j]+x[i][j];
  if(i==j)
{x[a][b]=x[a][b]+x[i][j];}
}
}

for(int i=0;i<a+1;i++)
{
System.out.println("");
for(int j=0;j<b+1;j++)
{System.out.print(x[i][j]);
}
}

}

public static void main(String... s)
{
Array12 d= new Array12();

d.matrixsum(new int[][]{{1,2,3},{4,5,12},{7,12,9}});
}
}