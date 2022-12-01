package polymorphism.overloading;

public  class MethodOverloading {
	int a, b;
	float c, d;

	 public  MethodOverloading() {
		a = 1;
		b = 2;
		c = 1.1f;
		d = 1.2f;
	}

	public MethodOverloading(int a) {
		this.a = a;
	}

	public MethodOverloading(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public MethodOverloading(float a, float b) {
		c = a;
		d = b;
	}

	public void add() {
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
	}

	public  void add (int a) {
		System.out.println("Addition is :" + (a + a));
		
	}

	public void add(int a, int b) {
		System.out.println("Addition is :" + (a + b));
	}

	public void add(float a) {
		System.out.println("Addition is :" + (a + a));
	}

	public void add(float a, float b) {
		System.out.println("Addition is :" + (a + b));
	}

	public void add(int a, float b) {
		System.out.println("Addition is :" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("Addition is :" + (a + b));
	}

}
