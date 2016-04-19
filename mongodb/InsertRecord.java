import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import com.mongodb.*;


public class InsertRecord{
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
		BasicDBObject doc=new BasicDBObject("title","mongodb1");
		doc.append("likes",100);
		coll.save(doc);
		BasicDBObject doc2=new BasicDBObject("title2","mongodb12");
		doc.append("likes",300);
		coll.save(doc2);
		System.out.println("inserted");
		DBCursor cursor=coll.find();
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
