package com.jsp.relation;

public class Address {
	private int room_no;
	private String village;
	private String city;
	private String state;
	public Address(int room_no, String village, String city, String state) {
		this.room_no = room_no;
		this.village = village;
		this.city = city;
		this.state = state;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void printAddress() {
		System.out.println("===========Address===========");
		System.out.println("Room no.: "+room_no);
		System.out.println("Village: "+village);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
	}
	

}
