package mapping;

import java.util.*;
import java.util.Map.Entry;

public class Hashmapdemo {

	public Map<Integer,String> createmap() {
		Map <Integer,String>map=new HashMap<>();
		map.put(11,"Jobbers");
		map.put(15,"Cafe");
		map.put(18,"Pune");
		map.put(12,"Batch");
		map.put(50,"Jobbers");
		map.put(null, null);
		return map;
	}
	public Map<Integer,String> createmap1() {
	Map <Integer,String>map=new LinkedHashMap<>();
	map.put(11,"Jobbers");
	map.put(15,"Cafe");
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
		map.put(50,"Jobbers");
	map.put(null, null);
		return map;
		}
	public void print(Map<Integer,String> map) {
		for(Map.Entry<Integer, String> entry1:map.entrySet())
//		Set set =map.entrySet();
//		Iterator itr=set.iterator();
//		while(itr.hasNext()) {
//			Map.Entry entry=(Entry) itr.next();
		System.out.println(entry1);
		}
	}


