package com.nttdata.account.domain;

import com.nttdata.account.infraestructure.document.Account;
import com.nttdata.account.infraestructure.reposiroty.AccountRepository;
import com.nttdata.account.infraestructure.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Flux<Account> getAll() {
        return this.accountRepository.findAll();
    }

    @Override
    public Mono<Account> save(Account account) {
        return this.accountRepository.save(account);
    }

    @Override
    public Mono<Account> findById(String id) {
        return this.accountRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existById(String id) {
        return this.accountRepository.existsById(id);
    }
}
