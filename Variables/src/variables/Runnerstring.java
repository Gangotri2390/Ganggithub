package variables;

public class Runnerstring {

	public static void main(String[] args) {
		String string="GangnaG";
		String rev="";
		char te;
		for(int i=string.length()-1;i>=0;i--) {
			te=string.charAt(i);
			rev=rev+te;
			
			
		}
		if(string.equals(rev)) {
			System.out.println(string+ " number  palindrome ");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
		
	}
}