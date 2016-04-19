class A
{
 A()
{
System.out.println("default");
}

A(int x)
{this();
System.out.println(x);
}

A(int x,int y)
{
System.out.println(x+y);
this(10);
}

public static void main(String... s)
{
new A(10,12);
}

}