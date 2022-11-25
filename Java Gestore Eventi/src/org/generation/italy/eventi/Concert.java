package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event {
	
	private LocalTime hours;
	private BigDecimal price;

	public Concert(String title, LocalDate date, int totalSeatNumber, LocalTime hours, BigDecimal price) throws Exception {
		super(title, date, totalSeatNumber);
		setHours(hours);
		setPrice(price);
	}

	public LocalTime getHours() {
		return hours;
	}

	public void setHours(LocalTime hours) {
		this.hours = hours;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getFormattedPrice() {
		DecimalFormat f = new DecimalFormat("##.00");
		return f.format(getPrice()) + "€";
	}

	public String getDateHours() {
		return getFormattedDate() + " - " + getHours();
	}

	@Override
	public String toString() {
		return getDateHours() + " - " + getTitle() + " - " + getFormattedPrice();
	}
}
