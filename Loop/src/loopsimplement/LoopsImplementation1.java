package loopsimplement;

public class LoopsImplementation1{
public static void main(String[] args) {
	
	int number[]=new int[50];
	int count=1;
	for(int i=0;i<number.length;i++) {
		number[i]=count;
		System.out.println(number[i]);
		count++;
	}
	int x=1; int y=50;
	System.out.println("Print Even numbers:");
	for(x=1;x<=y;x++) {
		if(x%2==0)
			System.out.println(" " +x);
	}
	System.out.println("Print Odd numbers:");
	for(x=1;x<=y;x++) {
		if(x%2!=0) {
			System.out.println(" "+x);
		}
	}
}
}







//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//        int a= 0,b = 1,range = 20,sum=0;
//		
//		System.out.println("Febonasis Series : ");
//		System.out.print(a+ " " +b);
//		
//		 for(int i =0;i<=range;i++) {
//			
//			sum = a + b;
//			a = b;
//			b = sum;
//			System.out.print(" "+ sum);
//			
//		 }
//	}
//}


