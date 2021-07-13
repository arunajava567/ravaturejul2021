package com.revature.sre.day2;

import java.util.Date;

//Object -> 
//java.lang

// equals , hashCode, getClass, toString(),
// finalize() ,clone(), wait(),notify(), notidyAll()  - multithreading
public class Course implements Cloneable {
	private Integer courseId;
	private String courseName;
	private Double duration;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	
	public Course() {
		
	}
	public Course(Integer courseId, String courseName, Double duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + "]";
	}
	
	public void finalize() {
		courseId=0;
		courseName=null;
		duration=0.0;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Course c1=new Course(101,"java",8.0);
		Course c2=new Course();
		Course c3=c2;
		
		System.out.println(c1.getClass());
		
		System.out.println(c1.equals(c2));
		System.out.println(c3.equals(c2));
		System.out.println(c1.hashCode() +"  "+c2.hashCode()  +"  "+c3.hashCode());
		

		// c1.finalize();   System.gc()
		System.out.println(c1);
		
		
		Course cc2=(Course) c1.clone();
		System.out.println(c1);
		System.out.println(cc2);
		System.out.println(c1.hashCode());
		System.out.println(cc2.hashCode());
		
		
	/*	Date d=new Date();
		System.out.println(d.getClass());
	*/	
		
		
	}

}
