package com.nttdata.account.infraestructure.service;

import com.nttdata.account.infraestructure.document.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {

    Flux<Account> getAll();

    Mono<Account> save(Account account);

    Mono<Account> findById(String id);

    Mono<Boolean> existById(String id);
}
