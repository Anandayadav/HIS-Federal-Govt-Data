package com.Project.restcontroller.service;

import org.springframework.stereotype.Service;

import com.Project.entity.Citizen;

@Service
public class FederalServiceImp implements FederalService{

	@Override
	public String getState(Citizen citizen) {
		
		String state=null;
		if(citizen.getSsn().startsWith("1"))
		{
			state ="New Jersey";
		}
		if(citizen.getSsn().startsWith("2"))
		{
			state ="Texas";
		}
		if(citizen.getSsn().startsWith("3"))
		{
			state ="Ohio";
		}if(citizen.getSsn().startsWith("4"))
		{
			state ="Rhode Island";
		}if(citizen.getSsn().startsWith("5"))
		{
			state ="Kentucky";
		}if(citizen.getSsn().startsWith("6"))
		{
			state ="Albama";
		}if(citizen.getSsn().startsWith("7"))
		{
			state ="New York";
		}if(citizen.getSsn().startsWith("8"))
		{
			state ="Alaska";
		}if(citizen.getSsn().startsWith("9"))
		{
			state ="California";
		}
	
	return state;
	}
}
