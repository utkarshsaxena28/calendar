package com.calendar.controller;

import java.util.List;

import java.util.Optional;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calendar.CalendarApplication;
import com.calendar.entity.Calendar;
import com.calendar.service.CalendarService;

@RestController
public class CalendarController {
	
	static Logger logger = LogManager.getLogger(CalendarApplication.class);

	@Autowired
	private CalendarService calService;
	
	@GetMapping("/getdates")
	public ResponseEntity<List<Calendar>> list() {

		logger.info("Getting the list of all dates");

		List<Calendar> list = calService.listAll();

		if (list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	/*
	@PostMapping("/adddate")
	public ResponseEntity<Calendar> add(@RequestBody Calendar cald) {
		Calendar cd = null;
		try {
			cd = calService.addDate(cald);
			int id = cald.getId();
			logger.info("Adding New date having id equale to {}..........", id);
			//kafkaProducer.sendMessage(String.format("NEW USER IS ADDED having id equale to %s ", id));
			return ResponseEntity.of(Optional.of(cd));
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}*/
		
}
