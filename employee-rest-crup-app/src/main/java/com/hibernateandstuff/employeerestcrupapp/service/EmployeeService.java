package com.hibernateandstuff.employeerestcrupapp.service;

import com.hibernateandstuff.employeerestcrupapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
