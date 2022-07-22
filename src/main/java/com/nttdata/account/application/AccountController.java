package com.nttdata.account.application;

import com.nttdata.account.infraestructure.document.Account;
import com.nttdata.account.infraestructure.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public Mono<Account> register(@RequestBody Account account){
        System.out.printf(String.valueOf(account));
        return accountService.save(account);
    }
}
