package inheritance;

public class Finally {

	public static void main(String[] args) {
try
		{
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);

		}

	catch(  Exception e  ) 
	{		System.out.println("Exeption :" );
}
      finally       
		{
			System.out.println("I am finally Block");
//			try
//			{
		int a=100,b=0,c;
				c=a/b;
		System.out.println(c);
	
//			}
//
//		catch(  Exception e  ) 
//		{
//			System.out.println("Exeption :" );
//		}
		}
//	finally       
//	{
//		System.out.println("I am finally Block");
//	}

		
		

	}

}
