package services.um.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.um.MstEmployeeDao;
import entity.um.MstEmployee;
import model.um.Employee;
import services.um.MstEmployeeSvc;

@Service(value = "mstEmployeeSvc")
@Transactional
public class MstEmployeeSvcImpl implements MstEmployeeSvc {
	@Autowired
	private MstEmployeeDao mstEmployeeDao;

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<>();
		List<MstEmployee> mstEmployees = mstEmployeeDao.findAll();
		for(MstEmployee obj : mstEmployees) {
			Employee empl = new Employee();
			empl.setEmployeeCode(obj.getEmployeeCode());
			empl.setEmployeeName(obj.getEmployeeName());
			empl.setPhone(obj.getPhone());
			empl.setEmail(obj.getEmail());
			
			employees.add(empl);
		}
		return employees;
	}
	
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub

	}
}
