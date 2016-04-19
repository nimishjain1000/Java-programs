class Demo
{

   int x=10; static int y=20;
 static int z=30;
   class Inner
{
	void show()
	{

	System.out.println(d.x);
	System.out.println(y);
	System.out.println(z);
	}

}
public static void main(String args[])
{
Demo d=new Demo();
Inner ob=new Inner();
Demo.ob.show();
}
}