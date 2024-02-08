package com.Project.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.entity.Citizen;
import com.Project.entity.Resultobject;
import com.Project.restcontroller.service.FederalServiceImp;

@RestController
public class CentralGovtRestController {
	
	@Autowired
	private FederalServiceImp federalservice;
	
	@PostMapping("/state")
	public Resultobject generateState(@RequestBody Citizen citizen)
	{
		
			String state=federalservice.getState(citizen);
			
		return new Resultobject(state, citizen.getSsn());
	}
}
