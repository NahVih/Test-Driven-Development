package au.com.Service;

import java.math.BigDecimal;

public class ServiceBonus {

	public void giveBonus(Employee employee, Score score) {
			BigDecimal finalSalary = ((BigDecimal) employee.getSalary()).multiply(score.bonusAmount());
			employee.setSalary(finalSalary);
	}
			
	
	
}
