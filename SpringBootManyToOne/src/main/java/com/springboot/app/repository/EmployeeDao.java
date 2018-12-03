package com.springboot.app.repository;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.app.domain.Employee;

@Transactional  
@Repository  
public class EmployeeDao  
{  
  @Autowired  
  SessionFactory sessionFactory;  
    
  public void save (Employee employee)  
  {  
    Session session = sessionFactory.getCurrentSession();  
      
    session.save(employee);  
  }  
      
}  