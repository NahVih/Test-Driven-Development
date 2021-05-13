package au.com.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {

	private String name;
	private BigDecimal salary;

	public Employee(String string, BigDecimal salary) {
		this.name = string;
		this.salary = salary;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal finalSalary) {
		this.salary = this.getSalary().add(finalSalary).setScale(2, RoundingMode.HALF_UP);		
	}

	public String getName() {
		return name;
	}

}
