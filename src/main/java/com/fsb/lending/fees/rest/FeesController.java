package com.fsb.lending.fees.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fsb.lending.fees.domain.Fee;
import com.fsb.lending.fees.service.FeesListingService;

@RestController
public class FeesController 
{

	@Autowired
	private FeesListingService service;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/fees/listing", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Fee> findAll() {
		return service.getAllFeesFromRepository();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/fees/secure/listing", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Fee> findSecureFees() {
		return service.getAllFeesFromRepository();
	}	

}
