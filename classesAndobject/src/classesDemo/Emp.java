package classesDemo;

public class Emp {
	int id;
	String name;
	int sal;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	void insert(int i,String n,int s) {
		id=i;
		name=n;
		sal=s;
	}
	void print() {
		System.out.println("id:  " + id + "\t name:   " + name + "\t sal:   " + sal);
	}
	int inc(int sal) {
		sal=sal*10;
		return sal;
	}
}