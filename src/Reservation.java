
//Arpita 6/3/2015

import java.util.Date;
import java.util.GregorianCalendar;

public class Reservation {

	public  static double rate = 115.00;
	static final int Mills_in_day = 24*60*60*1000;
		
		
	public Date get_date(int year, int month, int day)
		{
		
		Date d = new Date(year, month, day);
		
		return d;
		
		}

	public double get_total_price(long num_of_nights)
	{
		double total = num_of_nights * rate;
		
		return total;
	}
	
	public int get_num_nights(Date startDate, Date endDate)
	{
		
		long startDateMS =startDate.getTime();
		//System.out.println(startDateMS);
		long endDateMS =endDate.getTime();
		//System.out.println(endDateMS);
		long elapsedMS = endDateMS - startDateMS;
		//System.out.println(elapsedMS);
		return (int) elapsedMS /Mills_in_day;
		
		
	}
	
	
}