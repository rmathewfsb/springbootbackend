package com.fsb.lending.fees.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsb.lending.fees.domain.FeeRepository;
import com.fsb.lending.fees.vo.FeeVO;
import com.fsb.lending.fees.domain.Fee;

@Service
public class FeesListingServiceImpl implements FeesListingService 
{
	
    @Autowired
    private FeeRepository feeRepository;

	public List<FeeVO> listAllFees() {
		// TODO Auto-generated method stub
		return getAllFees();
	}

	private List<FeeVO> getAllFees() {

		List<FeeVO> allFees = new ArrayList<>();
		allFees.add(new FeeVO("800","FeesOne"));
		allFees.add(new FeeVO("803","FeesTwo"));
		allFees.add(new FeeVO("900","FeesThree"));
		allFees.add(new FeeVO("1200","FeesFour"));
		allFees.add(new FeeVO("1300","FeesFive"));
		
		return allFees;
	}
	
	public List<Fee> getAllFeesFromRepository() 
	{
		return feeRepository.findAll();
	}

}
