package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Clark;
import com.nit.repository.ClarkRepository;
@Service("ckService")
public class ClarkService implements IClarkService {

	@Autowired
	private ClarkRepository ckRpo;

	@Override
	public String insertClark(Clark clark) {
		// TODO Auto-generated method stub
		return "Clark is saved"+ckRpo.save(clark).getId();
	}


	@Override
	public Iterable<Clark> getAllClark() {
		// TODO Auto-generated method stub
		return ckRpo.findAll();
	}
	
	
}
