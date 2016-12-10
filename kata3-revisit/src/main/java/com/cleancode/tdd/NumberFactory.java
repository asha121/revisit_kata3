package com.cleancode.tdd;

public enum NumberFactory {
	LESS_THAN_TWENTy(new NumberLessThanTwenty()), LESS_THAN_HUNDRED(new NumberLessThanHundred()), LESS_THAN_THOUSAND(
			new NumberLessThanThousand()), GREATER_THAN_THOUSAND(new NumberThousandThreeDigit());
	private final PositveNumber instance;

	private NumberFactory(PositveNumber instance) {
		this.instance = instance;
	}

	public PositveNumber getInstance() {
		return this.instance;
	}

}
