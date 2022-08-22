package com.calendar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Calendar {
	
	@Id
	private int Id;
	
	@Column(name = "Day")
	private String day;
	
	@Column(name = "Date")
	private int date;
	
	@Column(name = "Month")
	private String month;
	
	@Column(name = "Year")
	private int year;

	
	public Calendar() {       // The default constructor in Java initializes the data members of the class to their default values   
		super();              // such as 0 for int, 0.0 for double etc. This constructor is implemented by default by the Java 
	}                         // compiler if there is no explicit constructor implemented by the user for the class. 


	public Calendar(int id, String day, int date, String month, int year) {    // To Pass the value of the variables all together 
		super();                                                               // in a single line  
		Id = id;                                                               // If you want to pass all the value 
		this.day = day;                                                        // no need to do set and get separately
		this.date = date;
		this.month = month;
		this.year = year;
	}


	public int getId() {                   // You have made getters bcoz your variables are private so you can not take its value out side
		return Id;                         // this class so you need a function to return or export the values
	}


	public void setId(int id) {            // but why we have made setters when we have constructor may be to set value separately 
		Id = id;                           // but in what situation we are going to need it
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Calendar [Id=" + Id + ", day=" + day + ", date=" + date + ", month=" + month + ", year=" + year + "]";
	}
		
	
	
}
