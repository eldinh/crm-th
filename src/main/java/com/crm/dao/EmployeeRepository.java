package com.crm.dao;

import com.crm.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    public List<Employee> findByFirstName(String firstName);

    public Employee findByEmail(String email);

    public List<Employee> findAllByOrderByLastNameAsc();

}
