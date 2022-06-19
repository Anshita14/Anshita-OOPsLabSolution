package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class DriverClass {
	private static final CredentialsService credentialsService = new CredentialsService();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter your first name ");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name ");
		String lastName = sc.nextLine();
		Employee employee = new Employee(firstName, lastName); 
		
		String generatedEmail;
		String generatePassword;

		System.out.println("Enter the department no from the following ");
		System.out.println("1. Technical");
		System.out.println("2. HR");
		System.out.println("3. Admin");
		System.out.println("4. Legal");

		int departmentNumber = sc.nextInt();

		switch (departmentNumber) {
		case 1: {
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "Technical");
			generatePassword = credentialsService.generatePassword();
			credentialsService.showCredentials(employee, generatedEmail, generatePassword);
		}
			break;
		case 2: {
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "HR");
			generatePassword = credentialsService.generatePassword();
			credentialsService.showCredentials(employee, generatedEmail, generatePassword);
		}
            break;
		case 3: {
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "Admin");
			generatePassword = credentialsService.generatePassword();
			credentialsService.showCredentials(employee, generatedEmail, generatePassword);
		}   
		    break;
		case 4: {
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "Legal");
			generatePassword = credentialsService.generatePassword();
			credentialsService.showCredentials(employee, generatedEmail, generatePassword);
		}
		}
	}
}