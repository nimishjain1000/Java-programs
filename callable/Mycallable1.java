import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;//so that all the thread from thread pool during first call runs concuurently. this also ccreats thread pool
import java.util.concurrent.Future;

public class Mycallable1 implements Callable<String>
{
	@Override
			public String call()throws Exception //alternate of run function 
	{
		//System.out.println("thread started"+new Date());
		Thread.sleep(13000);
		return Thread.currentThread().getName();
		}
	public static void main(String args[])
	{
		ExecutorService executor= Executors.newFixedThreadPool(5);
		ArrayList<Future<String>> list = new ArrayList<Future<String>>();
		Callable<String> callable=new Mycallable1();
		
		for(int i=0;i<10;i++)
		{System.out.println(i);
		Future<String> future=executor.submit(callable);
		list.add(future);
		}
//	System.out.println("after");
	for(Future<String>future:list)
		{
		try{
			System.out.println(future.get()+"::"+new Date());
			System.out.println("****************");
		}
		catch(InterruptedException| ExecutionException e)
		{
			e.printStackTrace();
			
		}
		executor.shutdown();
	}	
}
}