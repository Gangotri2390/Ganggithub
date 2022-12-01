package inheritance;

public class Inheritancsconcept {
	public void m1() {
		System.out.println("Parent");
	}
}
	
class Sample extends  Inheritancsconcept{
	public void m2() {
		System.out.println("Child");
	}
}
class c extends Sample{
	public void m3() {
		System.out.println("Sample multilevel");
	}
}
class distroy extends Inheritancsconcept{
	public void m4() {
		System.out.println("Bidirectional");
	}
}

