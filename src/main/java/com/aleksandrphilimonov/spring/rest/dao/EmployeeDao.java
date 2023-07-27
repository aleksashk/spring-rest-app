package com.aleksandrphilimonov.spring.rest.dao;

import com.aleksandrphilimonov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
