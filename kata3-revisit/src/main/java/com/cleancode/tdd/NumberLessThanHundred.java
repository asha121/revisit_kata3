package com.cleancode.tdd;

public class NumberLessThanHundred extends NumberLessThanTwenty implements PositveNumber {
	String[] tySeries = { "", "", "TWENTY ", "THIRTY ", "FORTY ", "FIFTY ", "SIXTY ", "SEVENTY ", "EIGHTY ",
			"NINETY " };

	@Override
	public String inWords(int input) {
		return tySeries[input / 10] + super.inWords(input % 10);
	}

}
