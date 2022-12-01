package mapping;

import java.util.*;

public class Hashmapping {
	public Map creatmap() {
		
		Map <Integer,String>map =new HashMap<>();
		map.put(101, "Jobbers");
		map.put(102, "Cafe");
		map.put(101, "Pune");
		map.put(107, "Bug");
		map.put(105, "Hunters");
		map.put(106, "Group b");
		return map;
	}
	public Map<Integer,String> createmap1() {
		Map <Integer,String>map=new LinkedHashMap<>();
		map.put(11,"Jobbers");
		map.put(16,"Cafe");
		map.put(18,"Pune");
		map.put(12,"Batch");
		map.put(50,"Jobbers");
		map.put(null, null);
		return map;
	}
	public Map<Integer,String> createmap2() {
		Map <Integer,String>map=new TreeMap<>();
		map.put(11,"Jobbers");
		map.put(15,"Cafe");
		map.put(18,"Pune");
		map.put(12,"Batch");
		map.put(56,"Jobbers");
		map.put(50, null);
		return map;
	}
	public void print (Map map) {
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
	}
		public void printfor(Map<Integer,String>map) {
			for(Map.Entry<Integer, String> entry1:map.entrySet()) {
				System.out.println(entry1.getValue()+"*"+entry1.getKey());
//				return map;
			}
		}
		
	}
		
		
		
		
		
	


