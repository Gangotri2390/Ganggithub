package runner;

import polymorphism.overloading.MethodOverloading;

public class Overloadingrunner {

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading(10,1.2f);
	
	  mo.add();
		mo.add(10.5f);
		mo.add(10);
		mo.add(10.5f, 10.5f);
		mo.add(10.5f, 10);
		mo.add(10, 10.5f);
		mo.add(10, 10);

	}

}
