class X
{int x;
{ this.x=10;
System.out.println("init");
}
{ this.x=10;
System.out.println("init 2");
}
X()
{
System.out.println("dfault");
}
X(int x)
{//this();

System.out.println(x);
}
X(int x,int y)
{//this(1000);

System.out.println(x+y);
}
public static void main(String s[])
{new X();
new X(1000);
new X(100,200);
}
}
