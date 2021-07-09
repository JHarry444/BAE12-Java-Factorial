package com.qa.factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

	private Factorial fact = new Factorial();

	@Test
	public void testFactorial() {
		String expected = "120 = 5!";
		String actual = fact.factorial(120);

		assertEquals(expected, actual);
	}

	@Test
	public void testFactorial39916800() {
		String expected = "39916800 = 11!";
		String actual = fact.factorial(39916800);

		assertEquals(expected, actual);
	}

	@Test
	public void testNoFactorial() {
		String expected = "150 NONE";
		String actual = fact.factorial(150);

		assertEquals(expected, actual);
	}

}
