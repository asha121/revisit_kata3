package com.cleancode.tdd;

public class NumberLessThanTwenty implements PositveNumber{
	String[] lessThanTwenty = { "", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE ",
			"TEN ", "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ", "EIGHTEEN ",
			"NINETEEN " };
	@Override
	public String inWords(int input) {
		return lessThanTwenty[input];
	}

}
