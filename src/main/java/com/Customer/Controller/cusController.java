
package com.Customer.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Customer.Entity.Bank;
import com.Customer.Entity.Customer;
import com.Customer.Service.CusService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Customer")
public class cusController {
	@Autowired
	CusService cs;
	RestTemplate rt;
	
	@PostMapping("/postAll")
	public String postAll(@RequestBody List<Customer> c) {
		
		String url1="http://localhost:8080/Bank/getAll";
		String url2="htpp://localhost:8080/Bank/getByBrand/";
		
		List<Customer> bk=new ArrayList<>();
		ResponseEntity<List<Bank>> bnk=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference <List<Bank>> 
		(){});
		
		List<Bank> bank=bnk.getBody();
		bank.forEach(x->{
			String ifsc=x.getIFSCcode();
			ResponseEntity<String> bnk1=rt.exchange(url2+ifsc, HttpMethod.GET,null, String.class);
									
		});
		
		return cs.postAll(bk);
	}
	
	

}
