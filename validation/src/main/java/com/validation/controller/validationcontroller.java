package com.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.validation.service.Ivalidationservice;

@RestController
public class validationcontroller {
	@Autowired
	private Ivalidationservice ob;
	@RequestMapping(value="/upload/{File}/",method=RequestMethod.POST)
	public boolean validateFileExtn(@PathVariable String file)
	{
		return ob.validateFileExtn(file);
	}
}
