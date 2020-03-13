package com.cts.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.calculator.CalculatorClass;

public class Calculator {

	private CalculatorClass calculator;

	@Before
	public void init() {
		calculator = new CalculatorClass();
		System.out.println("Object Created!!!");
	}

	@After
	public void destroy() {
		calculator = null;
		System.out.println("Object Destroyed");

	}
    @Ignore
	@Test
	public void test_add_success() {
		assertEquals(17, calculator.add(12, 5));

	}
    @Ignore
    
	@Test
	public void test_sub_success() {
		assertEquals(7, calculator.sub(12, 5));

	}
  @Ignore 
	@Test
	public void test_div_success() {
		assertEquals(4, calculator.div(20, 5));

	}
@Ignore
	@Test
	public void test_mul_success() {
		assertEquals(60, calculator.mul(12, 5));

	}
@Test
	public void test_to_check_prime_number_success() {
		assertEquals(true, calculator.isPrime(7));
	}   

}
