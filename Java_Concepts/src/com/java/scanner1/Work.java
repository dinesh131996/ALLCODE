package com.java.scanner1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;



import com.java.classbelownewclass.ClassBelowNewClass.Employee;

class Varags{
	public static void add(int...a) {
		System.out.println("no of arguments"+a.length);
		
		for (int i : a) {
			System.out.println(i);
			
			
		}System.out.println();
	}
	public static void main(String[] args) {
		add(1,2,3,4);
		add(45);
		add(356698555);
		add(1245642,2256523,256689);
	}
}
	

public class Work {
	private int number;
	private String name;
	private char bloodGroup;

	public int getnumber() {
		// TODO Auto-generated method stub
		return number;
	}

	public void getnumber(int a) {
		number = a;
	}

	public static void main(String[] args) {
		Love l = new Love();
		l.cake();
		Work k = new Work();
		k.getnumber(98427714);
		System.out.println(k.number);

	}
}
/*
 * Queue<Integer> l = new PriorityBlockingQueue<Integer>(); l.add(3263);
 * l.add(20); l.add(10); l.add(3263); System.out.println(l);
 */

/*
 * String s= "welcome t to the java";
 * 
 * String[] split =s.split("", s.length()); String u = ""; //String replace =
 * s.replace('t', 'u'); //System.out.println(replace); for (int i =0; i <
 * split.length; i++) { if (condition) {
 * 
 * } }
 * 
 */

/*
 * Integer[]c= {10,20,30,40}; System.out.println(c[3]);
 * 
 * String[]m = {"f","df","dssd"}; System.out.println(c[2]);
 * 
 * Short[]n= {10,20,30}; System.out.println(n[0]);
 * 
 * int []a= {10,10,30,40,50,10};
 * 
 * for (int i = 0; i < a.length-1; i++) { System.out.println();
 * 
 * }
 * 
 * int [][]b = {{2,5,3,5,6,5,8},{2,9,5,4,6,7}}; for (int i = 0; i <=1; i++) {
 * for (int j = 0; j <=6; j++) { System.out.print(b[i][j]+" "); }
 * System.out.println(); }
 */
/*
 * Scanner scan = new Scanner(System.in); List<Object> kk = new
 * ArrayList<Object>(); kk.add("Employee ID:" + scan.nextInt());
 * kk.add("Employee SALARY:" + scan.nextInt());
 * 
 * kk.add("Employee PHONE:" + scan.nextLong()); scan.next();
 * kk.add("Employee NAME:" + scan.next()); kk.add("Employee ADDRESS:" +
 * scan.nextLine()); kk.add("Employee DOB:" + scan.next());
 * kk.add("Employee DOJ:" + scan.next()); kk.add("Employee EMAIL:" +
 * scan.next()); kk.add("Employee GENDER:" + scan.next());
 * kk.add("Employee PHONE:" + scan.nextLong()); kk.add("Employee PHONE:" +
 * scan.nextLong()); for (Object object : kk) { System.out.println(object); }
 */
class CollectArrayList {
	public static void sample() {
		List<Object> obj = new ArrayList<Object>();
		obj.add(123);
		obj.add(253);
		obj.add(2, "hike");
		obj.add(123);
		System.out.println(obj.get(1));
		System.out.println(obj);
		
	}

	public static void main(String[] args) {
		sample();
	}

}

class CollectLinkedList {
	public static void sample1() {
		List<Object> obj = new LinkedList<Object>();
		obj.add("hello");
		obj.add("world");
		obj.add("i am");
		obj.add("Dinesh");
		obj.add("Dinesh");
		System.out.println(obj.get(3));
		
		System.out.println(obj);
	}
	public static void main(String[] args) {
		sample1();
	}
}
class CollectVectorList{
	public static void sample1() {
	List<Object> obj = new Vector<Object>();
	obj.add("hello");
	obj.add("world");
	obj.add("i am");
	obj.add("Dinesh");
	obj.add("Dinesh");
	
	System.out.println(obj);
}
public static void main(String[] args) {
	sample1();
}
	
}
class CollecthashSet{
	public static void sample1() {
	Set<Object> obj = new HashSet<Object>();
	obj.add("hello");
	obj.add("world");
	obj.add("i am");
	obj.add("Dinesh");
	obj.add("Dinesh");
	
	System.out.println(obj);
}
public static void main(String[] args) {
	sample1();
}
	
}
class CollectLinkedhashSet{
	public static void sample1() {
	Set<Object> obj = new LinkedHashSet<Object>();
	obj.add("hello");
	obj.add("world");
	obj.add("i am");
	obj.add("Dinesh");
	obj.add("Dinesh");
	obj.add(10);
	obj.add(100);
	obj.add(90);
	obj.add(52);
	obj.add(51);
	
	System.out.println(obj);
}
public static void main(String[] args) {
	sample1();
}
	
}
class CollectTreeSet{
	public static void sample1() {
	Set<Object> obj = new TreeSet<Object>();
	obj.add(10);
	obj.add(100);
	obj.add(90);
	obj.add(52);
	obj.add(51);
	//obj.add("Him");
//	obj.add('a');
	//obj.add(1.22f);
	
	System.out.println(obj);
	// only single type of object class is possible
	//different type is not possible in tree set
}
public static void main(String[] args) {
	sample1();
}
	
}
class CollectHashMap{
	public static void sample1() {
	Map<String, Integer> obj = new HashMap<String,Integer>();
	obj.put("Dinesh", 101);
	obj.put("Dinesh1", 102);
	obj.put("Dinesh2", 103);
	obj.put("Dinesh3", 104);
	obj.put("Dinesh4", 105);
	obj.put("Dinesh5", 106);
	System.out.println(obj.get(3));
	
	System.out.println(obj);
}
public static void main(String[] args) {
	sample1();
}
	
}
class CollectLinkedHashMap{
	public static void sample1() {
	Map<String, Integer> obj = new LinkedHashMap<String,Integer>();
	obj.put("Dinesh", 101);
	obj.put("Dinesh1", 102);
	obj.put("Dinesh2", 103);
	obj.put("Dinesh3", 104);
	obj.put("Dinesh4", 105);
	obj.put("Dinesh5", 106);
	System.out.println(obj.get(3));
	
	System.out.println(obj);
}
public static void main(String[] args) {
	sample1();
}
	
}
class CollectTreeMap{
	public static void sample1() {
	Map<String, Integer> obj = new TreeMap<String,Integer>();
	obj.put("Dinesh", 104);
	obj.put("Dinesh1", 102);
	obj.put("Dinesh2", 103);
	obj.put("Dinesh3", 101);
	obj.put("Dinesh4", 105);
	obj.put("Dinesh5", 107);
	System.out.println(obj.get(3));
	
	System.out.println(obj);
}
public static void main(String[] args) {
	sample1();
}
	
}
class Overloading{
	public void emploeyy(int a, int b) {
		
	}
public void emploeyy(int c, String b) {
		
	}
public void emploeyy(String a, int b) {
	
}
public void emploeyy(int c, char v) {
	
}
public void emploeyy(int a) {
	
}
}
