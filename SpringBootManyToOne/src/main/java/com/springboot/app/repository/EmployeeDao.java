package com.springboot.app.repository;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.domain.Employeex;

@Repository
public interface EmployeeDao extends JpaRepository<Employeex, Long>
{  
 
      
}  