package com.anudip.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConCollection002 extends Thread {
	static CopyOnWriteArrayList  l = new CopyOnWriteArrayList();
	
	public void run() {
		try {
			Thread.sleep(500);		
		}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		
		l.add("d");
		
				
	}
	
	public static void main(String[] args) {
		l.add("a");
		l.add("b");
		l.add("c");
		
		ConCollection002 t = new ConCollection002();
		t.start();
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println(l);
	}
}
