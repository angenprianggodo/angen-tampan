package entity.um;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import entity.BaseEntity;

@Entity(name = "MstEmployee")
@Table(schema = "USER_MANAGEMENT", name = "MST_EMPLOYEE")
public class MstEmployee extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -2798072563424417206L;

	@Column(name = "EMPLOYEE_CODE", unique = true, nullable = false, length = 10)
	private String employeeCode;

	@Column(name = "EMPLOYEE_NAME", nullable = false, length = 255)
	private String employeeName;

	@Column(name = "PHONE", nullable = false, length = 15)
	private String phone;

	@Column(name = "EMAIL", nullable = false, length = 100)
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
