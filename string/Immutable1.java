class Immutable1
{
    public static void main(String b[])
    {
     String s="nimish";
    // s.concat("jain"); problem
      s=s.concat("jain");
     System.out.println(s);

    int a=10;  
    String s1=String.valueOf(a);  
    System.out.println(s1+10);  
     s1=s1+20;
    System.out.println(s1);  

   }
}