package com.kylmcb.techtest.controller;

import com.kylmcb.techtest.database.AccountRepository;
import com.kylmcb.techtest.database.ElecReadingRepository;
import com.kylmcb.techtest.database.GasReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
}
