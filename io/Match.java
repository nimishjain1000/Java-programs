import java.util.*;
class Match
{
	public static void main(String []s)
	{
		String name ; 
		String dic[]= new String[100000];
		Arrays.fill(dic, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		int n[] = new int[100000];
		
		Scanner sc = new Scanner(System.in);
		int T ;
		int len=1;
		T = sc.nextInt();
		name = sc.next();
		dic[0] = new String(name);
		n[0] = 1;
		if(T>1)
		{
			name = sc.next() ; 
			if(name.compareTo(dic[0]) > 0)
			{
				dic[1] = new String(name);
				n[1] = 1;
				len++;
			}
			else {
					if(name.compareTo(dic[0]) < 0)
					{
						dic[1] = new String(dic[0]) ; 
						n[1] = new Integer(n[0]);
						dic[0] = name;
						len++;
					}
					else
						n[0]++; 
 				}
		}
		for(int i=2 ; i<T ; i++)
		{
			name = sc.next();
			for(int j=0 ; j<len ; j++)
			{


			
				if(name.equals(dic[j]))
				{
					
					n[j]++;
					break ; 
				}
				else {
	
					if((name.compareTo(dic[j]) > 0 && name.compareTo(dic[j+1])<0) || name.compareTo(dic[0]) < 0)
					{
					if(dic[j+1].equals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"))
{
	dic[j+1] = new String(name);
	n[j+1] = new Integer(1);
	len++;
	break;
}
if(name.compareTo(dic[0]) < 0)
{
	for(int k=len-1; k>=0 ; k--)
	{
		dic[k+1] = new String(dic[k]);
		n[k+1] = new Integer(n[k]);
	}
	dic[0] = new String(name);
	n[0] = new Integer(1);
	len++;
	break;

}
							for(int k = len-1 ; k>j ; k--)
							{
							//System.out.println("dic["+ (k+1) +"]="+dic[k+1]);
								dic[k+1] = new String(dic[k]);

								n[k+1] = new Integer(n[k]) ;

//System.out.println("dic["+ (k+1) +"]="+dic[k+1]);

							}
							dic[j+1] = new String(name);
							n[j+1] = new Integer(1);
							len++;	
							break;
					}
					
				}
			
			}
			
		}
					for(int x=0;x<len;x++)
					{
						System.out.println(dic[x]+" "+n[x]);
					}			
	}
}