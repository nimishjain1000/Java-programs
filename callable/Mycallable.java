//import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Mycallable implements Callable<String>
{
	@Override
	public String call()throws Exception //alternate of run function 
	{
		System.out.println("thread started"+new Date());
		Thread.sleep(3000);
		return Thread.currentThread().getName();
		}
	public static void main(String args[])
	{
		ExecutorService executor= Executors.newFixedThreadPool(2);
		Callable<String> callable=new Mycallable();
		Future<String> future=executor.submit(callable);
	System.out.println("after");
	try{
			System.out.println(future.get()+"::"+new Date());
			
		}
		catch(InterruptedException| ExecutionException e)
		{
			e.printStackTrace();
			
		}
		executor.shutdown();
	}	
}