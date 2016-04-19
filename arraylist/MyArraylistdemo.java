import java.util.*;

 class MyArraylistdemo
{
	public static void main(String x[])
	{
	MyArraylist<String> al=new MyArraylist<String>(5);
	Iterator i=al.iterator();
	al.add("ram1");
	al.add("ram2");
	al.add("ram3");
	al.add("ram4");
	al.add("ram5");
	i.remove();
	System.out.println(al);
	System.out.println(al.size1());	
	System.out.println(al.capacity());
                }

}

  class MyArraylist <T> implements Iterator

{
int size1;
Object object[];
float growth =.5f;
int index=-1;
int next=0;

	public MyArraylist()
	{size1=10;  //instead of this new Object[10] ,this is better
	object=new Object[size1];
	}
	public MyArraylist(int size1) 
	{this.size1=size1; // or size1=size1
	object=new Object[size1];
	}


	public void add(T Obj)
{
      if(index+1==size1)
      {         int tempsize=size1+(new Float(size1*growth)).intValue();
	Object tmpobj[]=new Object[tempsize];
	size1=tempsize;
	for(int i=0;i<object.length;i++)
	{tmpobj[i]=object[i];
	}
	object=tmpobj;
     }
object[index+1]=Obj;
}

//end of add

public void addAll(T o[])
	{
	for(int i=0;i<o.length;i++)
	{add(o[i]);
	}	
	}

public boolean set(int i,T obj)
	{
	if(i<0)
	return false;
                else
	if(i>index)
	{object[index+1]=obj;}
	else
                object[i]=obj;
	}


public String toString()
{
String str="";
for(int i=0;i<index;i++)
{str+=object[i].toString();}
return str;
}

public int size1()
{return index+1;
}
public int capacity()
{
return object.length;
}
public Object next()
{return object[next++];
}

public boolean hasNext()
{if(next>index)
return false;
else return true;
}

Iterator iterator()
{
return this;
}

}

