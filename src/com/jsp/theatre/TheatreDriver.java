package com.jsp.theatre;
import java.util.Scanner;
public class TheatreDriver {

	public static void main(String[] args) {
		Theatre theatre=new Theatre("INOX");
		theatre.setTicket(new Ticket("KGF"));
		System.out.println("Name of theatre: "+theatre.getName());
		System.out.println("Name of movie: "+theatre.getTicket().getName());
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("1.book ticket 2. Cancel 3.Check status 4. Exit");
			int n=sc.nextInt();
			
			switch(n) {
			case 1:{
				System.out.println("Enter the no.of ticket to be booked");
				int m=sc.nextInt();
				theatre.bookTicket(m);
			}break;
			case 2:{
				System.out.println("Enter no.of ticket to be cancelled");
				int m=sc.nextInt();
				theatre.cancelTicket(m);
			}break;
			case 3:{
				theatre.checkStatus();
			}break;
			case 4:{
				flag=false;
			}break;
			default:{
				System.out.println("Invalid choice");
			}
			}
		}
	}

}
