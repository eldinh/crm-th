package com.crm.service;

import com.crm.entity.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);

    public List<Employee> findByFirstName(String firstName);

    public Employee findByEmail(String email);
}
