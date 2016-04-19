class Array8  //intersection
{


   void intersection(int x[],int y[])
{int z[];

   for(int i=0;i<x.length-1;i++)
{ 

   for(int j=0;j<y.length-1;j++)
{  
   if(x[i]==y[j])
   z[i]=x[i];
System.out.println(z[i]);
}
}

//for(int i=0;i<z.length;i++)
//{System.out.println(z[i]);
//}

}
public static void main(String... s)


{Array8 d =new Array8();
d.intersection(new int []{1,2,3,4,33,2,5},new int []{3,6,8,4,2});
}

}
