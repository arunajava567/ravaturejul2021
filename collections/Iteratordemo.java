package com.revature.sre.day3.collections;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Iteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> l1=Arrays.asList(2,3,4,5);
		
		
		Vector v=new Vector();
		v.add(23);
		v.add(56);
		v.add(89);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Iterator i=l1.iterator();
		while(i.hasNext()) {
			if ((Integer)i.next()==4) {
				i.remove();
				}
			System.out.println(i.next());
			
		}
		
		/*ListIterator li=l1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}*/
		
		
	}

}
