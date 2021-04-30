package com.assigment.maven.first_project;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class TestExampleTest {

	TestExample testExample = new TestExample();
	Random random = new Random();
	
	@Test
	public void testAdd1() {
		int temRandomValue =0;
		int temResult =0;
		
		temRandomValue = random.nextInt(10);
		System.out.println("tempRandomvalue"+ temRandomValue);
		temResult= temRandomValue+1;
		System.out.println("temResult"+ temResult);
		System.out.println("method called output"+ testExample.add1(temRandomValue));
			assertEquals(testExample.add1(temRandomValue), temResult,0);
		
	}
	
}
