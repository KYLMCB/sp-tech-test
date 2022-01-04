package com.kylmcb.techtest.database;

import com.kylmcb.techtest.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findById(long accountId);
}

