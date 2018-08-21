package com.validation.serviceimpl;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.validation.service.Ivalidationservice;
	 
	@Service
	public class Validationservice implements Ivalidationservice{
	 
	private static Pattern fileExtnPtrn = Pattern.compile("([^\\s]+(\\.(?i)(txt|doc|pdf))$)");
	     
	    public boolean validateFileExtn(String file){
	         
	        Matcher mtch = fileExtnPtrn.matcher(file);
	        if(mtch.matches()){
	            return true;
	        }
	        return false;
	    }
}
