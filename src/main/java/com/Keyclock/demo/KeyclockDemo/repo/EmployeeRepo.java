package com.Keyclock.demo.KeyclockDemo.repo;

import com.Keyclock.demo.KeyclockDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
