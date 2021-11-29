package model;

public class Employee {
	private String FirstName;
	private String LastName;
	
	 

	public Employee(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
		
	}
	
	public String getFirstname() {
		return this.FirstName;
		
	}
	
	public String getLastName() {
		return this.LastName;
		
	}


	public String getfirstName() {
		// TODO Auto-generated method stub
		return null;
	}


}
