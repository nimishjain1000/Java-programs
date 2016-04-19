import java.util.*;
class LambdaWithCollection
{
public static void main(String s[]){
String[] str= {"nimish ","kashish"};
List<String> family=Arrays.asList(str);
for(String m:family)
{System.out.println(m+";");
}
//mm
family.forEach((String m)->System.out.println(m+";    "));

}
}
