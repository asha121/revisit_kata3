package com.cleancode.tdd;

public class NumberFactory {
	enum Name {
		LESS_THAN_TWENTy(), LESS_THAN_HUNDRED, LESS_THAN_THOUSAND, GREATER_THAN_THOUSAND

	};

	public static PositveNumber getInstance(Name identifier) {
		PositveNumber number;
		if (Name.LESS_THAN_TWENTy == identifier) {
			number = new NumberLessThanTwenty();
		} else if (Name.LESS_THAN_HUNDRED == identifier) {
			number = new NumberLessThanHundred();
		} else if (Name.LESS_THAN_THOUSAND == identifier) {
			number = new NumberLessThanThousand();
		} else {
			number = new NumbeGreaterOrThousand();
		}
		return number;
	}

}
