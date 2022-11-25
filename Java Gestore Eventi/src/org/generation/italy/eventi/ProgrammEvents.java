package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammEvents {
	private String title;
	private List<Event> events;


	public ProgrammEvents(String title2) {
		this.title = title2;
		this.events = new ArrayList<>();
	}

	public void addEvent(Event e) {
		events.add(e);
	}

	public String getTitle() {
		return title;
	}

	public List<Event> getEventsByDate(LocalDate date) {
		List<Event> eventsByDate = new ArrayList<>();
		for (Event e : events) {
			if (e.getDate().equals(date)) {
				eventsByDate.add(e);
			}
		}
		return eventsByDate;
	}
	
	public int getNumberEvents() {
		return events.size();
	}
	
	public void clearEvents() {
		events.clear();
	}
	
	public String getFormattedList() {
		String formattedList = getTitle() + "\n";
		
		sortEvents();
		
		for (Event e : events) {
			formattedList += e.getFormattedDate() + " - " + e.getTitle() + "\n";
		}
		
		return formattedList;
	}
	
	private void sortEvents() {
		events.sort((e1, e2) -> e1.getDate().compareTo(e2.getDate()));
	}

	@Override
	public String toString() {
		return getFormattedList();
	}
}
