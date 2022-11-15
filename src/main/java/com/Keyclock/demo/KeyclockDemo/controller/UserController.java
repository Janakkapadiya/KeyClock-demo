package com.Keyclock.demo.KeyclockDemo.controller;

import com.Keyclock.demo.KeyclockDemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController{

    public final EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    @RolesAllowed("user")
    public ResponseEntity<Object> findEmployeeById(@PathVariable("id") int id)
    {
        Object employee = employeeService.getEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/findAll")
    @RolesAllowed("admin")
    public ResponseEntity<List<Object>> findAllEmployees()
    {
        List<Object> allEmployees = employeeService.getAllEmployee();
        return new ResponseEntity<>(allEmployees,HttpStatus.OK);
    }
}
