package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Entity.Bank;
import com.Bank.Service.BnkService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/Bank")
public class BnkController {
	
	@Autowired
	BnkService bs;
	
	@PostMapping("/postAll")
	public String postAll(@RequestBody List<Bank> b) {	
		return bs.postAll(b);
	}
	
	
	@GetMapping("/getAll")
	public List<Bank> getAll() {
		return bs.getAll();
	}
	
	@GetMapping("/getByBranch/{a}")
	public List<String> getBranch(@PathVariable String a) {
		return bs.getBranch(a);
	}
	
	
	

}
