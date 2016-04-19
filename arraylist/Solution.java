import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Solution
{
  public static void main(String... s)
  {
  CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<String>();
  al.add("add0");
  al.add("add1");
  al.add("add2");
  al.add("add3");
  
  try
	{
	Arth1 alt1=new Arth1(al);
	Thread t1=new Thread(alt1);
	Arth2 alt2=new Arth2(al);
	Thread t2=new Thread(alt2);
	t1.setPriority(10);
	t1.start();
	t2.start();
	}catch(Exception e)
	   {System.out.println("Exception"+e);}
	   
	
	}
}

class Arth1 implements Runnable
{ CopyOnWriteArrayList<String> al;
  
   Arth1(CopyOnWriteArrayList<String> al)
   {this.al=al;
   
   }
   public void run()
   {Iterator i=al.iterator();
   
     while(i.hasNext())
	  { try{
               String str=(String)i.next();
				System.out.println("name="+str);
					Thread.sleep(1000);
			}catch(Exception ex)
				{System.out.println("exceptuon in reading="+ex);
				System.exit(0);
				}
				
       	  }
	  }
   }
  

class Arth2 implements Runnable
{ CopyOnWriteArrayList<String> al;
  
   Arth2(CopyOnWriteArrayList<String> al)
   {this.al=al;
   
   }
   public void run()
   {   try{for(int i=0;i<5;i++)
         {al.add("ff");
		 al.add("fd");
		 
		 	
     				Thread.sleep(1000);
					}
			}catch(Exception ex)
				{System.out.println("exceptuon in reading="+ex);
				System.exit(0);
				}
				
       	  }
	  }
   
  
