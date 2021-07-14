package com.revature.sre.day3.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

class Project1{
	Integer id;
	String title;
	public Project1(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + "]";
	}
	
}
//Collecton
public class SetDemo {
	
	
	public static void main(String[] args) {
		
		   Set<Integer> intList=new TreeSet<Integer>(); //generics
			
	 //   Set<Integer> intList=new LinkedHashSet<Integer>(); //generics
		
	//    Set<Integer> intList=new HashSet<Integer>(); //generics
		//set is unique set of element, will not throw exception
	    //will not be ordered
		intList.add(23);
		intList.add(56);
		intList.add(3);
		intList.add(86);
		intList.add(93);
		intList.add(12);
		System.out.println(intList);
		System.out.println(intList.contains(86));
	//	System.out.println(intList.remove(23));
		System.out.println(intList.isEmpty());
		//intList.clear();
		
		Iterator i=intList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set<Project> plist=new TreeSet<Project>(new Titlecomparator());
	//	List<Project> plist=new ArrayList<Project>();
		plist.add(new Project(131,"LMS"));
		plist.add(new Project(142,"AMEX"));
		plist.add(new Project(127,"ITIS"));
		plist.add(new Project(142,"AMEX"));
		plist.add(new Project(182,"BLUEJEENS"));
		plist.add(new Project(127,"ITIS"));
		plist.add(new Project(123,"InusrancePortal"));
	//	Collections.sort(plist);
		Iterator pi=plist.iterator();
		while(pi.hasNext()) {
			System.out.println(pi.next());
		}
		
		
		
		/*intList.remove(2);
		
		System.out.println(intList.get(3));
		
		System.out.println(intList.indexOf(9876));
		
		System.out.println(intList.contains(93));
		
		//intList.clear();
		
		System.out.println(intList.isEmpty());
		
		List<Integer> sublist=Arrays.asList(23,86,876);
		System.out.println(sublist);
		intList.addAll(sublist);//interoperable
		
		System.out.println(intList);
		
		//minus
	//	intList.retainAll(sublist);
	//	intList.removeAll(sublist);
		System.out.println(sublist);
	//	System.out.println(intList);
		System.out.println(intList.containsAll(sublist));
		
		
	//	Object  iarray[]=intList.toArray();
		
		System.out.println("using itertaor ");
		Iterator i=intList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("using for each");
		for( Object o :intList)
			System.out.println(o);
		
		
		//addFirst(), addLast()
		List<Project> plist=new LinkedList<Project>();
		plist.add(new Project(101,"LMS"));
		plist.add(new Project(102,"AMEX"));
		plist.add(new Project(102,"AMEX"));
		plist.add(new Project(102,"AMEX"));
		plist.add(new Project(103,"InusrancePortal"));
		Iterator pi=plist.iterator();
		while(pi.hasNext()) {
			System.out.println(pi.next());
		}
		
		Object projectarray[]=plist.toArray();*/
		
		
		
		
	}

}
