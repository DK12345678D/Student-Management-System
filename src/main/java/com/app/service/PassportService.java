package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Passport;
import com.app.repository.PassportRepository;

@Service
public class PassportService 
{
	@Autowired
	private PassportRepository passportRepository;
	
	@Transactional
	public Passport save(Passport passport) {
		return passportRepository.save(passport);
	}
}
