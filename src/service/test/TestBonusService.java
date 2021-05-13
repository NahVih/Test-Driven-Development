package service.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

import au.com.Service.Employee;
import au.com.Service.Score;
import au.com.Service.ServiceBonus;

class TestBonusService {

	@Test
	public void howBonusServiceShouldWork1() {
		ServiceBonus service = new ServiceBonus();
		Employee employee = new Employee ("Nat", new BigDecimal(1000));
		service.giveBonus(employee, Score.AMAZING);
		
		assertEquals(new BigDecimal("1030.00"), employee.getSalary());
	}
	@Test
	public void howBonusServiceShouldWork2() {
		ServiceBonus service = new ServiceBonus();
		Employee employee = new Employee ("Vinicius", new BigDecimal(1000));
		service.giveBonus(employee, Score.EXCELLENT);
		
		assertEquals(new BigDecimal("1050.00"), employee.getSalary());
	}
	@Test
	public void howBonusServiceShouldWork3() {
		ServiceBonus service = new ServiceBonus();
		Employee employee = new Employee ("Vittor", new BigDecimal(1000));
		service.giveBonus(employee, Score.BAD);
		
		assertEquals(new BigDecimal("1010.00"), employee.getSalary());
	}

}
