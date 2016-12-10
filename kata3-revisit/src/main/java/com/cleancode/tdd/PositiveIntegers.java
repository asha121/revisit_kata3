package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String[] lessThanTwenty = { "", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE ",
				"TEN ", "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ",
				"EIGHTEEN ", "NINETEEN " };
		String[] twenty = { "","", "TWENTY " ,"THIRTY "};
		if (input < 20) {
			return lessThanTwenty[input];
		}
		return twenty[input / 10] + lessThanTwenty[input % 10];
	}
}
