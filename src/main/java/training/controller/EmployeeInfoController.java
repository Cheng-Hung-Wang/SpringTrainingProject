package training.controller;

import javax.inject.Inject;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import training.jpa.Employee;
import training.service.DepartmentService;
import training.service.EmployeeService;

@Controller

@RequestMapping("{api|test}/")
public class EmployeeInfoController {

	@Inject
	private EmployeeService employeeService;
	
	@Inject
	private DepartmentService departmentService;
	

	@Value("${database.url}")
	private String database;
	
	@Value("${database.user}")
	private String user;
	
	@RequestMapping(value="database",
	        		produces = "application/json;charset=UTF-8",  
	        		method = RequestMethod.GET)
	@ResponseBody
	public String getDatabase(@RequestParam(required = false, defaultValue = "0") int type){
		if(type==0)		
			return database;
		else
			return user;
	}
	
	@RequestMapping(value="employee",
					produces = "application/json;charset=UTF-8",
					method = RequestMethod.GET)
	@ResponseBody
	public String getEmployee(@RequestParam(required = false, defaultValue = "1") int eId) throws JSONException{
		
		Employee employee = employeeService.getEmployee(eId);
		JSONObject json = new JSONObject();
		
		json.put("first_name", employee.getFirstName());
		json.put("last_name", employee.getLastName());
		
		return json.toString();		
	}

}
