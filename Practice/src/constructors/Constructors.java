package constructors;

public class Constructors {
	
String Hotel;
String menu;
String menu1;
Constructors (String Hotel,String menu,String menu1){
	this.Hotel=Hotel;
	this.menu=menu;
	this.menu1=menu1;
}

	public static void main(String[] args) {
		 Constructors s1=new Constructors("Taj"  ,"Breakfast","Brunch");
		 System.out.println(s1.Hotel+"..."+s1.menu+"   " +s1.menu1);
		 Constructors s2=new Constructors("Idli"  ,"Dosa","Uttam");	
		 System.out.println(s2.Hotel+"..."+s2.menu);
		 Constructors s3=new Constructors("Taj"  ,"Lunch","Dining");		
		 System.out.println(s3.Hotel+"..."+s3.menu);
		 Constructors s4=new Constructors("Paneer"  ,"Rice","Roti");	
		 System.out.println(s4.Hotel+"..."+s4.menu);

		
}
}