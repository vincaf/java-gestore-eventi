package org.generation.italy.eventi;

import java.time.LocalDate;

public class Event {
	
	private String title;
	private LocalDate date;
	private int totalSeatNumber;
	private int reservedSeatNumber;
	
	Event(String title, LocalDate date, int totalSeatNumber) throws Exception{
		
		setTitle(title);
		setDate(date);
		
		if(totalSeatNumber <= 0) {
			throw new Exception("The total number of seats must be greater than zero.");
		}
		
		this.totalSeatNumber = totalSeatNumber;
		this.reservedSeatNumber = 0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getTotalSeatNumber() {
		return totalSeatNumber;
	}

	public int getReservedSeatNumber() {
		return reservedSeatNumber;
	}
	
}
