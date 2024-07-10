package com.Customer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Customer.Entity.Customer;
import com.Customer.Repositary.CusRepositary;
@Repository
public class CusDao {
	
	@Autowired
	CusRepositary cr;

	

	public String postAll(List<Customer> bk) {
		cr.saveAll(bk);
		return "Saved Successfully";
	}

	

}
