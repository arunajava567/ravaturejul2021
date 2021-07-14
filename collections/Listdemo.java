package com.revature.sre.day3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

class Project implements Comparable{
	Integer id;
	String title;
	public Project(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + "]";
	}
	
	public int compareTo(Object o) {
		Project p=(Project)o;
		if(this.id>p.id)
			return +1;
		else if (this.id<p.id)
			  return -1;
		else 
			return 0;
	}
	
}
//Collecton
public class Listdemo {
	
	
	public static void main(String[] args) {
		
		/*List list=new ArrayList();
		list.add(23);
		list.add(43534.4343);
		list.add(new Date());
		list.add("java");
		
		System.out.println(list);*/
		Vector<Integer> intList=new Vector<Integer>(); //generics
		//multi threaded , synchronized
		//LinkedList<Integer> intList=new LinkedList<Integer>(); //generics
		//intList.
		intList.add(23);
		intList.add(56);
		intList.add(23);
		intList.add(86);
		intList.add(93);
		intList.add(86);
		System.out.println(intList);
		intList.remove(2);
		
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
		
		Object projectarray[]=plist.toArray();
		
		Queue q=new LinkedList<Integer>();
		
		Stack s=new Stack();
		s.push(2);
		s.push(7);
		s.push(23);
		System.out.println(s);
		System.out.println(s.pop());
		
		
		
		
	}

}
