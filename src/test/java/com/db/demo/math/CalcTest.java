package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

	@Test
	public void testAddNums3() {
		assertEquals(4, calc.addNums(2, 2));
	}

	@Test
	public void testAddNums4() {
		assertEquals(2, calc.addNums(1, 1));
	}

	@Test
	public void testAddNums5() {
		assertEquals(5, calc.addNums(2, 3));
	}

	@Test
	public void testAddNums6() {
		assertNotEquals(5, calc.addNums(2, 2));
	}
}
