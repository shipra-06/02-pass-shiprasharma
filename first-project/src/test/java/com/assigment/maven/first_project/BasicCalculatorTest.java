package com.assigment.maven.first_project;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	
	public static final Logger LOGGER =  Logger.getLogger(BasicCalculatorTest.class.getName());
	
	BasicCalculator bc = new BasicCalculator();
	Random random = new Random();
	
	@Test
	public void positiveadditionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = random.nextDouble()*10;
			double tempValue2 = random.nextDouble()*10;
			double tempResult = tempValue1 + tempValue2;
			LOGGER.info("Testing addition with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing addition with number 2:: "+ tempValue2);
			assertEquals(bc.addition(tempValue1,tempValue2), tempResult,0);
		}
		
	}
	@Test
	public void negativeadditionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = random.nextDouble()*(-10);
			double tempValue2 = random.nextDouble()*(-10);
			double tempResult = tempValue1 + tempValue2;
			LOGGER.info("Testing addition with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing addition with number 2:: "+ tempValue2);
			assertEquals(bc.addition(tempValue1,tempValue2), tempResult,0);
		}
	}
	@Test
	public void ZeroadditionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = 0;
			double tempValue2 = 0;
			double tempResult = tempValue1 + tempValue2;
			LOGGER.info("Testing addition with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing addition with number 2:: "+ tempValue2);
			assertEquals(bc.addition(tempValue1,tempValue2), tempResult,0);
		}
	}
		
	@Test
	public void positivesubstractionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = random.nextDouble()*10;
			double tempValue2 = random.nextDouble()*10;
			double tempResult = tempValue1 - tempValue2;
			LOGGER.info("Testing substraction with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing substraction with number 2:: "+ tempValue2);
			assertEquals(bc.substraction(tempValue1,tempValue2), tempResult,0);
		}
			
	
	}
	@Test
	public void negativesubstractionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = random.nextDouble()*(-10);
			double tempValue2 = random.nextDouble()*(-10);
			double tempResult = tempValue1 - tempValue2;
			LOGGER.info("Testing substraction with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing substraction with number 2:: "+ tempValue2);
			assertEquals(bc.substraction(tempValue1,tempValue2), tempResult,0);
		}
			
	}
	@Test
	public void zerosubstractionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = 0;
			double tempValue2 = 0;
			double tempResult = tempValue1 - tempValue2;
			LOGGER.info("Testing substraction with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing substraction with number 2:: "+ tempValue2);
			assertEquals(bc.substraction(tempValue1,tempValue2), tempResult,0);
		}
			
	
	}
	@Test
	public void positivemultiplicationTest() {
		for (int i = 0; i < 10; i++) {
		double tempValue1 = random.nextDouble()*10;
		double tempValue2 = random.nextDouble()*10;
		double tempResult = tempValue1 * tempValue2;
		LOGGER.info("Testing multiplication with  number 1:: "+ tempValue1);
		LOGGER.info(" Testing multiplication with number 2:: "+ tempValue2);
		assertEquals(bc.multiplication(tempValue1,tempValue2), tempResult,0);
	}

	}
	@Test
	public void neagtivemultiplicationTest() {
		for (int i = 0; i < 10; i++) {
		double tempValue1 = random.nextDouble()*(-10);
		double tempValue2 = random.nextDouble()*(-10);
		double tempResult = tempValue1 * tempValue2;
		LOGGER.info("Testing multiplication with  number 1:: "+ tempValue1);
		LOGGER.info(" Testing multiplication with number 2:: "+ tempValue2);
		assertEquals(bc.multiplication(tempValue1,tempValue2), tempResult,0);
	}

	}
	@Test
	public void zeromultiplicationTest() {
		for (int i = 0; i < 10; i++) {
		double tempValue1 = 0;
		double tempValue2 = 0;
		double tempResult = tempValue1 * tempValue2;
		LOGGER.info("Testing multiplication with  number 1:: "+ tempValue1);
		LOGGER.info(" Testing multiplication with number 2:: "+ tempValue2);
		assertEquals(bc.multiplication(tempValue1,tempValue2), tempResult,0);
	}

	}
	
	@Test
	public void positivedivisionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = random.nextDouble()*10;
			double tempValue2 = random.nextDouble()*10;
			double tempResult = tempValue1/tempValue2;
			LOGGER.info("Testing Division with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing Division with number 2:: "+ tempValue2);
			assertEquals(bc.division(tempValue1,tempValue2), tempResult,0);
		}
		
	}
	@Test
	public void negativedivisionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = random.nextDouble()*(-10);
			double tempValue2 = random.nextDouble()*(-10);
			double tempResult = tempValue1/tempValue2;
			LOGGER.info("Testing Division with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing Division with number 2:: "+ tempValue2);
			assertEquals(bc.division(tempValue1,tempValue2), tempResult,0);
		}
		
	}
	@Test
	public void zeropositivedivisionTest() {
		for (int i = 0; i < 10; i++) {
			double tempValue1 = 0;
			double tempValue2 = 0;
			double tempResult = tempValue1/tempValue2;
			LOGGER.info("Testing Division with  number 1:: "+ tempValue1);
			LOGGER.info(" Testing Division with number 2:: "+ tempValue2);
			assertEquals(bc.division(tempValue1,tempValue2), tempResult,0);
		}
		
	}
	

}
