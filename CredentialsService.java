package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialsService implements ICredentialsService{

	@Override
	public String generatePassword() {

			String capitalLetters ="ABCDEFGHIJKLMN"; 
			String smallCaseLetters ="abcdefghijklmnopqr";
            String numbers = "0123456789";
            String specialCharacters = "1@#%$*_<>"; 
            String values = capitalLetters + smallCaseLetters + numbers + specialCharacters;
			// randomly select a combination of all these different type of characters
            StringBuffer strBuffer = new StringBuffer("");
            Random random = new Random();
            int randomCharacter = 0;
			for(int index=0; index<7; index++) {
				randomCharacter = random.nextInt(values.length());
				strBuffer.append(values.charAt(randomCharacter));
			}
			randomCharacter = random.nextInt(specialCharacters.length());
			strBuffer.append(specialCharacters.charAt(randomCharacter));
			return strBuffer.toString();
			}
		      
	

	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		return firstName.trim() + lastName.trim() + "@" + department.toLowerCase() + "abc.com";
				
	}

	@Override
	public void showCredentials(Employee employee, String email, String generatePassword) {
	  System.out.println("Dear"+employee.getFirstName() + " your generated credentials are as follows ");
	 System.out.println("Email -> " +email);
	 System.out.println("Password ->" + generatePassword);
	}



	
}
