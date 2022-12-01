package Runnersaccessmodifier;

public class combinations {
	public static void main(String[] args) {
		
	
	int s = 3, a = 1, b=3;
	
	for (int i = 1; i <= s; i++) {

		for (int j = s; j > i; j--) {

			System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {

			System.out.print(" "+a);
			a++;
		}

		System.out.println();
	}

	for (int i = 1; i <= s; i++) {

		for (int j = s; j > i; j--) {

			System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {

			System.out.print(" "+a);
			a++;
		}

		System.out.println();
	}
}
}
//	public static  combinations dr=new combinations();
//	private   int a=10;
//	
//	public  void main() {
//		combinations dr=new combinations();
//		int a=3;
//		System.out.println("Hello ");
//		while(dr.a!=0) {
//			dr.a--;
//			System.out.println("fr");
//		}
////		System.out.println("fr");
//			
//	}
//	final static void display() {
//		System.out.println("gangotri");
//	}
//	private static void ger() {
//		System.out.println("hello return");
//	}
//	void fin() {
//		System.out.println("free");
//	}
//	static void inte() {
//		System.out.println("gtr");
//	}
//	public static final void ret() {
//		
//	}
//	
//		public static void main(String[] args) {
//		dr.main();
//			display();
//			ger();
//		combinations dr=new combinations();
//			
////			dr.fin();
//			inte();
//
//			
//		}
//
//	}
//
//
