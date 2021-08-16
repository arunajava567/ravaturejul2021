package com.revature.models.autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("e")
public class Employee {
    private int eid;
    private String ename;
   // @Autowired //implicit dependency injection
    private Department department;
    
    
    
    @Autowired
    public Employee(Department department) {
	super();
	this.department = department;
}
	//@Autowired
    //@Required
	public void setDepartment(Department department) {
		this.department = department;
	}
    public int getEid() {
        return eid;
    }
    public Department getDepartment() {
		return department;
	}
	public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void showEployeeDetails(){
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee Name : " + ename);
        department.setDeptName("Information Technology");
        System.out.println("Department : " + department.getDeptName());
    }
}