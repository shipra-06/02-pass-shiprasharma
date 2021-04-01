package com.assigment.maven.first_project;


	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	public class AdvanceCalculatorTest {
		AdvanceCalculator ac = new AdvanceCalculator();
		
		
		@Test
		public void squareTest() {
			assertEquals(ac.square(4), 16,0);
		}
		@Test
		public void rootTest() {
			assertEquals(ac.root(16), 4,0);
		}
		@Test
		public void cuberootTest() {
			assertEquals(ac.cuberoot(125), 5,0);
		}
		@Test
		public void cubeTest() {
			assertEquals(ac.cube(5),125,0);
		}
		@Test
			public void logTest() {
				assertEquals(ac.cube(5),125,0);
		}
}
