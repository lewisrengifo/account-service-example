package com.nttdata.account.infraestructure.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "accounts")
public class Account {
    @Id
    private int id;
    private String numberAccount;
    private String amount;
    private String customer;
}
