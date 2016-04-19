import java.util.*;
class Locale2
{
public static void main(String s[])
{
Locale en=new Locale("en","us");
Locale fr=new Locale("fr","FR");
System.out.println(en.getDisplayLanguage());
System.out.println(en.getDisplayLanguage(fr));



}}