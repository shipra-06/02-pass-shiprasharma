package com.assigment.maven.first_project;

public class BasicCalculator implements BasicOperation {

	@Override
	public double addition(double firstnumber, double secondnumber) {
		double add=firstnumber + secondnumber;
		System.out.println("Addition of the numbers:=" + add);
		return add;
	}

	@Override
	public double substraction(double firstnumber, double secondnumber) {
		double sub=firstnumber - secondnumber;
		System.out.println("substraction of the numbers:=" + sub);
		return sub;
		
	
	}

	@Override
	public double multiplication(double firstnumber, double secondnumber) {
		double mult=firstnumber * secondnumber;
		System.out.println("Multiplication of the numbers:=" + mult);
		return mult;
		
	}

	@Override
	public double division(double firstnumber, double secondnumber) {
		double div=firstnumber/ secondnumber;
		System.out.println("Division of the numbers:=" + div);
		return div;
		
	}

}
