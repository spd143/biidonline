package com.techskull.buyer.serviceimpl;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techskull.buyer.bean.BuyerRegisterBean;
import com.techskull.buyer.dao.BuyerRegisterDao;
import com.techskull.buyer.entity.TmBidderRegistration;
import com.techskull.buyer.service.BuyerRegisterService;

@Service
public class BuyerRegisterServiceImpl implements BuyerRegisterService {

	@Autowired
	BuyerRegisterDao buyerRegDao;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	@Override
	@Transactional
	public String saveBuyer(BuyerRegisterBean buyerRegBean) {
		
		TmBidderRegistration tmBidderReg = modelMapper.map(buyerRegBean, TmBidderRegistration.class);
		
		buyerRegDao.save(tmBidderReg);
		
		return null;
	}

}
