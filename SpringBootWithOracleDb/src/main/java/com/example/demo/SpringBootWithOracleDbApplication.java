package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithOracleDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithOracleDbApplication.class, args);
	}

}

/*
 * 
 * @SpringBootApplication public class SpringBootWithOracleDbApplication
 * implements CommandLineRunner {
 * 
 * @Autowired DataSource dataSource;
 * 
 * @Autowired EmployeeRepository employeeRepository;
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(SpringBootWithOracleDbApplication.class, args); }
 * 
 * @Transactional(readOnly = true)
 * 
 * @Override public void run(String... args) throws Exception {
 * 
 * System.out.println("DATASOURCE = " + dataSource);
 * 
 * System.out.println("\n1.findAll()..."); for (Employee employee :
 * employeeRepository.findAll()) { System.out.println(employee); }
 * 
 * System.out.println("\n2.findByName(String name)..."); for (Employee employee
 * : employeeRepository.findByName("zilap")) { System.out.println(employee); }
 * 
 * // For Stream, need @Transactional System.out.
 * println("\n4.findByNameReturnStream(@Param(\"name\") String name)..."); try
 * (Stream<Employee> stream =
 * employeeRepository.findByNameReturnStream("333@yahoo.com")) {
 * stream.forEach(x -> System.out.println(x)); }
 * 
 * System.out.println("Done!");
 * 
 * exit(0);
 * 
 * }
 * 
 * }
 */
