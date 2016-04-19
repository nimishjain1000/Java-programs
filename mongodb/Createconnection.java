import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import com.mongodb.*;


public class Createconnection{
	public static void main(String... s)
	{
		try{
		MongoClient mongoclient=new MongoClient("localhost",27017);
		DB db=mongoclient.getDB("nimish");
		System.out.println("connect to database successfully");
		boolean auth=db.authenticate("virat","anu".toCharArray());
		System.out.println("authentication:"+auth);
		DBCollection coll=db.createCollection("emp1",null);
		//DBCollection coll=dbgetCollection("emp");
		System.out.println(" successfully");
		
		
		mongoclient.close();
		}catch(UnknownHostException ex)
		{ex.printStackTrace();
		
		}
	}
}
