package services.um;

import java.util.List;

import model.um.Employee;

public interface MstEmployeeSvc {
	public List<Employee> getAllEmployee();

	public void addEmployee();

	public void updateEmployee();

	public void deleteEmployee();
}