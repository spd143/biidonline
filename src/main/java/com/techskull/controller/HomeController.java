package com.techskull.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techskull.buyer.bean.BuyerRegisterBean;
import com.techskull.buyer.service.BuyerRegisterService;

@Controller
public class HomeController {
	
	@Autowired
	BuyerRegisterService buyerRegService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/homePage")
	public String firstPage() {
		return "index"; 
	}
	
	@GetMapping("/registration")
	public String registerPage() {
		return "registration"; 
	}
	
	@PostMapping(path = "/saveReg", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String saveReg(@Valid @RequestBody BuyerRegisterBean buyerRegBean, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			logger.info("Returning Request");
			
			bindingResult.getFieldError().toString();
			return "custSave";
		}
		
		String res = buyerRegService.saveBuyer(buyerRegBean);
		
		return res;
		
	}

}
