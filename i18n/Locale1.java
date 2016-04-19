import java.util.*;
public class Locale1
{
public static void main(String[] s)
{ 
Locale locale=Locale.getDefault();//it returns the instance of current locale
System.out.println(locale.getDisplayCountry());
System.out.println(locale.getDisplayLanguage());  
System.out.println(locale.getDisplayName());  
System.out.println(locale.getISO3Country());  
System.out.println(locale.getISO3Language());  
System.out.println(locale.getLanguage());  
System.out.println(locale.getCountry()); 
}
}