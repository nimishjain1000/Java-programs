import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import com.mongodb.*;


public class RemoveRecord{
	public static void main(String... s)
	{
		try{
		MongoClient mongoclient=new MongoClient("localhost",27017);
		DB db=mongoclient.getDB("nimish");
		System.out.println("connect to database successfully");
		boolean auth=db.authenticate("virat","anu".toCharArray());
		System.out.println("authentication:"+auth);
		//DBCollection coll=db.createCollection("emp1",null);
		DBCollection coll=db.getCollection("emp1");
		System.out.println(" successfully selected");
		DBObject db1=coll.find();
		coll.remove(db1);
		DBCursor cursor=coll.findOne();
		int i=1;
		while(cursor.hasNext())
		{
		System.out.println("inserted document"+i);
		System.out.println(cursor.next());
		i++;
		
		
		}
		mongoclient.close();
		}catch(UnknownHostException ex)
		{ex.printStackTrace();
		
		}
	}
}
