package com.cleancode.tdd;

public class NumberThousandThreeDigit extends NumberLessThanThousand implements PositveNumber {
	final String place = "THOUSAND ";

	@Override
	public String inWords(int input) {

		return lessThanTwenty[input / 1000] + place + super.inWords(input % 1000);
	}
}
