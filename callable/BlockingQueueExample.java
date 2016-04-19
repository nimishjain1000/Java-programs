import java.util.concurrent.*;

public class BlockingQueueExample 

{
public static void main(String... s)throws Exception
{
BlockingQueue queue=new ArrayBlockingQueue(5);
Producer producer=new Producer(queue);
Consumer consumer=new Consumer(queue);
System.out.println("*******starting producer********");
new Thread(producer).start();
System.out.println("*******starting consumer********");
new Thread(consumer).start();
}
}

class Producer implements Runnable
{
protected BlockingQueue queue=null;//????
public Producer(BlockingQueue queue)
{
this.queue=queue;
}
public void run()
{
try{queue.put("String one");
     Thread.sleep(3000);
queue.put("String two");
     Thread.sleep(3000);
queue.put("String three");
     Thread.sleep(3000);
}
catch(InterruptedException e)
{e.printStackTrace();
}
}
}

class Consumer implements Runnable
{
protected BlockingQueue queue=null;//????
public Consumer(BlockingQueue queue)
{
this.queue=queue;
}
public void run()
{
try{
System.out.println(queue.take()+"O");
System.out.println(queue.take()+"P");
System.out.println(queue.take()+"L");
}


catch(InterruptedException e)
{e.printStackTrace();
}
}
}