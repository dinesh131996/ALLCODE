package org.progrmsjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_char {
	public static void main(String[] args) {
		String s = "Elephant on the forest";

		String[] split = s.split("");
		
		List< String> list = new ArrayList<String>();
		for (String string : split) {
			list.add(string);
		}

		System.out.println("values inside the list: "+list);
		
		ListIterator<String> listIterator = list.listIterator();
	
		String worrr="";
		for (int i = 0; i < split.length; i++) {
				if (listIterator.hasNext()) {
				worrr+=listIterator.next();
			}
		}
		
		System.out.println("next iterator values: "+worrr);
		
		String hike="";
		for (int i = 0; i < split.length; i++) {
			if (listIterator.hasPrevious()) {
			hike+=listIterator.previous();
		}
	}
		System.out.println("prevoius of iterator: "+hike);
		Set<String> set = new LinkedHashSet<String>();

		for (String string : split) {
			set.add(string);
		}
		
		System.out.println("value in set: "+set);
		Iterator<String> iterator = set.iterator();
		String word = "";
		for (int i = 0; i < set.size(); i++) {
			if (iterator.hasNext()) {
				word += iterator.next();
			}
		}
		
		System.out.println("values after iteration: "+word);
		
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String string1 : split) {
			if (map.containsKey(string1)) {
				Integer integer = map.get(string1);
				map.put(string1, integer + 1);
			} else {
				map.put(string1, 1);
			}
		}
		
		System.out.println("values in map:"+map);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 2) {
				System.out.println(entry);
			}
		}
		
	}
}
