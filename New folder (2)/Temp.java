class Temp
{
 int a,b;
 
 Temp(int x,int y)
{
 //System.out.println("default");

a = x;
b = y;


}
void show()
{System.out.println(a);
System.out.println(b);


}


Temp(Temp n)
{a = n.x;
b = n.y;
}

 

public static void main(String... s)
{Temp t = new Temp(1,2);
 t.show();
Temp u = new Temp(t);
u.show();



}}