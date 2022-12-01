package javaclassdemo;

public class Indexof {

	public static void main(String[] args) {
		String str="Java gatfr gaytr gafrds";
		String str1="Java";
//		str.indexOf('a');
		System.out.println(str.indexOf('e'));
//		System.out.println(str.i);
		System.out.println(str.indexOf("e",str.indexOf("p")));
//		System.out.println(str.substring( 0,6));
		System.out.println(str.startsWith("pune",13));
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.lastIndexOf("e", 8));
//		Substring from8th location
//	str.contains("Jobbers");
		if(str.contains(str1)) {
			System.out.println(str+"we found");
		}
		else {
			System.out.println("We didnt found"+str);
		}
	System.out.println(str1.compareTo(str1));
	System.out.println(str1.compareTo(str));
	if(0>str.compareTo(str1)){
		System.out.println(str);
		
	}
	else if(0<str.compareTo(str1)) {
		System.out.println("small "+str);
	}
	else if(0==str.compareTo(str1)){
		System.out.println("equal"+str);
		
	}

	}

}
