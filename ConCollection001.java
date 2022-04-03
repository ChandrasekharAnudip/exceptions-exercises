package com.anudip.concurrent;

import java.util.ArrayList;
import java.util.Iterator;

public class ConCollection001 extends Thread {

	static ArrayList l = new ArrayList();
	
	public void run() {
		try {
			Thread.sleep(2000);		
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
		
		ConCollection001 t = new ConCollection001();
		t.start();
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
