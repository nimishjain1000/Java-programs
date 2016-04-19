import java.lang.reflect.*;
class Mycalc
{
	public int op(int a ,int b ,IntegerMath op)
	{
	return op.operation(a,b);
	}
	public static void main(String s[])throws Exception
	{
	Mycalc my=new Mycalc();
	IntegerMath add=(int a,int b)->a+b;
	IntegerMath sub=(int a,int b)->a-b;
	
	Class c= sub.getClass();
	if(c.isInterface())
	{System.out.println("it is an interface");
	}
	else if(c.isPrimitive())
	{System.out.println("it is a Primitive");
	}
	else if(c.isArray())
	{System.out.println("it is an array");
	}
	else 
	System.out.println("it is a class");
	System.out.println(c.getName());
	Method m=c.getDeclaredMethod("operation",int.class,int.class);
	System.out.println(m.getName());
	System.out.println("40+20="+my.op(40,20,add));
	System.out.println("40-20="+my.op(40,20,sub));
	
	
	}
}
interface IntegerMath
{
int operation(int a,int b);

}