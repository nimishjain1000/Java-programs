class Abc
{

static int a;
void get(int a)
{a=a;
System.out.println(this);
System.out.println(a);
}
public static void main(String... s)
{Abc d =new Abc();
d.get(12);
System.out.println(d);
}
}
