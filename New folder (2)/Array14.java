class Array14     //lower triangle
{int sum1;

int trianglesumb(int x[][])
{int sum=0;
for(int i=0;i<=x.length-1;i++)
{
 for(int j=0;j<=x[i].length-1;i++)
{ if(j<=i)
 sum=sum+x[i][j];
}
}
return sum;
}

public static void main(String... s)
{
Array14 d=new Array14();
d.sum1=d.trianglesumb(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
System.out.println(d.sum1);
}
}
