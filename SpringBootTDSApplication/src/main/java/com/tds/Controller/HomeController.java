package com.tds.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tds.Exception.UserNotFoundException;
import com.tds.Model.TdsMaster;
import com.tds.Service.TdsService;

@RestController
public class HomeController {
	//linking the service class  without creation of objects
	
	@Autowired
	TdsService masterService;
	
	/*@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}*/
	
	

	//getting the id of a particular tds master
	
	@GetMapping("user/tds/{id}")
	public TdsMaster getById(@PathVariable int id) {
		TdsMaster master=masterService.getById(id);
		if(master==null) {
			throw new UserNotFoundException("ID not found wrong ID : "+id);
		}
		else
			return master;
	}



}
