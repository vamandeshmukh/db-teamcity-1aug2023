package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	Calc calc = new Calc();

	@Test
	public void testAddNums() {
		Integer expected = 10;
		Integer actual = calc.addNums(5, 5);
		assertEquals(expected, actual);

	}

	@Test
	public void testAddNums2() {
		assertEquals(20, calc.addNums(10, 10));
	}
}
