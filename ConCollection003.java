package com.anudip.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConCollection003 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new
				ConcurrentHashMap<Integer, String>();
		
		m.put(101, "Ramesh");
		m.put(102, "Anish");
		m.put(103, "Chaithu");
		
		System.out.println(m);
		
		m.putIfAbsent(104,	"Prahash");
		System.out.println(m);
		
		m.putIfAbsent(104, "Chandru");
		System.out.println(m);
		
		m.remove(101);
		System.out.println(m);
		
		m.putIfAbsent(101, "Ramesh");
		System.out.println(m);
		
		m.replace(101, "Ramesh", "Mahesh");
		System.out.println(m);
		
		m.replace(102, "Chandru");
		System.out.println(m);
		
		
	}

}
