package com.techskull.buyer.dao;

import org.springframework.data.repository.CrudRepository;

import com.techskull.buyer.entity.TmBidderRegistration;

public interface BuyerRegisterDao extends CrudRepository<TmBidderRegistration, Long> {

	
	
}
