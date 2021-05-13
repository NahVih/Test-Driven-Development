package au.com.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {

	private String name;
	private BigDecimal salary;

	public Employee(String string, BigDecimal bigDecimal) {
		this.name = string;
		this.salary = bigDecimal;
	}

	public Object getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal finalSalary) {
		this.salary = ((BigDecimal) this.getSalary()).add(finalSalary).setScale(2, RoundingMode.HALF_UP);		
	}

	public String getName() {
		return name;
	}

}
