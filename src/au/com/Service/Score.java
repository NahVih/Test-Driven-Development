package au.com.Service;

import java.math.BigDecimal;

public enum Score {
	AMAZING {
		@Override
		public BigDecimal bonusAmount() {
			return new BigDecimal("0.03");
		}
	}, EXCELLENT {
		@Override
		public BigDecimal bonusAmount() {
			return new BigDecimal("0.05");
		}
	}, BAD {
		@Override
		public BigDecimal bonusAmount() {
			return new BigDecimal("0.01");
		}
	};

	
	public abstract BigDecimal bonusAmount();
}
