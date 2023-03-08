package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
