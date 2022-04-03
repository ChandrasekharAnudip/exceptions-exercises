package com.anudip.concurrent;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConCollection004 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new
				ConcurrentHashMap<Integer, String>();
		
		m.put(101, "Ramesh");
		m.put(102, "Anish");
		m.put(103, "Chaithu");
		m.put(104, "Divya");
		m.put(105, "Prahash");
		m.put(106, "Mahesh");
		
		System.out.println(m);
		
		ConcurrentHashMap<Integer, String> dup_m = new
				ConcurrentHashMap<Integer, String>();
		dup_m.putAll(m);
		
		System.out.println("Duplicated Hash Map: " + dup_m);
		
		System.out.println("The employee name at 104: " + m.get(104));
		
		System.out.println("Dispaly only values\n\n");
		
		Iterator<ConcurrentHashMap.Entry<Integer, String> > itr 
			= m.entrySet().iterator();
		
		while(itr.hasNext()) {
			ConcurrentHashMap.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getValue());
		}
		
		System.out.println("Dispaly only keys\n\n");
		
		itr = m.entrySet().iterator();
		
		while(itr.hasNext()) {
			ConcurrentHashMap.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey());
		}
		
		System.out.println("Dispaly both keys and values\n\n");
		
		itr = m.entrySet().iterator();
		
		while(itr.hasNext()) {
			ConcurrentHashMap.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		

	}

}
