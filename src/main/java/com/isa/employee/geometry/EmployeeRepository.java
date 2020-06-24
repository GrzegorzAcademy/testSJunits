package com.isa.employee.geometry;

import com.isa.employee.geometry.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class EmployeeRepository {

    private final List<Employee> employees = new ArrayList<>();

    public void loadEmployees(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public boolean containsEmployee(String name) {
        return employees.stream()
                        .map(Employee::getName)
                        .anyMatch(name::equals);
    }

    public List<Employee> findAllWithSalaryHigherThan(BigDecimal salary) {
        return employees.stream()
                        .filter(e -> e.getSalary().compareTo(salary) > 0)
                        .collect(toList());
    }

    public Optional<Employee> findByName(String name) {
        return employees.stream()
                        .filter(e -> e.getName().equals(name))
                        .findFirst();
    }
}
