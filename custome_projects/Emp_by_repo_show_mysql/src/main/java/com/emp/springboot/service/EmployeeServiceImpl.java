package com.emp.springboot.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.emp.springboot.entity.Employee;
import com.emp.springboot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class EmployeeServiceImpl implements EmployeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	public EmployeeServiceImpl() {
		
	}
	
	public Employee getEmp(int empId) {

		return employeeRepository.findById(empId).get();
	}

	
	public List<Employee> getEmps() {
		return employeeRepository.findAll();
	}

	
	public void insertEmp(Employee employee) {
		employeeRepository.save(employee);

	}

	
	public void deleteEmp(int empId) {
		employeeRepository.deleteById(empId);

	}

	
	public void updateEmp(int empId, Employee employee) {
		employeeRepository.save(employee);

	}
	
	
		
	}




