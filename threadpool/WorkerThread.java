import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
private String command;
public WorkerThread(String s)
{this.command=s;
}//end of ctor

@Override
public void run()
{
System.out.println(Thread.currentThread.getName()+"start.command ="+command);
processCommand();
System.out.println(Thread.currentThread.getName()+"end =");
} //end of run()

public void processCommand()
{
try{
Thread.sleep(3000);
}
catch(InterruptedException e)
{e.printStackTrace();
}

}//********end of processcommand

public String toString()
{
return this.command;
}//**********end of toString()
}
public class SimpleThreadPool
{
public static void main(String args[])
{
ExecutorService executor =Executors.newFixedThreadPool(5);
for(int i=0;i<10;i++)
{
Runnable worker =new WorkerThread(""+i);
executor.execute(worker);
}
executor.shutdown();

while(!executor.isTerminated())
{System.out.println("bbb");
}
System.out.println("finished all thread");
}
}



