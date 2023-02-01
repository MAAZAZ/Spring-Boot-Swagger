package com.sid.accountservice.service;

import com.sid.accountservice.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account findAccount(final Long id);
}
