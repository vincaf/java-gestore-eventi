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

	public void setDate(LocalDate date) throws Exception {
		if(date.isBefore(LocalDate.now())) {
			throw new Exception("The entered date cannot be earlier than the current one.");
		}
		this.date = date;
	}

	public int getTotalSeatNumber() {
		return totalSeatNumber;
	}

	public int getReservedSeatNumber() {
		return reservedSeatNumber;
	}
	
	public int getAvailableSeat() {
		return getTotalSeatNumber() - getReservedSeatNumber();
	}
	
	public void reserve() throws Exception {
		if(reservedSeatNumber == totalSeatNumber || date.isBefore(LocalDate.now())) {
			throw new Exception("It's no longer possible to participate in this event.");
		}
		reservedSeatNumber++;
	}
	
	public void cancel() throws Exception{
		if(reservedSeatNumber == 0 || date.isBefore(LocalDate.now())) {
			throw new Exception("It's no longer possible to cancel the reservation for this event.");
		}
		reservedSeatNumber--;
	}
	
	protected String getFormattedDate() {
		return date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear();
	}
	
	@Override
	public String toString() {
		return getFormattedDate() + " - " + getTitle();
	}
}
