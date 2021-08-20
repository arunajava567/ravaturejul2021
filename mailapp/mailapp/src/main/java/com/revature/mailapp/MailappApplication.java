package com.revature.mailapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailappApplication {
    @Autowired
    private static JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(MailappApplication.class, args);
		
		    
		 

		        SimpleMailMessage msg = new SimpleMailMessage();
		        msg.setTo("reacharuna302@gmail.com");

		        msg.setSubject("Testing from Spring Boot");
		        msg.setText("Hello World \n Spring Boot Email");

		        javaMailSender.send(msg);

		    
	}

}
