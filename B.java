Class B
{

int x;

void getX()
{
System.out.println(x+"via func");
new B().x=10;
}

B()
{
System.out.println(x+"via ctor");
}

public static void main(String a[])
{
new B();
}

}