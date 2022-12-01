package inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Demoarraylist1 {
	
	

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("10");
		a1.add("Bug");
		a1.add("a");
		a1.add("10.25f");
		a1.add("10.25f");
		a1.add(null);
		System.out.println(a1);
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add("Bug");
		a2.add('a');
		a2.add(10.25f);
		a2.add(10.25f);
		a2.add(null);
		System.out.println(a2);	
		
		// TODO Auto-generated method stub

	}

}
