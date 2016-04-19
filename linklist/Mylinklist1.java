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
   public Link delete(int key)
   { Link current= first;
     Link previous= first;
	 
	while(current.idata!=key)
     {if(current ==null)
	    return null;
	else	
       {previous= current;
	 	 current= current.next;
	
	   }
	 }  
	   if(current==first)
	   {first=first.next;
	   }
	   else
	   previous.next=current.next;
	   
	  return current;
	  

	   
	 }     
	 
      public Link find(int key)
   { Link current= first;
     Link previous= first;
	 
	while(current.idata!=key)
     {if(current ==null)
	    return null;
	else	
       {previous= current;
	 	 current= current.next;
	
	   }
	 }  
	  return current;
	  

	   
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

public class Mylinklist1
{
   
   public static void main(String... s)
   {
       Linklist thelist= new Linklist();
       thelist.insertFirst(522);
       thelist.insertFirst(32);
       thelist.insertFirst(42);
       thelist.insertFirst(2);
	   System.out.println(thelist);
	   Link b=thelist.deleteFirst();
	   System.out.println(b);
	   System.out.println(thelist);
	   Link c=thelist.delete(32);
	   System.out.println(c);
	   System.out.println(thelist);
	   System.out.println("finf 44");
	   Link d=thelist.find(42);
	   System.out.println(d);
	   System.out.println(thelist);
	    
	   
   }
}

