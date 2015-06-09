//Arpita 6/3/2015
public class Employee extends Person{
	
	private String Social;
	
	public Employee()
	{
		details();
		System.out.println("Enter the employee social: ");
		this.setSocial(sc.next());
	}

	@Override
	public String getDisplayText() {
		// TODO Auto-generated method stub
		
		String message = this.toString() +
		"social number:" + getSocial() + "\n";
		return message;
	}

	public String getSocial() {
		return Social;
	}

	public void setSocial(String social) {
		Social = social;
	}

}
