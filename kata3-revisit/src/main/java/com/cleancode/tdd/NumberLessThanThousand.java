package com.cleancode.tdd;

public class NumberLessThanThousand extends NumberLessThanHundred implements PositveNumber {

	@Override
	public String inWords(int input) {
		String[] tySeries = { "HUNDRED " };
		String and = (input % 100 > 0) ? "AND " : "";
		return lessThanTwenty[input / 100] + tySeries[0] + and + super.inWords(input % 100);
	}

}
