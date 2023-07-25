package com.enums;

public enum AccountType {
	SAVINGS(4.0), CURRENT(0.0);

	AccountType(double roi) {
		this.roi = roi;
	}

	private double roi;

	public double getRoi() {
		return roi;
	}

}
