package Runnersaccessmodifier;

//import acessdemo.Acess;

public class runnersaccessmodifier {
public void print() {
	System.out.println("Hello");
}
static void display() {
	System.out.println("Static");
	runnersaccessmodifier dg1=new runnersaccessmodifier() ;
	dg1.print();
	
	
	
}
public void test() {
	System.out.println("Non static");
	print();
}







	public static void main(String[] args) {
	
		runnersaccessmodifier dg=new runnersaccessmodifier() ;
		dg.print();dg.test();
		display();
			
		}
		
		
		
		
		
	}
		

