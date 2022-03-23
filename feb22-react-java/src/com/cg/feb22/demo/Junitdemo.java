package com.cg.feb22.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.cg.feb22.junitdemo.JUnitDemo;

public class Junitdemo {

	@Test
	public void testAddNums() {
		JUnitDemo obj = new JUnitDemo();
		int expected = 30;
		int actual = obj.addNums(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddNums2() {
		JUnitDemo obj = new JUnitDemo();
		int unexpected = 40;
		int actual = obj.addNums(10, 20);
		assertNotEquals(unexpected, actual);
	}
}

