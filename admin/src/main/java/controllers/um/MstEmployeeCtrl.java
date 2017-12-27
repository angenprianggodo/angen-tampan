package controllers.um;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import common.RestResponse;
import model.um.Employee;

@RestController
@RequestMapping(value = "/mstEmployee")
public class MstEmployeeCtrl {

	private RestResponse response;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public RestResponse getAll() {
		Employee empl = new Employee();
		empl.setEmployeeCode("0001");
		empl.setEmployeeName("Angen");
		empl.setEmail("angen@gmail.com");
		empl.setPhone("7782");

		response = new RestResponse();
		response.setCode(200);
		response.setMessage("Message");
		response.setContent(empl);

		return response;
	}

}