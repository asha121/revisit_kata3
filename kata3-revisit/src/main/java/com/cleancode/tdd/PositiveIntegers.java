package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String words = "";
		PositveNumber integer;
		if (input < 20) {
			integer = new NumberLessThanTwenty();
			words = integer.inWords(input);
		} else if (input < 100) {
			integer = new NumberLessThanHundred();
			words = integer.inWords(input);
		} else if (input < 1000) {
			integer = new NumberLessThanThousand();
			words = integer.inWords(input);
		} else {
			integer = new NumbeGreaterOrThousand();
			words = integer.inWords(input);
		}

		return words;
	}
}
