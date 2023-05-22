package com.nit.service;

import com.nit.entity.Clark;


public interface IClarkService {
    
	public String insertClark(Clark clark);
	
	public Iterable<Clark>getAllClark();


}
