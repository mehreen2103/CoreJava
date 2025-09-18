package in.com.rays.Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("One", 1);
		m.put("Two", 2);
		m.put("Three", 3);
		m.put("Four", 4);
		m.put("Five", 5);
		m.put("Six", 6);
		m.put("Six", 6);
		m.put(null, 7);
		m.put(null, 7);
		
		System.out.println("M: "+ m);
		
		//Return the value associated with key.
		System.out.println(m.get("Four"));
		
		//Checks Membership of key.
		System.out.println(m.containsKey("Two"));
		
		//Return the value associated with key
		System.out.println(m.containsValue(6));
		
		//Set of key pairs.
		System.out.println(m.entrySet());
		
		//Returns set of keys.
		System.out.println(m.keySet());
		
		//Returns the list of values.
		System.out.println(m.values());
		
		//Returns size of map.
		System.out.println(m.size());
		
		
		
		
		
		
	}

}
