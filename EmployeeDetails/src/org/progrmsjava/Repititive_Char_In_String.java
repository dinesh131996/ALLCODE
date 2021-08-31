package org.progrmsjava;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repititive_Char_In_String {
public static void main(String[] args) {
	String s= "Welcome";
	String[] split = s.split("");
	Map<String,Integer> m = new LinkedHashMap<String,Integer>();
for (int j = 0; j < split.length; j++) {
	if (m.containsKey(split[j])) {
	Integer integer = m.get(split[j]);
	m.put(split[j], integer+1);
}
	else {
		m.put(split[j], 1);
	}
}System.out.println(m);	
}
}
