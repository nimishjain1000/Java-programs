class Temp extends Thread // executed :)
{
public static void main (String s[])
{
Thread t= Thread.currentThread();
System.out.println(t.getName());
}
}