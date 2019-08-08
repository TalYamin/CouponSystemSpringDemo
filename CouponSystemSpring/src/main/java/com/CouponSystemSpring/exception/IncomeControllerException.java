package com.CouponSystemSpring.exception;

public class IncomeControllerException extends Exception {
	
	private long clientId;
	private String clientName;
	
	public IncomeControllerException(String message, long clientId, String clientName) {
		super(String.format(message + "client id: %d, client name: %s ", clientId, clientName));
		this.clientId = clientId;
		this.clientName = clientName;
	}
	
	public IncomeControllerException(String message) {
		super(message);
	}

	public long getClientId() {
		return this.clientId;
	}

	public String getClientName() {
		return this.clientName;
	}


	

}
