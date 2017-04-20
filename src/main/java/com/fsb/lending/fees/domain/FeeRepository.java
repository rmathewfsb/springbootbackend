package com.fsb.lending.fees.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeeRepository extends  MongoRepository<Fee, String>
{
	public Fee findByFeeName(final String feeName);
	public List<Fee> findAll();
}
