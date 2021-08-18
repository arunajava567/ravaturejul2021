package com.revature.springrest.springrestdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //@Controller + @ResponseBody
//@RequestMapping("/bank")
public class LoanController {
	//url or api call  or rest calls
	@GetMapping("/emi/{id}")    //@RequestMapping(value="/emi",method=RequestMethod.GET)
	public String getEmi(@PathVariable Integer id) {
		return "EMI is : Rs.5000"+ " Id:"+id;   // -
	}
	@GetMapping("/emi")    
	public String getAllEmi() {
		return "EMI is : Rs.5000"+ " Id:";   // -
	}
	@GetMapping("/interest")    //@RequestMapping(value="/emi",method=RequestMethod.GET)
	public String getInterest() {
		return "EMI is : Rs.500";   // -
	}
}
