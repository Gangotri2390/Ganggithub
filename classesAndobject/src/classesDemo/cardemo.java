package classesDemo;
//Defining a class

public class cardemo {
	int wheels=5;//instance variable;define
	String str;//declare//declaration
	//return type//method name(Parameters>optional)//opening an closing brackets
	int doors=4;
	int tyre;
	int dr;
	cardemo () {
		wheels=5-1;
	}
	
	
void doors(float wheels) {
	System.out.println("car has four doors");
	if(wheels==5) {
		System.out.println("This is car");
	}else {
		System.out.println("not car");
	}
//	cardemo () {
//		System.out.println("________wheels=5.1______________________________");
//	}
	
}
void wheels(int wheels) {
	System.out.println("Car has 5 wheels");
}
void seater(float tyre ) {
	System.out.println("It has four seats");
	
}
void display(double doors) {
	System.out.println("dr*********************************************************************");
}

}
