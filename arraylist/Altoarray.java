import java.util.ArrayList;
class Altoarray
{
public static void main(String... arg)
{
ArrayList<String> al=new ArrayList<String>();
al.add("xx");
al.add("vv");
al.add("cc");
al.add("zz");

String arr[]=new String[al.size()];
for(int i=0;i<al.size();i++)
{
arr[i]=al.get(i);
}

//ddisplay
for(String k:arr)
{System.out.println(k);
}
}
};