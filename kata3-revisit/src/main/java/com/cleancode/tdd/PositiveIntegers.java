package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String[] lessThanTwenty = { "", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE ", "TEN ",
				"ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ", "EIGHTEEN ",
				"NINETEEN "};
		String[] twentyOnwards = {"TWENTY ","TWENTY ONE ","TWENTY TWO "};
		if (input<20) {
			return lessThanTwenty[input];
		}
		return twentyOnwards[input%20];
		
	}

}
