package com.jsp.theatre;

public class Ticket {
	private String name;
	private int seat_availability=500;
	public Ticket(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeat_availability() {
		return seat_availability;
	}
	public void setSeat_availability(int seat_availability) {
		this.seat_availability = seat_availability;
	}
	public void printTicket() {
		System.out.println("=======Ticket=========");
		System.out.println("Movie Name: "+name);
		System.out.println("Ticket available: "+seat_availability);
	}
	
}
