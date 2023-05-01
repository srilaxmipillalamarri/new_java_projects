package com.emp.springboot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.emp.springboot.service.EmployeService;
import com.emp.springboot.entity.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeService employeService;
	public EmployeeController() {
		
	}
	//@RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
		@GetMapping(value="/employee/{empId}",produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
		public Employee getEmployee(@PathVariable("empId") int EmpId) {
			return employeService.getEmp(EmpId);
		}

		//@RequestMapping(value = "/employees", method = RequestMethod.GET)
		@GetMapping(value="/employees",produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
		public List<Employee> getEmployees() {
			return employeService.getEmps();
		}

		//@RequestMapping(value = "/employees", method = RequestMethod.POST)
		@PostMapping("/employees")
		public void insertEmployee(@RequestBody Employee employee) {
			employeService.insertEmp(employee);

		}

		//@RequestMapping(value = "employees/{empId}", method = RequestMethod.PUT)
		@PutMapping(value="employees/{empId}",consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
		public void updateEmployee(@PathVariable("empId") int EmpId, @RequestBody Employee employee) {
			employeService.updateEmp(EmpId, employee);

		}

		//@RequestMapping(value = "employees/{empId}", method = RequestMethod.DELETE)
		@DeleteMapping(value="employees/{empId}",consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
		public void deleteEmployee(@PathVariable("empId") int EmpId) {
			employeService.deleteEmp(EmpId);
		}
	}
	

