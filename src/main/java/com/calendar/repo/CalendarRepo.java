package com.calendar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.calendar.entity.Calendar;

@Component
public interface CalendarRepo extends JpaRepository<Calendar, Integer> {

	// We can not directly implement JpaRepository interface in service class otherwise we have to give body to all its methods
}
