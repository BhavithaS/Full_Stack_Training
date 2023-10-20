package exampleHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AddScores {
	
	public void addScores(Map<String, List<Integer>> m, String s, int i ) {
		if(!m.containsKey(s)) {
			m.put(s, new ArrayList<Integer>(Arrays.asList(i)));
		}else {
			List<Integer> list = m.get(s);
			list.add(i);
			m.put(s, list);
		}
		
	}
	

}