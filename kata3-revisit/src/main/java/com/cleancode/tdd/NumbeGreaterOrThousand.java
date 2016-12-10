package com.cleancode.tdd;

public class NumbeGreaterOrThousand extends NumberLessThanThousand implements PositveNumber {

	@Override
	public String inWords(int input) {
		String thousand = "THOUSAND ";
		return lessThanTwenty[input / 1000] + thousand + super.inWords(input % 1000);
	}

}
