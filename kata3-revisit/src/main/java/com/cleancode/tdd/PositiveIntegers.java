package com.cleancode.tdd;

import com.cleancode.tdd.NumberFactory.Number;

public class PositiveIntegers {

	public String inWords(int input) {
		String words = "";
		if (input < 20) {
			words = Number.LESS_THAN_TWENTy.getInstance().inWords(input);
		} else if (input < 100) {
			words = Number.LESS_THAN_HUNDRED.getInstance().inWords(input);
		} else if (input < 1000) {
			words = Number.LESS_THAN_THOUSAND.getInstance().inWords(input);
			;
		} else {
			words = Number.GREATER_THAN_THOUSAND.getInstance().inWords(input);
		}

		return words;
	}
}
