package variables;

public class Variablepractice {
	 public double pi;
//	private double test;

	public static void main(String[] args) {
		double d;
		d=3.14;
		System.out.println(d);
		Variablepractice ger=new Variablepractice();
		ger.test();
		Variablepractice ger1=new Variablepractice();
		Demotest dr=new Demotest();
		dr.test=25.25;
		Demotest dr1=new Demotest();
		dr1.test=65.65;
		System.out.println(dr.test);
		System.out.println(dr1.test);
		
		System.out.println("*************************************************");
		
//		System.out.print(d);
		ger.add(3.14);
//		ger.add(3.14);
		System.out.println(ger.pi);
		System.out.println("___________________________________-");
		

	}
	public void test() {
		double pi=3.14;
		System.out.println("local");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println(pi);
		System.out.println(this.pi);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		
	}
	public void add(double d) {
		System.out.println(d+d);
		
	}

}
