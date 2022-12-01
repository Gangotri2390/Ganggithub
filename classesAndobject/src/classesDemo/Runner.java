package classesDemo;

public class Runner {

	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40;
	//
Runner run=new Runner() ;{
	run.test();
	System.out.println("Run Test End");
	int result=run.add(a, b);
	System.out.println(result);
	result=run.sub(result ,b);
	System.out.println(result);
	run.add(102, 200);
	run.add(c, d);
	int res=run.add(a, b);
	run.print(res);
	int res1=run.add(c, d);
	run.print(res1);
	
	
	System.out.println(run.sub(c, d));
}
		
	}

	
	

public void test() {
	System.out.println("Iam in test Runner.test()");
}

public int add(int a,int b) {
	int result=a+b;
	return result;
	
}

public int sub(int a,int b) {
	return a-b;
	
}

public boolean lessThen (int a,int b) {
	boolean flag =  a<b;
return flag;
}
		

public void print (int a) {
	System.out.println(a);
}
}