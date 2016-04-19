class Demo
{
int x=10;
int y=20;
public void finalize() throws Throwable
{
System.out.println("gc");
}
static void show()
{Demo d=new Demo();
display();
}
static void display()
{
Demo d1=new Demo();
}
}
class Temp
{
public static void main(String... s)
{
Demo.show();
System.gc();
}
}
