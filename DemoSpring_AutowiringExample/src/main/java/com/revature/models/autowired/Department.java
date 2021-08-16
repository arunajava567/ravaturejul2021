package com.revature.models.autowired;
import org.springframework.stereotype.Component;
@Component("d")
public class Department {
private String deptName;
public String getDeptName() {
return deptName;
}
public void setDeptName(String deptName) {
this.deptName = deptName;
}
}