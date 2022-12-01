package abstractionexample;

public  class Complete extends Incomplete{

	

	@Override
	public void screen() {
	System.out.println("I am concreate method");
		
	}

	@Override
	public void test() {
		System.out.println(" I am second abstarct");
		
	}

}
