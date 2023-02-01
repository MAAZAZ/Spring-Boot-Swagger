package com.sid.accountservice.repository;

import com.sid.accountservice.model.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class AccountRepositoryTest {
    @Autowired
    private AccountRepository accountRepository;

    @Test
    @Disabled
    public void verifyIfAccountOneExists() {
        verifyIfAccountExists(5L);
    }

    public void verifyIfAccountExists(Long id) {
        Account account = accountRepository.getById(id);
        Assertions.assertThat(account.getType()).isNotNull();
    }
}
