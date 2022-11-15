package com.Keyclock.demo.KeyclockDemo.service;

import com.Keyclock.demo.KeyclockDemo.model.Department;
import com.Keyclock.demo.KeyclockDemo.model.Employee;
import com.Keyclock.demo.KeyclockDemo.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class EmployeeService{

    public final EmployeeRepo employeeRepo;

    @PostConstruct
    public void createTable()
    {
        employeeRepo.saveAll(
                Stream.of(
                        new Employee(1,"janak", Department.JAVA),
                        new Employee(2,"raj",Department.DESIGN),
                        new Employee(3,"rahul",Department.SEO)
                ).collect(Collectors.toList())
        );
    }

    public Object getEmployee(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }

    public List<Object> getAllEmployee()
    {
        return Collections.singletonList(employeeRepo.findAll());
    }

}
