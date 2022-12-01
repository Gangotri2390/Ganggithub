package com.prac;

public class Runner {
public static void main(String[] args) {
	String []str;
	Execute et=new Execute();
	et.Set("Gangotri@2390", "G@3n568");
	str=et.get();
	for(String st:str) {
		System.out.println(st);
	}
	
}
}

