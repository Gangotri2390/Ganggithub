package inheritance;

public class Garbage {
	Garbage () {
		System.out.println("I am Creator");
	}
	protected void finalize() {
		System.out.println("I am distroy");
	}
	public static void main(String args[]) {
		Garbage G=new Garbage();
		
		Garbage G1=new Garbage();
		Garbage G2=new Garbage();		
		Garbage G3=new Garbage();	
		System.gc();
	G=null;
	G1=G2;
//	G1.finalize();
	 new Garbage();
	
//		System.gc();
	}

//	{
//	System.out.println("Hello");	
//	}
//	protected void finalize()  
//    {
//		System.out.println("Object is garbage collected");
//	}
//
//	public static void main(String[] args) {
//	Garbage S1=new Garbage(); 
//	S1.demo();    
//	S1.finalize();
////		S1=null;   
//    S1.demo();
//		System.gc(); 
//       S1.demo();
//	
//		
//		
//
//	}

}
