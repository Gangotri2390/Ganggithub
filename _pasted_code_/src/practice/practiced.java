package practice;

public class practiced {

	//System.out.println("Main method started");    this is not allowed it will give compile time error
	public static void main(String[] args) {
		
		
		
		System.out.println("Main method started");
       
		int a=10;
		int b=20;
	
		
		if (a<=b && a<=b) {
			
			System.out.println("equal");
			
			
			
		}
	
		//&& operator example
		String DbusName="Aksha";
		String Dbpass="Ak123";
		
		if((DbusName=="Akshay")&&(Dbpass=="Ak123"))
		{
		System.out.println("Login succusfully");	
		}
		else 
		{
		System.out.println("UserName or pass is wrong");	
		}
//		
		
		//OR operator example
		String DbusName1="Aksha";
		String Dbpass2="Ak123";
		long mobNo=8948393424l;
		
		if( ((DbusName1=="Akshay")||(mobNo==8948393424l)) && (Dbpass2=="Ak123"))
		{
//			if((Dbpass2=="Ak123")) 
//			{
//				System.out.println("Login succusfully");
//			}
//			
			System.out.println("Login succusfully");
		}
		else 
		{
		System.out.println("UserName or pass is wrong");	
		}
		
		
		//NOT Operator example
		if( ((DbusName1=="Aksha")||!(mobNo==8948393424l)) && (Dbpass2=="Ak123"))
		{
		
			System.out.println("Login succusfully");
		}
		else 
		{
		System.out.println("UserName or pass is wrong");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
