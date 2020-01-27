package com.example.demo.repository;

import java.util.List;
import java.util.stream.Stream;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	List<Employee> findByName(String name);

	@Query("select e from Employee e where e.name = :name")
	Stream<Employee> findByNameReturnStream(@Param("name") String name);

}
