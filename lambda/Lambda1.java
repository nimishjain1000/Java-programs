class Lambda1
{
final static String s="Hello";
public static void main(String a[])
{
Greeting greet=message->System.out.println(message+s);
greet.sayMessage("nimish");

}
	interface Greeting{
	void sayMessage(String message);
	}
}