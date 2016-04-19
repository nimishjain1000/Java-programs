class A 
{
public static void main(String s[])
{
String x="";
for(int i=0;i<100;i++)
{
x=x+(String)(( i%3==0) ? "fizz" : "");
x=x+(String)(( i%5==0) ? "buzz" : "");
System.out.println(!x.isEmpty() ? x : i);
}
}
}

