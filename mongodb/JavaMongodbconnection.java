import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import com.mongodb.*;

public class JavaMongodbconnection
{
	public static void main(String... s)
	{
		try{
		MongoClient mongoclient=new MongoClient("localhost",27017);
		List<String> dbs= mongoclient.getDatabaseNames();
		for(String dbname:dbs)
		{
		System.out.println("databases:"+dbname);
		DB db=mongoclient.getDB(dbname);//
		Set<String> collections=db.getCollectionNames();
		for(String col:collections)
		{
		System.out.println("collections:"+col);
		}
		}
		mongoclient.close();
		}catch(UnknownHostException ex)
		{ex.printStackTrace();
		
		}
	}
}
