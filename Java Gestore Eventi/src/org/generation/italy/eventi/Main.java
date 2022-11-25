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
		
		System.out.println("\n--------------------\n");
		
		
		System.out.println("Choose an option to perform the operation" 
			+ "\n1 - reserve"
			+ "\n2 - cancel");
		
		String userChoice = sc.next();
		
		if (userChoice.equals("1")) {
			System.out.println("How many reservations do you want to make? ");
			int numberReservation = sc.nextInt();

			for (int i = 0; i < numberReservation; i++) {
				try {
					event1.reserve();
				} catch (Exception e) {
					System.err.println(e.getMessage());;
				}
			}

			System.out.println("Reserved seats: " + event1.getReservedSeatNumber() 
								+ "\nAvailable seats: " + (event1.getTotalSeatNumber() - event1.getReservedSeatNumber()));
		}
		
		if(userChoice.equals("2")) {
			System.out.println("How many cancellations do you want to make? ");
			int numberCancellation = sc.nextInt();

			for (int i = 0; i < numberCancellation; i++) {
				try {
					event1.cancel();
				} catch (Exception e) {
					System.err.println(e.getMessage());;
				}
			}

			System.out.println("Reserved seats: " + event1.getReservedSeatNumber() 
								+ "\nAvailable seats: " + (event1.getTotalSeatNumber() - event1.getReservedSeatNumber()));
		}
		
		sc.close();
	}

}
