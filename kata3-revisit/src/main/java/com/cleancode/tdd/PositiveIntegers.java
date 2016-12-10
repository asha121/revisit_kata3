package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String word = null;
		if (input == 1) {
			word = "ONE ";
		}else if (input == 2) {
			word = "TWO ";
		}
		return word;
	}

}
