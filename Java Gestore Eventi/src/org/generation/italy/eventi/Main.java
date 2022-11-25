package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter event title: ");
		String title = sc.next();
		
		System.out.println("--------------------");
		
		System.out.print("Enter date of the event [aaaa-mm-dd]: ");
		String dateStr = sc.next();
		LocalDate date = LocalDate.parse(dateStr);
		
		System.out.println("--------------------");
		
		System.out.print("Enter total seat number: ");
		int totalSeatNumber = sc.nextInt();
		
		System.out.println("--------------------\n");
		
		Event event1 = null;
		try {
			event1 = new Event(title, date, totalSeatNumber);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println(event1 == null ? "The event could not be created" : event1);
		}
	}

}
