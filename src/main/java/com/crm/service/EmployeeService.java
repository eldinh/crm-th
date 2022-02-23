package com.crm.service;

import com.crm.entity.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);

    public Employee findByFirstName(String firstName);
}
