package org.progrmsjava;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Collection_Programs_and_anagram {
	private int aa;
	
	public int getAa() {
		System.out.println(aa);
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public static void main(String[] args) {
		
		Collection_Programs_and_anagram c = new  Collection_Programs_and_anagram();
		c.setAa(2);
		c.getAa();
		
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(5);
		a.add(4);
		a.add(1);
		a.add(33);
		// Object[] hi = a.toArray();
		System.out.println(a.get(5));
		System.out.println(a.size());
		System.out.println(a);
		// System.out.println(a);
		// Collections.sort(a);
//System.out.println(a);
		/*
		 * int temp=0; for (int i = 0; i < a.size(); i++) { for (int j = i+1; j <
		 * a.size(); j++) { if (a.get(i)>a.get(j)) { temp=a.get(i);
		 * 
		 * System.out.println("Dinesh");
		 * 
		 * } } }
		 */
		Integer [] ii = new Integer[a.size()];
		a.toArray(ii);
		int temp=0;
		for (int i = 0; i < ii.length; i++) {
			for (int j = i+1; j < ii.length; j++) {
				if (ii[i]>ii[j]) {
					temp=ii[i];
					ii[i]=ii[j];
					ii[j]=temp;
				}
			}
		}
for (int i = 0; i < ii.length; i++) {
	System.out.println(ii[i]);
}
	}
}

class kinnnng {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("hii");
		a.add("hello");
		a.add("jii");
		a.add("king");
		a.add("zin");
		a.add("ri");

		for (String string : a) {

			System.out.println(string.charAt(0));
		}
		/*
		 * for (int i = 0; i < 6; i++) { System.out.println();
		 * //System.out.println(array[i].charAt(i)); }
		 */
	}
}
class Dinu{
	public static void main(String[] args) {
		String g = "Dinesh";
		String k="hinsde";
		
		String s = g.toLowerCase();
		String f = k.toLowerCase();
		
		
		
		/*
		 * String s = "Dinesh"; String f="dinesh";
		 */
		
		String[] split = s.split("");
		Map<String, Integer> m = new LinkedHashMap<String,Integer>();
		for (String string : split) {
			if (m.containsKey(string)) {
				Integer integer = m.get(string);
				m.put(string, integer+1);
			}
			else {
				m.put(string, 1);
			}
		}
		System.out.println(m);
		
		String[] split2 = f.split("");
		Map<String, Integer> v = new LinkedHashMap<String,Integer>();
		for (String string1 : split2) {
			if (v.containsKey(string1)) {
				Integer integer = v.get(string1);
				v.put(string1, integer+1);
			}
			else {
				v.put(string1, 1);
			}
		}
		System.out.println(v);
		
		if (m.containsKey(v)) {
			System.out.println("anagram");
		}
		
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		Set<Entry<String,Integer>> entrySet2 = v.entrySet();
		
		if(entrySet.equals(entrySet2)) {
			System.out.println("anagram");
		}
		}
	}

class loo{
	public static void main(String[] args) {
		String s="on the Wall";
		String rev="";
		for (int i = 0; i < args.length; i++) {
			if (s.charAt(i)>'a'&& s.charAt(i)<'z') {
				
			}else {
				rev=rev+s.charAt(i);
			}
		}
		System.out.println(rev);
		//Set<String> set = new LinkedHashSet<String>();
		
	}
	
	
}