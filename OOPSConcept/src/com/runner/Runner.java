package com.runner;

import Child.ChildClass;

public class Runner {

	public static void main(String[] args) {
		int a=18;
ChildClass ch=new ChildClass();
ChildClass.perform();

		ch.perform();
		System.out.println(ch.a);
		System.out.println(a);
		
	

	}

}
