package ifblock;

public class Nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=70;
		int b=10;
		if(a<=b) {
			System.out.println(a+"less then" +b);
		}if (true) {
			System.out.println("Everthing passed");
		}if(a==b) {
			System.out.println( a+"Equal" +b);
		}else {
			System.out.println(a+"Not Equal"+b);
		}

	}

}
