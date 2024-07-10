package com.Bank.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.Entity.Bank;

public interface BnkRepositary extends  JpaRepository<Bank, Integer>{

}
