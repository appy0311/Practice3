//Arpita 6/3/2015

import java.util.Scanner;
public class PersonApp {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
	
	do
	{
		System.out.println("Create customer or employee?: ");
		String selection = sc.next();
		
		
		if(selection.equalsIgnoreCase("C"))
		{
			Customer cus = new Customer();
			System.out.println("You entered: " + cus.getDisplayText() +"\n");
		}
		else if(selection.equalsIgnoreCase("E"))
		{
			Employee emp = new Employee();
			System.out.println("You entered: " + emp.getDisplayText() +"\n");
		}
		System.out.println("do you want to continue y/n: ");
		
	}while(!sc.next().equalsIgnoreCase("n"));
}
}