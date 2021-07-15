package com.revature.practice;

public class Course {
	  //data members, instance vraibales, member variable
	  //state of the class
	int courseId;
	String courseName;
	int duration;
	double fee;
	
	void readCourseDetails() {
		courseId=101;
		courseName="Java";
		duration=12;
		fee=8989.99;
	}
	void dispCoursedetails() {
		System.out.println(courseId+"  "+courseName+"  "+fee+"   "+duration);
	}

}
