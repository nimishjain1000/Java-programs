public class JoinExample
{
public static void main(String... s)
{Thread t1=new Thread(new Myrunnable(),"t1");
 Thread t2=new Thread(new Myrunnable(),"t2");
 Thread t3=new Thread(new Myrunnable(),"t3");
t1.start(0);

try{
t1.join(2000);}
catch(InterruptedException e)
{e.printStackTrace();
}

t2.start();

try{
t1.join();}
catch(InterruptedException e)
{e.printStackTrace();
}

t3.start();

try{
t1.join(); t2.join(); t3.join();}
catch(InterruptedException e)
{e.printStackTrace();
}

System.out.println("ol thred are dead");
}

}

class MyRunnable implements Runnable{
public void run()
{

System.out.println("Thread dstarted :::"+Thread.currentThread().getName());
try
{
Thread.sleep(3000);
}
catch(InterruptedException e)
{e.printStackTrace();
}

System.out.println("Thread ended :::"+Thread.currentThread().getName());

}
}