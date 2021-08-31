package com.java.scanner1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class ReplaceAnGivenArray {
	public static void array1() {

		System.out.println("Task 3-Replace the Value");
		java.util.List<Integer> m = new ArrayList<Integer>();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(90);
		m.add(10);
		m.add(10);
		
		for (int i = 0; i <m.size(); i++) {
			System.out.println(m.get(i));
		}

		System.out.println("Input:" + m);
		m.set(0, 100);
		m.set(4, 100);
		m.set(5, 100);
		System.out.println("Output" + m);
		System.out.println();

		System.out.println("Task 4-Given array size");
		int[] a = { 11, 12, 13, 14, 15, 16 };
		System.out.println("size is:" + a.length);
		System.out.println();

		System.out.println("Task 5- Iterate on array");
		int b[] = { 11, 12, 13, 14, 15, 16 };
		for (int i : b) {
			System.out.println(i);
		}
		System.out.println();

		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Task 6- Iterate on List");
		List<Integer> k = new ArrayList<Integer>();
		k.add(11);
		k.add(12);
		k.add(13);
		k.add(14);
		k.add(15);
		k.add(16);

		for (Integer integer : k) {
			System.out.println(integer);
		}
		System.out.println();

		System.out.println("Task 1- Find the dupliate count in List");
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(90);
		l.add(40);
		l.add(10);
		l.add(20);
		l.add(90);

		Set<Integer> lk = new HashSet<Integer>();
		lk.add(10);
		lk.add(20);
		lk.add(90);
		lk.add(40);
		lk.add(10);
		lk.add(20);
		lk.add(90);
		System.out.println("Duplicate values: " + (l.size() - lk.size()));
		System.out.println();

		System.out.println("Task 2");
		Scanner scan = new Scanner(System.in);
		List<Object> kk = new ArrayList<Object>();
		kk.add("Employee ID:" + scan.nextInt());
		scan.next();
		kk.add("Employee NAME:" + scan.next());
		kk.add("Employee ADDRESS:" + scan.nextLine());
		kk.add("Employee DOB:" + scan.next());
		kk.add("Employee DOJ:" + scan.next());
		kk.add("Employee EMAIL:" + scan.next());
		kk.add("Employee GENDER:" + scan.next());
		kk.add("Employee SALARY:" + scan.nextInt()); // scan.nextFloat();
		kk.add("Employee PHONE:" + scan.nextLong());
		for (Object object : kk) {
			System.out.println(object);
		}
		System.out.println();

		System.out.println("Task 1- In map");
		Map<Integer, String> oo = new HashMap<Integer, String>();
		oo.put(101, "siva");
		oo.put(102, "arjun");
		oo.put(103, "raja");
		Set<Entry<Integer, String>> entrySet2 = oo.entrySet();
		System.out.println(entrySet2);

		System.out.println();
		System.out.println("Task 2- In map");
		Map<Integer, Integer> pp = new Hashtable<Integer, Integer>();
		pp.put(101, 404);
		pp.put(102, 405);
		pp.put(103, 406);
		pp.put(104, 407);
		pp.put(105, 408);
		Set<Entry<Integer, Integer>> entrySet = pp.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

	public static void main(String[] args) {
		array1();

	}
}
