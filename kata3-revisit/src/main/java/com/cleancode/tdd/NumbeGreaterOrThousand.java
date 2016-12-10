package com.cleancode.tdd;

public class NumbeGreaterOrThousand extends NumberLessThanThousand implements PositveNumber {

	@Override
	public String inWords(int input) {
		String thousand = "THOUSAND ";
		String and = (input % 1000 > 0) ? "AND " + super.inWords(input % 1000) : super.inWords(input % 1000);
		return lessThanTwenty[input / 1000] + thousand + and;
	}

}
