class Array9
{
 void matrixadd(int x[][],int y[][])//square matrix case 
{
 int a;
int b;
a=x.length;
b=y.length;
 if(a==b)
System.out.println("matrices can be added");
else
System.out.println("matrices cannot be added");

int z[a][b];

for(int i=0;i<a-1;i++)
{ for(int j=0;j<b-1;j++)
{ 
 z[i][j]=x[i][j]+y[i][j];
}
