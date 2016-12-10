package com.cleancode.tdd;

import org.yaml.snakeyaml.serializer.NumberAnchorGenerator;

public class NumberFactory {
	enum Number {
		LESS_THAN_TWENTy(new NumberLessThanTwenty()), 
		LESS_THAN_HUNDRED(new NumberLessThanHundred()), 
		LESS_THAN_THOUSAND(	new NumberLessThanThousand()), 
		GREATER_THAN_THOUSAND(new NumbeGreaterOrThousand());
		private final PositveNumber instance;

		private Number(PositveNumber instance) {
			this.instance = instance;
		}

		public PositveNumber getInstance() {
			return this.instance;
		}

	}
}
