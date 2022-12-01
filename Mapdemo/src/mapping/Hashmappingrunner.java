package mapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmappingrunner {

	public static void main(String[] args) {
		float array[][] = {{10f,20f,45f,58f}};
		System.out.println(array);
		System.out.println("___________________________________________");
		int array1[][] = {{10,20,45,58}};
		System.out.println(array1);
		System.out.println("Array***************************************************");
		long array2[] []= {{15,48,47}};
		System.out.println(array2);
		Hashmapping dm=new Hashmapping();
		Map <Integer,String>map =new TreeMap();
		map=dm.creatmap();
		System.out.println(map);
		dm.printfor(map);
		System.out.println("****************************");
		Map <Integer,String>map1 =new TreeMap();
		map1=dm.createmap1();
		System.out.println(map1);
		dm.printfor(map1);
		System.out.println("****************************************");
		try{Map <Integer,String>map2 =new HashMap();
		map2=dm.createmap2();
//		dm.print(map);
//		dm.print(map1);
	dm.printfor(map2);
		}catch(Exception e) {
			System.out.println("Tree map");
			
		
		
		

		}

	}
}


