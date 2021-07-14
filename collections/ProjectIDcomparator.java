package com.revature.sre.day3.collections;

import java.util.Comparator;
										//treeset
public class ProjectIDcomparator  implements Comparator{
	
	public int compare(Object  o1,Object o2) {
		Project p1=(Project)o1;
		Project p2=(Project)o2;
		
		if(p1.id>p2.id)
			return +1;
		else if (p1.id<p2.id)
			  return -1;
		else 
			return 0;
	}

}
