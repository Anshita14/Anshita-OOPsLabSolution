package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface ICredentialsService {
	String generatePassword();

	String getEmailAddress(String firstName, String lastName, String department);

	void showCredentials(Employee employee, String email, String generatePassword);

}
