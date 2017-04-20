/**
 * 
 */
package com.fsb.lending.fees.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author rmathew
 *
 */
@Document
public class Fee {
	
    @Id
    private String id;	
	private String feeName;
	private String hudNumber;
	private String feeAmount;
	public String getFeeName() {
		return feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	public String getHudNumber() {
		return hudNumber;
	}
	public void setHudNumber(String hudNumber) {
		this.hudNumber = hudNumber;
	}
	public String getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
