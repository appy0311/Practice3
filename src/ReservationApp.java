
// Arpita 6/3/2015
import java.text.DateFormat;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.*;

public class ReservationApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	do
	{
		
	// enter the arrival date
		
	System.out.println("Enter the arrival month(1-12): ");
	int month1 = sc.nextInt();
	System.out.println("Enter the arrival day(1-31): ");
	int day1 = sc.nextInt();
	System.out.println("Enter the arrival year: ");
	int year1 = sc.nextInt();
	
	// enter the departure date
	
	System.out.println("Enter the departure month(1-12): ");
	int month2 = sc.nextInt();
	System.out.println("Enter the departure day(1-31): ");
	int day2 = sc.nextInt();
	System.out.println("Enter the departure year: ");
	int year2 = sc.nextInt();
	
	// initialize the class
	Reservation res = new Reservation ();
	
	// get the price and number of nights
	
	Date startDate = res.get_date( year1, month1, day1);
	
	Date endDate = res.get_date( year2, month2, day2);
	
	int num_of_nights = res.get_num_nights(startDate,endDate);
	
	
	double total_price = res.get_total_price(num_of_nights);
	
	// print the output
	
	NumberFormat cf = NumberFormat.getCurrencyInstance();
	DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
	
	
	String message =
	            "Arrival date:        " + df.format(startDate) + "\n" +
	            "Departure date: " + df.format(endDate)+ "\n" +
	            "Price:       " + cf.format(total_price) + "\n"+
	            "Price per night: " + cf.format(Reservation.rate) + "\n" +
	            "do you want to continue?: ";
	
	System.out.println(message);
	} while (!sc.next().equalsIgnoreCase("n"));
	
	}

	
	}
	
