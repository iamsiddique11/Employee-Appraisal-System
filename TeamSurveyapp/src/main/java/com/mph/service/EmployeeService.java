package com.mph.service;

import java.util.List;

import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;

/**
 *
 */
public interface EmployeeService {

	/**this method is used to create employee
	 * @param employee this is the parameter to createEmployee method
	 */
	public void createEmployee(Employee employee);
	

	/**
	 * this method is used to update employee
	 * @param employee this is the parameter to updateEmployee method
	 * @return List this will return list of employees
	 */
	public List<Employee> updateEmployee(Employee employee);
	
	
	/**
	 * this method is used to delete employee
	 * @param employeeId this is parameter passed to deleteEmployee method
	 * @return List this will return list of employees
	 */
	public List<Employee> deleteEmployee(int employeeId);
	
	
	/**
	 * this method used to getEmployeeById
	 * @param employeeId this is parameter passed to getEmployeeById method
	 * @return employee this will return a employee
	 */
	public Employee getEmployeeById(int employeeId);
	

	/** this method used to getAllEmployee
	 * @return List this will return list of employees
	 */
	public List<Employee> getAllEmployee();

}
