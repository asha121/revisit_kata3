package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String words = "";
		if (input < 20) {
			words = NumberFactory.LESS_THAN_TWENTy.getInstance().inWords(input);
		} else if (input < 100) {
			words = NumberFactory.LESS_THAN_HUNDRED.getInstance().inWords(input);
		} else if (input < 1000) {
			words = NumberFactory.LESS_THAN_THOUSAND.getInstance().inWords(input);
			;
		} else {
			words = NumberFactory.GREATER_THAN_THOUSAND.getInstance().inWords(input);
		}

		return words;
	}
}
