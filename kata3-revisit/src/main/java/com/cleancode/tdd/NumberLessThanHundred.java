package com.cleancode.tdd;

public class NumberLessThanHundred extends NumberLessThanTwenty implements PositveNumber {
	@Override
	public String inWords(int input) {
		String[] twenty = { "", "", "TWENTY ", "THIRTY " };
		return twenty[input / 10] + super.inWords(input % 10);
	}
}
