package com.sid.accountservice.service;

import com.sid.accountservice.model.Account;
import com.sid.accountservice.model.AccountType;
import com.sid.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class IntialData {
    @Autowired
    private AccountRepository accountRepository;

    @PostConstruct
    public void start() {
        accountRepository.save(new Account(null, Math.random() * 10000, new Date(), AccountType.COURANT));
        accountRepository.save(new Account(null, Math.random() * 10000, new Date(), AccountType.EPARGNE));
        accountRepository.save(new Account(null, Math.random() * 10000, new Date(), AccountType.COURANT));
        accountRepository.save(new Account(null, Math.random() * 10000, new Date(), AccountType.EPARGNE));
        accountRepository.findAll().forEach(System.out::println);
    }
}
