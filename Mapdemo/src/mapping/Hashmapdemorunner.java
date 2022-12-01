package mapping;

import java.util.Map;

public class Hashmapdemorunner extends Hashmapdemo {

	public static void main(String[] args) {
		Hashmapdemorunner   hm=new Hashmapdemorunner ();
		try{Map map2=hm.createmap2();
		hm.print(map2);
		
		
		}catch(Exception e) {
	
	

}
		Map map =hm.createmap();
		Map map1=hm.createmap1();
//		Map map2=hm.createmap2();
//		hm.print(map);
		System.out.println("**********************************");
        hm.print(map);
	
		System.out.println("***********************************");
	
		
		hm.print(map1);
		System.out.println("*************************************");
//		try{Map map2=hm.createmap2();
//		hm.print(map2);
//		
//		}catch(Exception e) {
		System.out.println("EXeption Catched");
		System.out.println("Methods");
		System.out.println(map);
		System.out.println(map);
//		
	

	}
//		System.out.println("EXeption Catched");
	}




