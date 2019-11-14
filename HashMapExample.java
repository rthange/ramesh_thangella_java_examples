package com.thangella.programs;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapExample {
	
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "one");
		map.put(2, "Two");		
		map.put(4, "Four");
		map.put(3, "Three");
		
		System.out.println("Iterating Map with for erach loop");
		for(Map.Entry<Integer, String> entry : map.entrySet()){			
			System.out.println( entry.getKey() +" :" + entry.getValue());
		}
	
		System.out.println("Iterating Map with for erach loop");
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();		
		while(iterator.hasNext()){
			Map.Entry<Integer, String> entry = iterator.next();			
			System.out.println( entry.getKey() +" :" + entry.getValue());
		}
		
		System.out.println("Iterating Map Lamda Expressions");			
		map.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		
		System.out.println("Iterating Map Stream");		
		map.entrySet().stream()
		.forEach(e -> System.out.println( e.getKey() +" : " + e.getValue()));
	}
}
