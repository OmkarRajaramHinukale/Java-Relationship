package com.jsp.theatre;

public class Theatre {
	private String name;
	private Ticket ticket;
	public Theatre(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public void bookTicket(int n) {
		if(n!=0 && n<=ticket.getSeat_availability()){
		int a=ticket.getSeat_availability();
		int res=a-n;
		ticket.setSeat_availability(res);
		System.out.println("No.of Ticket booked:"+n+"Next slot available: "+ticket.getSeat_availability());
	}else {
		System.out.println("Not booked");
	}
	}
	public void cancelTicket(int n) {
		if(n!=0) {
			int a=ticket.getSeat_availability();
			int res=a+n;
			ticket.setSeat_availability(res);
			System.out.println("Booking cancelled and available left: "+ticket.getSeat_availability());
		}else {
			System.out.println("Not cancelled");
		}
	}
	public void checkStatus() {
		System.out.println("Ticket available are: "+ticket.getSeat_availability());
	}
	
}
