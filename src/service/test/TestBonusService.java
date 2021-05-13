package service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import au.com.Service.Employee;
import au.com.Service.Score;
import au.com.Service.ServiceBonus;

class TestBonusService {

	private ServiceBonus service;
	private Employee employee;
	
	@BeforeEach
	public void initializing() {
		this.service = new ServiceBonus();
	}
	
	@Test
	public void howBonusServiceShouldWork1() {
		this.employee = new Employee ("Nat", new BigDecimal("1000"));

		service.giveBonus(employee, Score.AMAZING);
		
		assertEquals(new BigDecimal("1030.00"), employee.getSalary());
	}
	@Test
	public void howBonusServiceShouldWork2() {
		this.employee = new Employee ("Nat", new BigDecimal("1000"));

		service.giveBonus(employee, Score.EXCELLENT);
		
		assertEquals(new BigDecimal("1050.00"), employee.getSalary());
	}
	@Test
	public void howBonusServiceShouldWork3() {
		this.employee = new Employee ("Nat", new BigDecimal("1000"));

		service.giveBonus(employee, Score.BAD);
		
		assertEquals(new BigDecimal("1010.00"), employee.getSalary());
	}

	@Test
	public void howBonusServiceShouldWork4() {
		this.employee = new Employee ("Nat", new BigDecimal("1000"));

		employee.setSalary(new BigDecimal("11000.00"));
		assertThrows(IllegalArgumentException.class,
				() -> service.giveBonus(employee, Score.BAD));

	}
	
	@Test
	public void howBonusServiceShouldWork5() {
		assertThrows(IllegalArgumentException.class, () -> this.employee = new Employee ("Nat", new BigDecimal("-1000")));
		
	}
	
	@Test
	public void howBonusServiceShouldWork6() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				Employee employee = new Employee ("Nat", new BigDecimal("-1000"));
				
			}
		});
		
	}

}
