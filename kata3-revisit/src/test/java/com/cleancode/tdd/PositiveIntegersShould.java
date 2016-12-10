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
	public void display_30_as_thrity() {
		assertEquals("THIRTY ", new PositiveIntegers().inWords(30));
	}

	@Test
	public void display_40_as_forty() {
		assertEquals("FORTY ", new PositiveIntegers().inWords(40));
	}

	@Test
	public void display_range_from_50_to_99() {
		int[] range = { 50, 60, 70, 80, 90, 98, 99 };
		String[] word = { "FIFTY ", "SIXTY ", "SEVENTY ", "EIGHTY ", "NINETY ","NINETY EIGHT ","NINETY NINE "  };
		String[] expected = new String[7];
		int index = 0;
		for (int input : range) {
			expected[index] = new PositiveIntegers().inWords(input);
			index = index + 1;
		}
		assertEquals(word, expected);
	}

	@Test
	public void display_100_as_one_hundred() {
		assertEquals("ONE HUNDRED ", new PositiveIntegers().inWords(100));
	}
	@Test
	public void display_101_as_one_hundred_one() {
		assertEquals("ONE HUNDRED ONE ", new PositiveIntegers().inWords(101));
	}
	@Test
	public void display_121_as_one_hundred_twenty_one() {
		assertEquals("ONE HUNDRED AND TWENTY ONE ", new PositiveIntegers().inWords(121));
	}
}
