package com.cleancode.tdd;

public class NumberLessThanThousand extends NumberLessThanHundred implements PositveNumber {

	@Override
	public String inWords(int input) {
		String word = "";
		if (input > 0) {
			String hundred = "HUNDRED ";
			String and = (input % 100 > 0) ? "AND " : "";
			word = lessThanTwenty[input / 100] + hundred + and + super.inWords(input % 100);
		}
		return word;
	}

}
