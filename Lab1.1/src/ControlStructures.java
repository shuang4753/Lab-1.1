//Simon Huang

public class ControlStructures 
{
	
	
	public static void main(String [] args)
	{
		fooBarBaz();
		primePrinter();
		System.out.print("finished!");
	}
		
	
		public static boolean isPrime(int number )
		{
			for(int x=2; 2+x<=number; x++)
			{
				if(number%x==0)
					{return false;}
			}
		
					{return true;}
		
		}

		
		public static void primePrinter()
		{
			int x =2;
			for (int y= 0; y <50;)
			{ 
				if (isPrime(x))
				{
					System.out.print((x+ " "));
					y++;
					if (y %5 ==0)
					{
						System.out.println();
					}
				}
				x++;
			}
		
		}
		

		public static void fooBarBaz()
		{
			for(int x=1; x<=500; x++)
			
			{	if (x%3==0) 
					System.out.print("foo");
				
				if (x%7==0)
					System.out.print("Bar");
				
				if (x%10==0)
					System.out.print("Baz");
				
				if ((x%3!=0) && (x%7!=0) && (x%10!=0))
					System.out.print(x);
					
				System.out.println();
				
			}
		}
}

