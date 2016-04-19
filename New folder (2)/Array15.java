class Array15
{
void frequencycount(int x[])
{int count=0;
for(int i=0;i<x.length;i++)	
{count=0;
for(int j=0;j<x.length;j++)	
{
if(x[j]==x[i])
count++;

}
System.out.print(x[i]+" ");
System.out.println(count);

}

}
public static void main(String... s)
{
Array15 d=new Array15();
d.frequencycount(new int []{1,1,2,3,4,5,5,5});
}
}
