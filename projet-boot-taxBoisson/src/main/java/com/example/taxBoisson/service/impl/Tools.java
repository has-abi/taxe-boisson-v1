package com.example.taxBoisson.service.impl;

import java.util.Calendar;
import java.util.Date;

public class Tools {
	
	public Date getDate() {
		Date date = new Date();
		return date;
	}
	
	public int getYearFromDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.YEAR);
	}
	
	public int getMonthFromDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH)+1;
	}
}
