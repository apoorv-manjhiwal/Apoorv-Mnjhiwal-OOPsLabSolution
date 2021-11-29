package service;

import java.util.Scanner;

import model.Employee;

public class Driver {

	public static void main(String[] args) {
		Employee employee = new Employee("apoorv", "manjhiwal");
		Scanner sc = new Scanner(System.in);
		
				
		String FirstName;
		String LastName;
 
		

		System.out.println("enter your first name");
		FirstName = sc.nextLine();

		System.out.println("enter your last name"); 
		LastName = sc.nextLine();
		
		

		
			System.out.println("Enter the department you want to go");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");

			int option = sc.nextInt();
			Credential cs = new Credential();
			String generatedEmail;
			char[] generatedPassword;
			if (option ==1) {
				generatedEmail = cs.generateEmail(employee.getFirstname().toLowerCase(), employee.getLastName().toLowerCase(), "Technical");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(employee, generatedEmail, generatedPassword);
			} else if (option == 2) {
				generatedEmail = cs.generateEmail(employee.getFirstname().toLowerCase(), employee.getLastName().toLowerCase(), "Admin");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(employee, generatedEmail, generatedPassword);
				
			
			} else if (option ==3) {
				generatedEmail = cs.generateEmail(employee.getFirstname().toLowerCase(), employee.getLastName().toLowerCase(), "Human resource");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(employee, generatedEmail, generatedPassword);

			} else if (option == 4) {
				generatedEmail = cs.generateEmail(employee.getFirstname().toLowerCase(), employee.getLastName().toLowerCase(), "Legal");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(employee, generatedEmail, generatedPassword);
				
			} else {
				System.out.println("enter valid option");
			}

}
}
