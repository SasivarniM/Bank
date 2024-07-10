package com.Bank.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Dao.BnkDao;
import com.Bank.Entity.Bank;


@Service
public class BnkService {
	private static final Collectors Collecotors = null;
	@Autowired
	BnkDao bd;

	public String postAll(List<Bank> b) {
		
		return bd.postAll(b);
	}

	public List<Bank> getAll() {
		
		return bd.getAll();
	}

	public List<String> getBranch(String a) {
		List<Bank> bk=bd.getAll();
		List<String> brn=bk.stream().filter(y->y.getIFSCcode().equals(a)).map(z->z.getBranch()).collect(Collecotors.toList());
		
		return brn;
	}
	
	
	

}
