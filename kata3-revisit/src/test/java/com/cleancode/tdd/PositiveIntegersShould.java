package com.cleancode.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PositiveIntegersShould {

	@Test
	public void display_1_as_one() {
		assertEquals("ONE ", new PositiveIntegers().inWords(1));
	}
}
