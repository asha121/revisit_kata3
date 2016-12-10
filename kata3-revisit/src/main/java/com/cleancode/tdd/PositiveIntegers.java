package com.cleancode.tdd;

public class PositiveIntegers {

	public String inWords(int input) {
		String words = "";
		PositveNumber integer;
		if (input < 20) {
			integer = new NumberLessThanTwenty();
			words = integer.inWords(input);
		}else if(input < 100){
			integer = new  NumberLessThanHundred();
			words = integer.inWords(input);
		}else{
			words="ONE HUNDRED ";
		}
		
		return words;
	}
}
