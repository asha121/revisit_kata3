package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String[] word = { null, "ONE ", "TWO ","THREE","FOUR ","FIVE ","SIX ","SEVEN ","EIGHT ","NINE ","TEN " };
		return word[input];
	}

}
