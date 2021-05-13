package au.com.Service;

import java.math.BigDecimal;

public class ServiceBonus {

	public void giveBonus(Employee employee, Score score) {
		BigDecimal salary = employee.getSalary();
		if (salary.compareTo(new BigDecimal("10000")) < 0)	{
		BigDecimal finalSalary = score.bonusAmount().multiply(salary);
			employee.setSalary(finalSalary);
		} else
			throw new IllegalArgumentException ("Salary higher than 10.000");
	}
			
	
	
}
