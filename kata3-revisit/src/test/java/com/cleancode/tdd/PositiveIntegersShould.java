package com.cleancode.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PositiveIntegersShould {

	@Test
	public void display_1_as_one() {
		assertEquals("ONE ", new PositiveIntegers().inWords(1));
	}
	@Test
	public void display_2_as_two() {
		assertEquals("TWO ", new PositiveIntegers().inWords(2));
	}
	@Test
	public void display_9_as_NINE() {
		assertEquals("NINE ", new PositiveIntegers().inWords(9));
	}
}
