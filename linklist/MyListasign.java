import java.io.*;

//********************************
class Node
{
 Object data;
Node next;
}

//**********************
 interface Myiterator
{
public boolean hasNxt();
 public Object next();
}
//************************

class Mylinkedlist implements Myiterator
{
Node start=null;
Node hsnxt;
Node nxt;

public Myiterator myiterator()
{
nxt=hsnxt=this.start;
return this;
}

 public boolean hasNxt()
{
boolean flag =false;

while(this.hsnxt!=null)
{
flag =true;
this.hsnxt=this.hsnxt.next;
}
return flag;
}

public Object next()
{
Object o=nxt.next;
nxt=nxt.next;
return o;
}

public boolean isEmpty()
{
if(start==null)
return true;
else return false;
}

public void addFirst(Object o)
{
Node d=new Node();
d.data=o;

if(start==null)
{start=d;
d.next=null;
}
else
{
d.next=start;
start =d;
}

}

public void addLast(Object o)
{
Node d=new Node();
d.data=o;

if(start==null)
{start=d;
d.next=null;
}
else
{
 Node p=start;
while(p.next!=null)
{
p=p.next;
}
p.next=d;
}
}

public Object getFirst()
{
return (start.data);
}

public Object getLast()
{
 Node p=start;
while(p.next!=null)
{
p=p.next;
}
return p.data;
}

public Object removeFirst()
{
Object o=null;
if(start!=null)
{
o=start.data;
start=start.next;
}
return o; 
}


public Object removeLast()
{
Object o=null;
Node p=start;
if(p.next==null)
{o=start;
start=null;
}
else 
{
while(p.next!=null)
{

p=p.next;
o=p;
}
p=null;

}
return o; 
}

}
//***************************************
	class MyListasign
{
	Mylinkedlist el =new Mylinkedlist();
	
public static void main(String s[]) throws IOException
  {
  MyListasign obj=new MyListasign();
int ch,ch1=0;
String str;

BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

//***first forloop************************************************************************

for(;;)
{
System.out.println(" 1.add \n 2.delete \n 3.display 4.exit\n");
System.out.println("enter choice =");
ch=Integer.parseInt(sc.readLine());
	switch(ch)

	{case 1:   for(;;)
	{obj.clrscr();
	System.out.println("select the position");
	System.out.println(" 1.front \n 2.rear \n 3.back\n");
	System.out.println("enter choice =");
	ch1=Integer.parseInt(sc.readLine());
		switch(ch1)
		{
		case 1:System.out.println("enter new string");
		           str=sc.readLine();
		         obj.el.addFirst(str);
		break;
		case 2:
		System.out.println("enter new string");
		           str=sc.readLine();
		         obj.el.addLast(str);
		break;
		case 3:break;
		default: System.out.println("wrong Choice");
		}
		if(ch1==3)
			break;
	}case 2:
	for(;;)
	{obj.clrscr();
	if(obj.el.isEmpty()==false)
	{System.out.println("select the position for delete");
	System.out.println(" 1.front \n 2.rear \n 3.back\n");
	System.out.println("enter choice =");
	ch1=Integer.parseInt(sc.readLine());
		switch(ch1)
		{case 1:obj.el.removeFirst();
		break;
		case 2:
		obj.el.removeLast();
		break;
		case 3: break;
		default: System.out.println("wrong choice");
		}
		}
	else
	{System.out.println("wrong choice");
      break;	
	}
	if(ch1==3)
		break;
	obj.clrscr();
	}

	case 3:
	if(obj.el.isEmpty())
	System.out.println("nothing to display");
	else
	{
	System.out.println("content");
	Myiterator it=obj.el.myiterator();
	while(it.hasNxt())
	{System.out.println(it.next());
	}
	}break;
	case 4:
	System.exit(0);
	deafault: 
	System.out.println("wrong choice");
	}	
System.out.println("*****************wait*******************");

try {
Thread.sleep(3000);
}catch(Exception e)
{
}
obj.clrscr();
}
}

void clrscr()
{
for(int i=0;i<50;i++)
{System.out.println("\n");
}
}

}

		

