package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeRepository empRep;

	@GetMapping("/")
	public List<Employee> getAllEmployee() {

		Employee employee = new Employee();
		employee.setName("Gunay");
		employee.setSurname("Huseyinli");
		empRep.save(employee);

		try {
			System.out.println(employeeService.findAll());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeService.findAll();
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long id) {
		try {
			System.out.println("***********************8");
			System.out.println("***********" + employeeService.findById(id));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeService.findById(id);
	}

}
