package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.List; -> active for MILESTONE3
//import java.util.Scanner; -> active for MILESTONE2

public class Main {

	public static void main(String[] args) {

//		MILESTONE2
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter event title: ");
//		String title = sc.next();
//		
//		System.out.println("--------------------");
//		
//		System.out.print("Enter date of the event [aaaa-mm-dd]: ");
//		String dateStr = sc.next();
//		LocalDate date = LocalDate.parse(dateStr);
//		
//		System.out.println("--------------------");
//		
//		System.out.print("Enter total seat number: ");
//		int totalSeatNumber = sc.nextInt();
//		
//		System.out.println("--------------------\n");
//		
//		Event event1 = null;
//		try {
//			event1 = new Event(title, date, totalSeatNumber);
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		} finally {
//			System.out.println(event1 == null ? "The event could not be created" : event1);
//		}
//		
//		System.out.println("\n--------------------\n");
//		
//		
//		if(event1 != null) {
//			boolean exit = false;
//			while(!exit) {
//			
//				System.out.println("Choose an option to perform the operation" 
//					+ "\n1 - reserve"
//					+ "\n2 - cancel"
//					+ "\n3 - exit");
//				
//				String userChoice = sc.next();
//				
//				if (userChoice.equals("1")) {
//					System.out.println("How many reservations do you want to make? ");
//					int numberReservation = sc.nextInt();
//		
//					for (int i = 0; i < numberReservation; i++) {
//						try {
//							event1.reserve();
//						} catch (Exception e) {
//							System.err.println(e.getMessage());;
//						}
//					}
//		
//					System.out.println( "\nEvent title: " + event1.getTitle()
//										+"\nReserved seats: " + event1.getReservedSeatNumber() 
//										+ "\nAvailable seats: " + (event1.getTotalSeatNumber() - event1.getReservedSeatNumber()) + "\n");
//				}
//				
//				if(userChoice.equals("2")) {
//					System.out.println("How many cancellations do you want to make? ");
//					int numberCancellation = sc.nextInt();
//		
//					for (int i = 0; i < numberCancellation; i++) {
//						try {
//							event1.cancel();
//						} catch (Exception e) {
//							System.err.println(e.getMessage());;
//						}
//					}
//		
//					System.out.println("\nEvent title: " + event1.getTitle()
//										+"\nReserved seats: " + event1.getReservedSeatNumber() 
//										+ "\nAvailable seats: " + (event1.getTotalSeatNumber() - event1.getReservedSeatNumber()) + "\n");
//				}
//				
//				if (!userChoice.equals("1") && !userChoice.equals("2") || userChoice.equals("3")) {
//					System.out.println("\nYou have exited from the system, here are the results");
//					
//					System.out.println("\nEvent title: " + event1.getTitle()
//										+"\nReserved seats: " + event1.getReservedSeatNumber() 
//										+ "\nAvailable seats: " + (event1.getTotalSeatNumber() - event1.getReservedSeatNumber()));
//					exit = true;
//				}
//				
//			}
//		}
//		
//		sc.close();
		
		
//		MILESTONE3
//		
//		Event event1 = null;
//		Event event2 = null;
//		Event event3 = null;
//		Event event4 = null;
//		Event event5 = null;
//		
//		try {
//			event1 = new Event("Sagra", LocalDate.parse("2023-06-23"), 50 );
//			event2 = new Event("Fiera", LocalDate.parse("2023-11-11"), 70 );
//			event3 = new Event("Cinema", LocalDate.parse("2023-05-15"), 100 );
//			event4 = new Event("Concerto", LocalDate.parse("2023-04-02"), 200 );
//			event5 = new Event("Mondiali", LocalDate.parse("2023-11-11"), 5000 );
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//		
//		ProgrammEvents pe = new ProgrammEvents("TOP EVENTS");
//		pe.addEvent(event1);
//		pe.addEvent(event2);
//		pe.addEvent(event3);
//		pe.addEvent(event4);
//		pe.addEvent(event5);
//		System.out.println(pe);
//		
//		List<Event> eventOf11November = pe.getEventsByDate(LocalDate.parse("2023-11-11"));
//		
//		System.out.println("Events scheduled for November 11th: " + eventOf11November);
//		
//		System.out.println("Number of events in the program: " + pe.getNumberEvents());
//		
//		pe.clearEvents();
//		System.out.println("Number of events present in the program after clear: " + pe.getNumberEvents());
		
		
//		MILESTONE4
		Concert concert = null;
		try {
			concert = new Concert("Gigi D'Alessio", LocalDate.parse("2023-06-07"), 400, LocalTime.parse("20:00"), BigDecimal.valueOf(39.90));
			
			// reserve 250 seats on 400
			for(int i = 0; i < 250; i++ ) {
				concert.reserve();				
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(concert);
		System.out.println("\nAvailable seat: " + concert.getAvailableSeat());
		
		try {
			// cancel 20 seats
			for(int i = 0; i < 20; i++ ) {
				concert.cancel();				
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("\nAvailable seat: " + concert.getAvailableSeat());
		
	}

}
