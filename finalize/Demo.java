class Demo
{
int x=10;
int y=20;
static Demo d;
public void finalize()throws Throwable
{d=this;
System.out.println("gc");
}

public static void main(String... s)
{Demo d1=new Demo();
d1.finalize();
}
}