package classesDemo;

public class Emprunner {

	public static void main(String[] args) {
		int sal;
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		emp.print();
		emp.insert(101, "Jobbers", 15000);
		emp.print();
		emp.insert(102, "Gangotri" ,1500000);
		emp.print();
		emp.insert(103, "Gayatri", 1800000);
		emp.print();
//	emp.salinc (20);
		System.out.println(emp.sal);
		

	}

}
