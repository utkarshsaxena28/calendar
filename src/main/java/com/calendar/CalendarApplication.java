package com.calendar;

import org.junit.Test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.calendar.entity.Calendar;


import javax.annotation.PostConstruct;

@SpringBootApplication
public class CalendarApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CalendarApplication.class, args);
		
		
	}
	
	/*
	@Test
	public void todaysdate() {
		Calendar cal = new Calendar(4,"sunday",21,"August",2022);
		System.out.println(cal);
		MyCalendar mycal = new MyCalendar();
		mycal.insertWithQuery(cal);
	}*/
	
	
	//@PostConstruct
	public void cal() {
		MyCalendar cal = new MyCalendar();
		cal.addDate();
	}

}
