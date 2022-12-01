package variables;

public class Varibles {
	public int maths;
	public static int science=50;
	public static void main(String[]args) {
		int TotalMarks;
		Varibles v1=new Varibles();
		TotalMarks= v1.Marks(25,58,98)+science;
		System.out.println("Marks of Student1:"+TotalMarks);

}
	public int Marks(int Hindi,int Marathi,int English) {
		int Total=Hindi+Marathi+English;
		return Total;
	}
}
