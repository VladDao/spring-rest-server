package com.spring.plietnov.task.repository;

import com.spring.plietnov.task.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
