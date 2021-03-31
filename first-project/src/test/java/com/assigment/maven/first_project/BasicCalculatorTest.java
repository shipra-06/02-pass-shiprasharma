package com.assigment.maven.first_project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	
	
	@Test
	public void additionTest() {
		assertEquals(bc.addition(2.2,8.1), 10.3,0);
	}
	@Test
	public void substractionTest() {
		assertEquals(bc.substraction(8.1,8.1), 0.0,0);
	}
	@Test
	public void multiplicationTest() {
		assertEquals(bc.multiplication(4, 3), 12,0);
	}
	@Test
	public void divisionTest() {
		assertEquals(bc.division(5, 5), 1,0);
	}
	

}
