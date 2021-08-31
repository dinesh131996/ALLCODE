package org.progrmsjava;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repition {
public static void main(String[] args) {
	String s="for the people by the people to the people";
	String[] split = s.split(" ");
	Map<String,Integer> m = new LinkedHashMap<String,Integer>();
	for(String word: split){
	if(m.containsKey(word)){
	Integer in = m.get(word);
	m.put(word,in+1);
	}
	else{
	m.put(word,1);
	}

}System.out.println(m);
}
}
