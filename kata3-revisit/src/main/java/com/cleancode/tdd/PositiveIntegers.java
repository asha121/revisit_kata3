package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String[] word = { "", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE ", "TEN ",
				"ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ", "EIGHTEEN ",
				"NINETEEN ","TWENTY " };
		return word[input];
	}

}
