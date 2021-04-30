package com.assigment.maven.first_project;

public class AdvanceCalculator extends BasicCalculator implements AdvanceOperation {

	@Override
	public double square(double firstnumber) {
		double square = firstnumber * firstnumber;
		System.out.println("The square of the number: "+ square);
		return square;
	}

	@Override
	public double root(double firstnumber) {
		double sqroot = Math.sqrt(firstnumber);
		System.out.println("The square Root of the number: "+ sqroot);
		return sqroot;
	}

	@Override
	public double cuberoot(double firstnumber) {
		double cqroot = Math.cbrt(firstnumber);
		System.out.println("The cube Root of the number: "+ cqroot);
		return cqroot;
		
	}

	@Override
	public double cube(double firstnumber) {
		double cube = firstnumber * firstnumber * firstnumber;
		System.out.println("The cube of the number: "+ cube);
		return cube;
		
	}

	@Override
	public double log(double firstnumber) {
		double log = Math.log(firstnumber);
		System.out.println("The Log of the number: "+ log);
		return log;
	}
	

}
