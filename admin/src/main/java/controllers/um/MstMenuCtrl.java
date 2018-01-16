package controllers.um;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import common.RestResponse;
import services.um.MstMenuSvc;

@RestController
@RequestMapping(value = "/mstMenu")
public class MstMenuCtrl {
	
	@Autowired
	private MstMenuSvc mstMenuSvc;
	private RestResponse response;

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public RestResponse getAll() {
		response = new RestResponse();
		
		response.setCode(200);
		response.setMessage("Message");
		response.setContent(mstMenuSvc.getMenuStructure());

		return response;
	}
}
