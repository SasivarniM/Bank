package com.Bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.Entity.Bank;
import com.Bank.Repositary.BnkRepositary;

@Repository
public class BnkDao {
	@Autowired
	BnkRepositary br;

	public String postAll(List<Bank> b) {
		br.saveAll(b);
		return "Posted Successfully";
	}

	public List<Bank> getAll() {
		
		return br.findAll();
	}

}
