package polymorphism.overloading;

public class Varagrgs {
	public void add(long... a) {
		for (long b : a)
			System.out.println(+b);
	}

	public void add(float c, long... a) {
		System.out.println(+c);
		for (long b : a)
			System.out.println(+b);
	}
}
