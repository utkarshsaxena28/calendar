package com.calendar;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.calendar.entity.Calendar;
import com.calendar.repo.CalendarRepo;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class MyCalendar { //extends Calendar

	
	@Autowired
	private CalendarRepo calRepo;
	

	@PostConstruct
	public Calendar addDate() {
		Calendar cal = new Calendar(4,"sunday",21,"August",2022);
		Calendar result = calRepo.save(cal);
		return result;
	}
	
	/*
	public MyCalendar(int id, String day, int date, String month, int year) {
		super(id = 4, day = "sunday", date = 21, month="August", year = 2022);
	}*/

    /*
	@PersistenceContext
    private EntityManager entityManager;
	
	@Transactional
	public void insertWithQuery(Calendar today) {
		
		System.out.println(today);
	    entityManager.createNativeQuery("INSERT INTO person (id, day, date, month, year) VALUES (?,?,?,?)")
	      .setParameter(1, today.getId())
	      .setParameter(2, today.getDay())
	      .setParameter(3, today.getDate())
	      .setParameter(4, today.getMonth())
	      .setParameter(5, today.getYear())
	      .executeUpdate();
	}*/

}
