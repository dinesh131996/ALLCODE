package org.progrmsjava;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Listt {
public static void main(String[] args) {
	//add
	
	java.util.List<String> list = new ArrayList<String>();
	list.add("Dinesh");
	list.add("Vignesh");
	System.out.println(list);
	java.util.List<String> list1 = new LinkedList<String>();
	list1.add("hacking");
	list1.add("jakie");

	//addAll
	list.addAll(list1);
	System.out.println("1"+list);
	
	//add using index based
	list.add(0, "happy");
	System.out.println("add in zeroth index"+list);
	
	//addAll using index based
	list.addAll(0, list1);
	System.out.println("2"+list);
	
	//contains in other list or same list
	System.out.println("3"+list.contains("happy"));
	
	//containsAll in other list or same list
	System.out.println("4"+list.containsAll(list1));
	
	int indexOf = list.indexOf("hacking");
	System.out.println("5"+indexOf);
	
	int hashCode = list.hashCode();
	System.out.println("6"+hashCode);
	
	//clear
		list.clear();
		System.out.println("7"+list);
}
}
