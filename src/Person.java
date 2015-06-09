//Arpita 6/3/2015
import java.util.Scanner;

public abstract class Person {
	
	private String firstName;
	private String lastName;
	private String email;

	static Scanner sc = new Scanner(System.in);
	
	
	public void details()
	{
		System.out.println("Enter the first name: ");
		this.setFirstName(sc.next());
		System.out.println("Enter the last name: ");
		this.setLastName(sc.next());
		System.out.println("Enter the email adress: ");
		this.setEmail(sc.next());
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString()
	{
		String message = "Name: " + this.getFirstName() + "\t"+ this.getLastName()+"\n"+
						"email: " + this.getEmail()+"\n";
		return message;
	}
	
	abstract public String getDisplayText();
	
}
