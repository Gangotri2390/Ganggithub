package classesDemo;

public class car {
	
     String name= "tata";
     
     
     int wheels=5;
     car(){
    	 wheels =5-1;
    	
     }
     car(boolean a){
    	 wheels=5;
    	 System.out.println(a);
     }
     void doors(double wheels ) {
    	 if (wheels==5) {
    	 System.out.println("Wheels has four 4"  );
     }else {
    	 System.out.println("Car is invalid");
    	 System.out.println();
     }
	

     }
}


