

//Arpita 6/3/2015
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =5;
		int y = 10;
		
		int z = ++x * y -- ;
		System.out.printf("x =%d, y =%d,z=%d",x,y,z);
		
		System.out.println("1+2="+1+2);
		System.out.println("1+2="+(1+2));
		
		System.out.println(1+2+"abc");
		System.out.println("abc"+1+2);
		
		int year = 1944;
		
		if(year%4==0 && year%100!=0 || year%400==0 )
		{
			System.out.println("the year is a leap year");
			
		}
		else
		{
			System.out.println("Not a leap year");
		}
		
	}

}
