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
	public void display_9_as_nine() {
		assertEquals("NINE ", new PositiveIntegers().inWords(9));
	}

	@Test
	public void display_10_as_ten() {
		assertEquals("TEN ", new PositiveIntegers().inWords(10));
	}

	@Test
	public void display_19_as_ninteen() {
		assertEquals("NINETEEN ", new PositiveIntegers().inWords(19));
	}

	@Test
	public void display_20_as_twenty() {
		assertEquals("TWENTY ", new PositiveIntegers().inWords(20));
	}

	@Test
	public void display_from_11_to_18() {
		int[] range = { 11, 12, 13, 14, 15, 16, 17, 18 };
		String[] word = { "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ",
				"EIGHTEEN " };
		String[] expected = new String[8];
		int index = 0;
		for (int input : range) {
			expected[index] = new PositiveIntegers().inWords(input);
			index = index + 1;
		}
		assertEquals(word, expected);
	}

	@Test
	public void display_21_as_twentyone() {
		assertEquals("TWENTY ONE ", new PositiveIntegers().inWords(21));
	}

	@Test
	public void display_22_as_twentytwo() {
		assertEquals("TWENTY TWO ", new PositiveIntegers().inWords(22));
	}

	@Test
	public void display_29_as_twentynine() {
		assertEquals("TWENTY NINE ", new PositiveIntegers().inWords(29));
	}

	@Test
	public void display_30_as_Thrity() {
		assertEquals("THIRTY ", new PositiveIntegers().inWords(30));
	}
	@Test
	public void display_40_as_Forty() {
		assertEquals("FORTY ", new PositiveIntegers().inWords(40));
	}
}
