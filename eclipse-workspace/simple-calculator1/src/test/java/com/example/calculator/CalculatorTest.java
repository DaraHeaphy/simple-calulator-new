package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(5, Calculator.add(2,  3));
		assertEquals(10, Calculator.add(5,  5));
	}

}
