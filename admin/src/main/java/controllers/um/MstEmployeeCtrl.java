package controllers.um;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import common.RestResponse;
import model.um.Employee;
import services.um.MstEmployeeSvc;

@RestController
@RequestMapping(value = "/mstEmployee")
public class MstEmployeeCtrl {
	@Autowired
	private MstEmployeeSvc mstEmployeeSvc;
	private RestResponse response;

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public RestResponse getAll() {

		response = new RestResponse();
		response.setCode(200);
		response.setMessage("Message");
		response.setContent(mstEmployeeSvc.getAllEmployee());

		return response;
	}

}