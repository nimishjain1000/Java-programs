class Link
{public int idata;
 public Link next;
 
    public Link(int id)
	{
	idata =id;
	}
	public String toString()
	{return "->"+idata;
	
	}
}

class Linklist
{
   private  Link first;
   
   public Linklist()
   {first=null;
   
   }
   
   public boolean isEmpty()
   {return(first==null);
   
   }
   
   public void insertFirst(int id)
   {
   Link newlink=new Link(id);
   newlink.next=first;
   first=newlink;
   }
   
   public Link deleteFirst()
   { Link temp=first;
   first=first.next;
   return temp;
   }
   
   public String toString()
   {String str="";
   Link current=first;
   while(current!=null)
   {str+=current.toString();
     current=current.next;
   }
   return str;
   }
   
}

public class Mylinklist
{
   
   public static void main(String... s)
   {
       Linklist thelist= new Linklist();
       thelist.insertFirst(522);
       thelist.insertFirst(32);
       thelist.insertFirst(42);
       thelist.insertFirst(2);
	   System.out.println(thelist);
	   Link b = thelist.deleteFirst();
	  System.out.println(b);
	   System.out.println(thelist);
	   
	   
   }
}

