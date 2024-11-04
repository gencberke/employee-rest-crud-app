package com.hibernateandstuff.employeerestcrupapp.dao;

import com.hibernateandstuff.employeerestcrupapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
