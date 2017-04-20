package com.fsb.lending.fees.vo;

public class FeeVO 
{
	private String hudNumber;
	private String feeName;
	private String feeAmount;
	
	public FeeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FeeVO(String hudNumber, String feeName) {
		super();
		this.hudNumber = hudNumber;
		this.feeName = feeName;
	}

	public String getHudNumber() {
		return hudNumber;
	}
	public void setHudNumber(String hudNumber) {
		this.hudNumber = hudNumber;
	}
	public String getFeeName() {
		return feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	public String getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

}
