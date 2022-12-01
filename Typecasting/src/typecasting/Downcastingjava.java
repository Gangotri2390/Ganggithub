package typecasting;

public class Downcastingjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double d=15.104512478;
int a1=123;
System.out.println("Double" +d);
float f=(float)d;
System.out.println("Float" +f);
byte b=(byte)d;
System.out.println("byte"+b);
float f1=14.1245f;
int a=(int)f1;
System.out.println("int"+a);
float add=(float) (a1/f1);
System.out.println("Div" +add);
	}

}
