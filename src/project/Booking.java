package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking 
{
	private String name;
	private int busNo;
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Booking() throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name : ");
		name=sc.next();
		System.out.println("Enter Bus Number : ");
		busNo=sc.nextInt();
		System.out.println("Enter The Date dd-mm-yyyy");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		date=dateFormat.parse(dateInput);
		
	}
	@Override
	public String toString() {
		return "Booking [name=" + name + ", busNo=" + busNo + ", date=" + date + "]";
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
	{
		int capacity=0;
		for(Bus bus:buses)
		{
			if(bus.getBusNo()==getBusNo());
			{
				capacity=bus.getCapacity();
			}
		}
		int booked = 0;
		for(Booking b:bookings)
		{
			if(b.getBusNo()==getBusNo() && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
	
	

}
