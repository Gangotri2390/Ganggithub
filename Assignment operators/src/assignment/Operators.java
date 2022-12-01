package assignment;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Addition" +a);
	
	    System.out.println("After Addition" +(a+=b));
		System.out.println("a" +a);
		System.out.println("b" +b);
		System.out.println("After SUB" +(a-=b));
		System.out.println("a" +a);
		System.out.println("b" +b); 
		System.out.println("After MUL" +(a*=b));
		System.out.println("a" +a);
		System.out.println("b" +b);
		System.out.println("After DIV" +(a/=b));
		System.out.println("a" +a);
		System.out.println("b" +b);
		System.out.println("After Mode" +(a%=b));
		System.out.println("a" +a);
		System.out.println("b" +b);
	
	}

}
