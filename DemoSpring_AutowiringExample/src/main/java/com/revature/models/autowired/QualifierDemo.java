package com.revature.models.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

interface Drivable {

}

@Component("bmw")
class Bmw implements Drivable {
	static {
		System.out.println(" in bmw");
	}

}

@Component("mercedes")
class Mercedes implements Drivable {
	static {
		System.out.println(" in mercedes");
	}

}

class Driver {
    private Drivable drivable;

    public Driver(Drivable drivable) {
        this.drivable = drivable;
        
    }
}

public class QualifierDemo {
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
	        Driver bean = ctx.getBean(Driver.class);
	        
	        System.out.println(bean.getClass());
	}

}
