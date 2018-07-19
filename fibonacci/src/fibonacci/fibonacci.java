package fibonacci;

public class fibonacci {
   public static void main(String args[])
   {
	   
           int i,c,a=0,b=1;
	   System.out.print(a+""+b);
	   
	   for(i=1;i<=10;i++)
	   {
		   c=a+b;
		   System.out.print(""+c);
		   a=b;
		   b=c;
	   }
  
	}
}
}
