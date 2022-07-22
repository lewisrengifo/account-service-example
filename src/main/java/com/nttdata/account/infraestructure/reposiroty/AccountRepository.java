package com.nttdata.account.infraestructure.reposiroty;

import com.nttdata.account.infraestructure.document.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
}
