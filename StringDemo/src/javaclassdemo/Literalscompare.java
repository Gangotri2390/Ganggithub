package javaclassdemo;

public class Literalscompare {

	public static void main(String[] args) {
		int a=20,b=10;
		a-=b;
		System.out.println(a);
		
		int  obj=10;
		long obj1=101252223L;
		float obj2=10.2356f;
		double obj3=12356489556325142d;
		Object [] obj4= {10,25,"Jobbers",16.28,8475l};
		String str2="10";
		
		int i=Integer.parseInt(str2);
		System.out.println(str2);
String str="Hello worls";
print_data(str);
		
		print(obj4);
		print_data(obj);
		print_data(obj1);
		print_data(obj2);
		print_data(obj3);
	
		
		
		
//		System.out.println(obj);
//		System.out.println(obj1);	
//		System.out.println(obj2);	
//		System.out.println(obj3);
	}
		public static void print (Object[] obj4) {
			for(Object obj5:obj4) {
			System.out.print( obj5 );
//		System.out.println(obj4);
		}
		}
			public static   void print_data(Object obj) {
System.out.println(obj);
			}
			
		
		
		
		
		
		
		
		
	}
