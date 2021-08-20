package com.example;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		final String uri = "http://localhost:8586/employees/GetEmployee/1";
		//Java rest web client 
	    RestTemplate restTemplate = new RestTemplate();
	    
	    
	    HttpHeaders headers = new HttpHeaders();
	   HttpEntity <String> entity = new HttpEntity<String>(headers);
	    
	     ResponseEntity<Employee> response = restTemplate.getForEntity(uri,Employee.class);
	   System.out.println(response.getBody().toString());
	
	     
	    System.out.println(restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody().toString());
	
	     HttpEntity <Employee> entity1 = new HttpEntity<Employee>(headers);
	  

	    System.out.println(restTemplate.exchange("http://localhost:8586/employees/EmployeeCreation", HttpMethod.POST, entity1, String.class));
	

	}

}
