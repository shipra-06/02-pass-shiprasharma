package com.assigment.maven.first_project;


	import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

	public class AdvanceCalculatorTest {
		AdvanceCalculator ac = new AdvanceCalculator();
		
		public static final Logger LOGGER =  Logger.getLogger(AdvanceCalculatorTest.class.getName());
		
		
		Random random = new Random();
		
		
		@Test
		public void positivesquareTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = random.nextDouble()*1;
					double tempResult = tempValue1*tempValue1;
					LOGGER.info("Testing square with  number 1:: "+ tempValue1);
					assertEquals(ac.square(tempValue1), tempResult,0);
				}
				
			
		}
		
		@Test
		public void negativesquareTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = random.nextDouble()*(-1);
					double tempResult = tempValue1*tempValue1;
					LOGGER.info("Testing square with  number 1:: "+ tempValue1);
					assertEquals(ac.square(tempValue1), tempResult,0);
				}
		}
		@Test
		public void zerosquareTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = 0;
					double tempResult = 0;
					LOGGER.info("Testing square with  number 1:: "+ tempValue1);
					assertEquals(ac.square(tempValue1), tempResult,0);
				}
		}
				
				
				
		@Test
		public void positiverootTest() {
			for (int i = 0; i < 10; i++) {
				double tempValue1 = random.nextDouble()*10;
				double tempResult = Math.sqrt(tempValue1);
				LOGGER.info("Testing root with  number 1:: "+ tempValue1);
				assertEquals(ac.root(tempValue1), tempResult,0);
			}
		}
		
		@Test
		public void negativerootTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = random.nextDouble()*(-10);
					double tempResult = Math.sqrt(tempValue1);
					LOGGER.info("Testing root with  number 1:: "+ tempValue1);
					assertEquals(ac.root(tempValue1), tempResult,0);
				}
		}
		
		@Test
		public void zerorootTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = 0;
					double tempResult = 0;
					LOGGER.info("Testing root with  number 1:: "+ tempValue1);
					assertEquals(ac.root(tempValue1), tempResult,0);
				}
		}
		@Test
		public void positivecuberootTest() {
			for (int i = 0; i < 10; i++) {
				double tempValue1 = random.nextDouble()*(10);
				double tempResult = Math.cbrt(tempValue1);
				LOGGER.info("Testing cuberoot with  number 1:: "+ tempValue1);
				assertEquals(ac.cuberoot(tempValue1), tempResult,0);
			}
		}
		
		@Test
		public void negativecuberootTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = random.nextDouble()*(-10);
					double tempResult = Math.cbrt(tempValue1);
					LOGGER.info("Testing cuberoot with  number 1:: "+ tempValue1);
					assertEquals(ac.cuberoot(tempValue1), tempResult,0);
				}
		}
		
		@Test
		public void zerocuberootTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = 0;
					double tempResult = 0;
					LOGGER.info("Testing cuberoot with  number 1:: "+ tempValue1);
					assertEquals(ac.cuberoot(tempValue1), tempResult,0);
				}
		}
		
		@Test
		public void positivecubeTest() {
			for (int i = 0; i < 10; i++) {
				double tempValue1 = random.nextDouble()*(10);
				double tempResult = tempValue1*tempValue1*tempValue1;
				LOGGER.info("Testing cube with  number 1:: "+ tempValue1);
				assertEquals(ac.cube(tempValue1), tempResult,0);
			}
		}
		
		@Test
		public void negativecubeTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = random.nextDouble()*(-10);
					double tempResult = tempValue1*tempValue1*tempValue1;
					LOGGER.info("Testing cube with  number 1:: "+ tempValue1);
					assertEquals(ac.cube(tempValue1), tempResult,0);
				}
		}
		
		@Test
		public void zerocubeTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = 0;
					double tempResult = 0;
					LOGGER.info("Testing cube with  number 1:: "+ tempValue1);
					assertEquals(ac.cube(tempValue1), tempResult,0);
				}
		}
		@Test
		public void positivelogTest() {
			for (int i = 0; i < 10; i++) {
				double tempValue1 = random.nextDouble()*(10);
				double tempResult = Math.log(tempValue1);
				LOGGER.info("Testing Log with  number 1:: "+ tempValue1);
				assertEquals(ac.log(tempValue1), tempResult,0);
			}
		}
		@Test
		public void negativelogTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = random.nextDouble()*(-10);
					double tempResult = Math.log(tempValue1);
					LOGGER.info("Testing Log with  number 1:: "+ tempValue1);
					assertEquals(ac.log(tempValue1), tempResult,0);
				}
		}
		
		@Test
		public void zerologTest() {
				for (int i = 0; i < 10; i++) {
					double tempValue1 = 0;
					double tempResult = Math.log(tempValue1);
					LOGGER.info("Testing Log with  number 1:: "+ tempValue1);
					assertEquals(ac.log(tempValue1), tempResult,0);
				}
		}
	}
		
