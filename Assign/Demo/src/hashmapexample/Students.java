package hashmapexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
	public static void addScore(Map<String,List<Map<Integer,Integer>>> map,int id, int score, String name){
		if(!map.containsKey(name)) {
			List<Map<Integer, Integer>> list = new ArrayList<>();
			HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
			h.put(id, score);
			list.add(h);
			map.put(name,list);
			
		}else {
			List<Map<Integer, Integer>> list = map.get(name);
			HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
			h.put(id, score);
			list.add(h);
			map.put(name,list);
			
		}
	}
	
	public static void getScore(Map<String,List<Map<Integer,Integer>>> map,String name,int id) {
		if(map.get(name).size() > 1 ) {
			System.out.println("There are "+map.get(name).size()+ " students with same name");
			
			List<Map<Integer,Integer>> list = map.get(name);
			for(Map<Integer,Integer> map2 : list) {
			for(Map.Entry<Integer, Integer> map3 : map2.entrySet()) {
				if(map3.getKey() == id) {
					System.out.println("The score of " + name + " with id " + id + " is : "+map3.getValue());
				}else {
					System.out.println("Incorrect details");
				}
			}
			}
		}else {
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			hashMap.putAll(map.get(name).get(0));
			System.out.println(hashMap);
			System.out.println("The score of "+ name+" is : "+ hashMap.get(id));
		}
		
		
	}
	
	public static void main(String[] args){
		Map<String,List<Map<Integer,Integer>>> map = new HashMap<>();
		addScore(map,1,25,"Alice");
		addScore(map, 5, 95, "Alice"); // duplicate
		addScore(map, 10, 75, "Ravi");
		addScore(map, 15, 56, "Bob");
		addScore(map, 7, 89, "David");
		addScore(map, 2, 91, "Ravi");  // duplicate
		
		System.out.println(map);
		
//		getScore(map, "Ravi",10);
		
//		getScore(map, "Alice",5);
		
		
		
		
	}

}
