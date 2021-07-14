package com.revature.sre.day3.collections;

import java.util.Comparator;
										//treeset
public class Titlecomparator  implements Comparator{
	
	public int compare(Object  o1,Object o2) {
		Project p1=(Project)o1;
		Project p2=(Project)o2;
		
		return (p2.title).compareTo(p1.title);
			
	}

}
