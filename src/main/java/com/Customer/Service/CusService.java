package com.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Customer.Dao.CusDao;
import com.Customer.Entity.Customer;

@Service
public class CusService {
	
	@Autowired
	CusDao ad;
	
	

	public String postAll(List<Customer> bk) {
		
		return ad.postAll(bk);
	}
	

}
