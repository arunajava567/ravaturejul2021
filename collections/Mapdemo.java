package com.revature.sre.day3.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {

		//key value
		
		Map<Integer,String> map=new TreeMap<Integer,String>();
		
		//Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		
	//	Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(8, "java");
		map.put(3, "oracle");
		map.put(2, "spring");
		map.put(6, "angular");
		map.put(5, "rest");
		
		System.out.println(map.get(6));
		//map.remove(5);
	//	System.out.println(map.containsKey(3));
		//System.out.println(map.containsValue("rest"));
		System.out.println(map);
		
		Set kset=map.keySet();
		System.out.println(kset);
		
		Collection val=map.values();
		System.out.println(val);
		
		Set entryset=map.entrySet();
		
		Iterator i=entryset.iterator();
		while(i.hasNext()) {
			
			Entry entry=(Entry)i.next();
			System.out.println(entry.getKey()+  "  "+entry.getValue());
			
		}
		
		
		
		
		
	}

}
