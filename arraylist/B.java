class A
{int x;
A(int y)
{x=y;}

}

class B extends A
{
int a;
B(int a,int x)
{this.x=x;
this.a=a;
}

public static void main(String... s)
{
A a=new B(5,4);
B b=new A(3);
System.out.println(a.x);
System.out.println(b.x);

}
}

