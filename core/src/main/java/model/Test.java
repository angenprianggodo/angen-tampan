package model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;

public class Test implements Serializable{
	
	private static final long serialVersionUID = 7324589878457285846L;
	@JsonView
	private String employeeCode;
	@JsonView
	private String employeeName;
	@JsonView
	private String phone;
	@JsonView
	private String email;

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
