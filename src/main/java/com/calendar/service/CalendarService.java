package com.calendar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.calendar.entity.Calendar;
import com.calendar.repo.CalendarRepo;

@Service
@Transactional
public class CalendarService {

	@Autowired
	private CalendarRepo calRepo;
	
	// Getting list of all dates present in database
	public List<Calendar> listAll() {
		List<Calendar> list=  (List<Calendar>) calRepo.findAll();
		return list;
	}
	/*
	// Adding the date or Posting the date
	public Calendar addDate(Calendar cald) {
		Calendar result = calRepo.save(cald);
		return result;
	}*/
	
	/*
	public Calendar addDate() {
		Calendar cal = new Calendar(4,"sunday",21,"August",2022);
		System.out.println(cal);
		return calRepo.save(cal);
	}*/
}
