package inheritance;

import Child.ChildClass;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a=10,  b=5 ,result;
		Superclass Sc=new Superclass();
		Subclass sub=new Subclass ();
		Subclass mul=new Subclass();
		result =Sc.addition(a, b);
		System.out.println( result );
		result =sub.Multiplication(a, b)	;	
		System.out.println( result );
		result=sub.Substraction(a, b);
		System.out.println( result );
		result=mul.Multiplication(a, b);
		
		System.out.println(result);
		
		}

}
