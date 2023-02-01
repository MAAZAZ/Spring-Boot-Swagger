package com.sid.accountservice.controller;

import com.sid.accountservice.model.Account;
import com.sid.accountservice.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {
    private AccountService accountService;

    @GetMapping(value = "/comptes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Account> accountList() {
        return accountService.getAllAccounts();
    }

    @GetMapping(value = "/comptes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Account account(@PathVariable Long id) {
        return accountService.findAccount(id);
    }
}
