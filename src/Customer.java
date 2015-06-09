//Arpita 6/3/2015
public class Customer extends Person {
	
	
	private String customerNumber;
	
	public Customer()
	{
		details();
		System.out.println("Enter the customer number: ");
		this.setCustomerNumber(sc.next());
	}
	
	@Override
	public String getDisplayText() {
		// TODO Auto-generated method stub
		
		String message = toString() +
		"customer number: " + getCustomerNumber() +"\n";
		return message;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

}
