package com.scluzzy.springdatarest.dao;

import com.scluzzy.springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no code required!!

}
