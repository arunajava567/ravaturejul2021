package com.ers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ers.db.DBUtil;
import com.ers.db.EmployeeMapper;
import com.ers.db.HibernateUtil;
import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;

public class EmployeeRegistrationDaoImpl {
	
	
	
	
	public void deleteEmployee(Employee e) {
		 try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				//session i sused for communicating with db
				session.beginTransaction();  //insert,update,delete,  not required for select
				
				EmployeeEntity ee=EmployeeMapper.mapEmployee(e);
				//get return null ,load  throw NullpointerException
				//get Eager loading  ,load lazy loading 
				EmployeeEntity ee1=session.get(EmployeeEntity.class, ee.getEmployeeId());
				session.delete(ee1);
				session.flush();
				System.out.println("employee inserted...");
				session.getTransaction().commit();
				session.close();
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
	 }
	
	 public void updateEmployee(Employee e) {
		 try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				//session i sused for communicating with db
				session.beginTransaction();  //insert,update,delete,  not required for select
				
				EmployeeEntity ee=EmployeeMapper.mapEmployee(e);
				//session.find(EmployeeEntity.class, ee.getEmployeeId());
				//session.get()
				EmployeeEntity ee1=session.load(EmployeeEntity.class, ee.getEmployeeId());
				ee1.setDepartment(ee.getDepartment());
				ee1.setDesignation(ee.getDesignation());
				//...
				
				//session.delete(ee1);
				session.merge(ee1);  //update
				//session.flush();
				System.out.println("employee inserted...");
				session.getTransaction().commit();
				session.close();
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
	 }
	public List<EmployeeEntity> displayAllEmployees(){
		List<EmployeeEntity> elist=new ArrayList<EmployeeEntity>();
		
try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			Query q=session.createQuery("from EmployeeEntity e"); //native ,namedquery,hql
		//	q.setParameter("email", "email@gmail.com");
		//	Query q=session.createNamedQuery("emp");
		//	Query q=session.createSQLQuery("select * from employee");
			//TypedQuery q1=session.
			
			elist=q.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
	}
	
	 public void addEmployee(Employee e) {
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			//session i sused for communicating with db
			session.beginTransaction();  //insert,update,delete,  not required for select
			session.save(EmployeeMapper.mapEmployee(e));
			System.out.println("employee inserted...");
			session.getTransaction().commit();
			
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
	 }
}
