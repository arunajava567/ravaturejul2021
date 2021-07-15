package com.revature.practice;
//test, client , run
public class Demo {
  public static void main(String[] args) {
		System.out.println("welcome to FSD training");
		
		Course course =new Course();  //instantiation, object creation
		System.out.println(course.courseId  +  "  "+course.courseName);
		course.readCourseDetails();
		course.dispCoursedetails();
	
		Course course1 =new Course();  //instantiation, object creation
		System.out.println(course1.courseId  +  "  "+course1.courseName);
		course1.readCourseDetails();
		course.dispCoursedetails();
		//encapsulated , wrapcontent 
		System.out.println(course +"   "+course1);
		College c=new College();
		c.collegeName="SRM";
		c.show();
		College colleges[]=new College[3];
        int k=0;
       for(int i=0;i<colleges.length ;i++) {
    	     colleges[i]=new College();
		k++;
		colleges[i].setCollegeName("SRM University"+k);
		colleges[i].show();
		System.out.println(colleges[i]);
		
		course=null;
		
       }
       		//System.gc();
     		//Runtime.getRuntime().gc();
     		//System.runFinalization();
	}
}


