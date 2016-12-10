package com.cleancode.tdd;

public class NumberLessThanThousand extends NumberLessThanHundred implements PositveNumber {

	@Override
	public String inWords(int input) {
		String[] tySeries = { "HUNDRED " };
		return lessThanTwenty[input / 100] + tySeries[0] + super.inWords(input % 100);
	}

}
