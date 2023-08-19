package project;

import java.util.Scanner;
import java.text.ParseException;
import java.util.ArrayList;

public class App 
{
	public static void main(String[] args) throws ParseException 
	{
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		ArrayList<Bus> buses=new ArrayList<Bus>();
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,false,65));
		buses.add(new Bus(3,true,55));
		for(Bus b:buses) {
			System.out.println(b);
		}
		
		boolean loop=false;
		do
			try {
				{
					
					Scanner sc=new Scanner(System.in);
					System.out.println("1.Booking\n2.exit");
					int choice=sc.nextInt();
					switch(choice)
					{
					case 1:Booking booking=new Booking();
							if(booking.isAvailable(bookings, buses))
							{
								bookings.add(booking);
								System.out.println("your booking is completed...");
							}
							else
							{
								System.out.println("bus is full...try another bus or date...");
							}
							loop=true;
					case 2:	loop=false;	
					}
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		while(loop=true);
	}
}
