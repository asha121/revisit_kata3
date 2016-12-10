package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String[] word = { null, "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE ", "TEN ",
				"ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ", "EIGHTEEN ",
				"NINETEEN " };
		return word[input];
	}

}
