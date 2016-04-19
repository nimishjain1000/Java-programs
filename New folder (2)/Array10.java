class Array10 //transpose
{
void transpose(int x[][])
{
int y[][];
 for(int i=0;i<x.length;i++)
{
 for(int j=0;j<x[i].length;j++)
{
   y[i][j]=x[j][i];
}
}

for(int i=0;i<x.length;i++)
{System.out.println("");
for(int j=0;j<x[i].length;j++)
{ System.out.print(y[i][j]);
}
}

}
public static void main(String... s)
{
Array10 d=new Array10();
d.transpose(new int [][]{{1,2,3},{4,5,6},{7,8,9}});

}
}