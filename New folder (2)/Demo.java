class Demo
{  static int a=10;
    void put(int a)
   {  a=a; }
     void get()
{  System.out.println(a); }
 public static void main(String... S)
 { System.out.println("main running ");
    Demo D=new Demo();
   D.put(10);
D.get();   
}
}
     