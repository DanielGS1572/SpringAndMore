package com.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.domain.Employee;
import com.springboot.app.domain.Employer;
import com.springboot.app.repository.EmployeeDao;

@SpringBootApplication
public class HomeController  
{  
  @Autowired  
  EmployeeDao employeeDao;  
    
    @RequestMapping("/")  
    public String test (ModelMap model)  
    {  
        Employer employer = new Employer();  
        employer.setEmployerName("Employer 1");  
          
        Employee employee1 = new Employee();  
        employee1.setEmployeeName("Trevor Page");  
        employee1.setEmployer(employer);  
          
        Employee employee2 = new Employee();  
        employee2.setEmployeeName("John Doe");  
        employee2.setEmployer(employer);  
          
      employeeDao.save(employee1);    
      employeeDao.save(employee2);  
        return "testPage";  
    }  
} 
