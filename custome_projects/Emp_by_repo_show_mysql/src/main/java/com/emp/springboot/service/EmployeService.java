package com.emp.springboot.service;
import com.emp.springboot.entity.Employee;
import java.util.List;

public interface EmployeService {
	public Employee getEmp(int EmpId);
	public List<Employee> getEmps();
	public void insertEmp(Employee employee);
	public void updateEmp( int EmpId, Employee employee);
	public void deleteEmp(int EmpId);
}
