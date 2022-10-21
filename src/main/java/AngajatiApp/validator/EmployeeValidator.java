package AngajatiApp.validator;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;

public class EmployeeValidator {

	public boolean isValid(Employee employee) {
		return isFirstNameValid(employee) 
				&& isLastNameValid(employee) 
				&& isCnpValid(employee) 
				&& isFunctionValid(employee) 
				&& isSalaryValid(employee);
	}

	private boolean isSalaryValid(Employee employee) {
		return employee.getSalary() > 0;
	}

	private boolean isFunctionValid(Employee employee) {
		return employee.getFunction().equals(DidacticFunction.ASISTENT)
				|| employee.getFunction().equals(DidacticFunction.LECTURER) 
				|| employee.getFunction().equals(DidacticFunction.TEACHER) 
				|| employee.getFunction().equals(DidacticFunction.CONFERENTIAR)
		        || employee.getFunction().equals(DidacticFunction.BISNITAR);
	}

	private boolean isCnpValid(Employee employee) {
		boolean validare = false;
		int year = Integer.parseInt(employee.getCnp().substring(1,3));
		if (year > 60 || year <22){validare = true;}
		return employee.getCnp().matches("[a-z0-9]+") && (employee.getCnp().length() == 13) && validare;
	}

	private boolean isLastNameValid(Employee employee) {
		return employee.getLastName().matches("[a-zA-Z]+") && (employee.getLastName().length() > 2);
	}

	private boolean isFirstNameValid(Employee employee) {
		return employee.getFirstName().matches("[a-zA-Z]+") && (employee.getFirstName().length() > 2);
	}
	
}
