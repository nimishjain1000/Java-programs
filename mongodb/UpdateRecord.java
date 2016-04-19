import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import com.mongodb.*;


public class UpdateRecord{
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
		
		DBCursor cursor=coll.find();
		while(cursor.hasNext())
		{
		DBObject updatedoc=cursor.next();
		updatedoc.put("likes",500);
		coll.save(updatedoc);
		}
		int i=1;
		DBCursor cursor1=coll.find();
		while(cursor1.hasNext())
		{
		System.out.println("updated document"+i);
		System.out.println(cursor1.next());
		i++;
		
		
		}
		mongoclient.close();
		}catch(UnknownHostException ex)
		{ex.printStackTrace();
		
		}
	}
}
