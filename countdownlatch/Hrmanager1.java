import java.util.concurrent.CyclicBarrier;
public class Hrmanager1
{public static void main(String... s)
{

CyclicBarrier cyclicbarrier=new CyclicBarrier(3);
TechLead techlead1=new TechLead(cyclicBarrier,"one");
TechLead techlead2=new TechLead(cyclicBarrier,"two");
TechLead techlead3=new TechLead(cyclicBarrier,"third");
techlead1.start();
techlead2.start();
techlead3.start();
 System.out.println("no work for hr");
}
}

class TechLead extends Thread
{
CyclicBarrier cyclicBarrier;
public TechLead(CyclicBarrier cyclicBarrier,String name)
{super(name);
this.cyclicBarrier=cyclicBarrier;
}

@Override
public void run()
{
try{
Thread.sleep(3000);
System.out.println(Thread.currentThread().getName()+"recruited");
System.out.println(Thread.currentThread().getName()+"waiting for other to complete");
cyclicBarrier.await();
System.out.println("all recruited"+Thread.currentThread().getName()+"gives offer letter");
}
catch(InterruptedException e)
{e.printStackTrace();
}
}
}
