package com.fsb.lending.fees.service;

import java.util.List;

import com.fsb.lending.fees.domain.Fee;
import com.fsb.lending.fees.vo.FeeVO;

public interface FeesListingService 
{	
	public List<FeeVO> listAllFees();
	public List<Fee> getAllFeesFromRepository();
}
