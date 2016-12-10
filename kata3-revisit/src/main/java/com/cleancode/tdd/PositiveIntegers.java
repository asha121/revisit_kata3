package com.cleancode.tdd;

import static com.cleancode.tdd.NumberFactory.getInstance;

import com.cleancode.tdd.NumberFactory.Name;

public class PositiveIntegers {

	public String inWords(int input) {
		String words = "";
		if (input < 20) {
			words = getInstance(Name.LESS_THAN_TWENTy).inWords(input);
		} else if (input < 100) {
			words = getInstance(Name.LESS_THAN_HUNDRED).inWords(input);
		} else if (input < 1000) {
			words = getInstance(Name.LESS_THAN_THOUSAND).inWords(input);
		} else {
			words = getInstance(Name.GREATER_THAN_THOUSAND).inWords(input);
		}

		return words;
	}
}
