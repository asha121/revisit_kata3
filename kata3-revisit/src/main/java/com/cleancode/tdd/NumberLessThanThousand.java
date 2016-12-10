package com.cleancode.tdd;

public class NumberLessThanThousand extends NumberLessThanHundred implements PositveNumber {

	@Override
	public String inWords(int input) {

		
		String word = "";
		String hundred = "HUNDRED ";
		String and = (input % 100 > 0) ? "AND " : "";
		
		if (input < 100) {
			word =and+super.inWords(input % 100);
		}else{
			word = lessThanTwenty[input / 100] + hundred + and + super.inWords(input % 100);
		}
			
		return word;
	}
}
