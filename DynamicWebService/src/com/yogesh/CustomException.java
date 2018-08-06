package com.yogesh;

public class CustomException extends Exception {
	
	private String exceptionReason;
	
	public CustomException(String desc, String reason){
		super(desc);
		this.exceptionReason= reason;
	}
	
	public String getFaultInfo(){
		return exceptionReason;
	}

}
