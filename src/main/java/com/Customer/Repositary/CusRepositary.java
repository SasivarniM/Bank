package com.Customer.Repositary;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Customer.Entity.Customer;

public interface CusRepositary extends JpaRepository<Customer, Integer>{

	

}
