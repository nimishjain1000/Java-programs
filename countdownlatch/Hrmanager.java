import java.util.concurrent.CountDownLatch;

public class Hrmanager //why public :output is same in both case
{
public static void main(String... a)
{
CountDownLatch countDownLatch =new CountDownLatch(3);

TechLead techlead1=new TechLead(countDownLatch,"one");
TechLead techlead2=new TechLead(countDownLatch,"two");
TechLead techlead3=new TechLead(countDownLatch,"third");
techlead1.start();
techlead2.start();
techlead3.start();

try{
System.out.println("hr manager wait for recruitment proccess");
countDownLatch.await();
System.out.println("Distribute offer letter");
}
catch(InterruptedException e)
{e.printStackTrace();
}

}
}
class TechLead extends Thread
{CountDownLatch countDownLatch ;
public TechLead(CountDownLatch countDownLatch ,String name)
{
super(name);
this.countDownLatch=countDownLatch
;//**************************************************************8
}
@Override
public void run()
{
try{
Thread.sleep(4000); //see the output
}catch(InterruptedException e)
{e.printStackTrace();
}
System.out.println(Thread.currentThread().getName()+":recruited");
countDownLatch.countDown();
}
}