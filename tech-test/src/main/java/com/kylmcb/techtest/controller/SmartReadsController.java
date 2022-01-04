package com.kylmcb.techtest.controller;

import com.kylmcb.techtest.database.AccountRepository;
import com.kylmcb.techtest.database.ElecReadingRepository;
import com.kylmcb.techtest.database.GasReadingRepository;
import com.kylmcb.techtest.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SmartReadsController {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ElecReadingRepository elecReadingRepository;

    @Autowired
    GasReadingRepository gasReadingRepository;

    @GetMapping(path = "/smart/reads/{account_id}")
    public ResponseEntity<Account> getAccountById(@PathVariable("account_id") long account_id) {
        Account account = accountRepository.findById(account_id);
        if (account != null) {
            return new ResponseEntity<>(account, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
