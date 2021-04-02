package com.learngraphq.resolver.bank.query;

import com.learngraphq.domain.bank.BankAccount;
import com.learngraphq.domain.bank.Client;
import com.learngraphq.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id){
        log.info("Retrieving bank account ID: {}", id);

        /*var clientA = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Wanilton")
                .lastName("Filho")
                .build();

        var clientB = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Sara")
                .lastName("Roland")
                .build();

        clientA.setClient(clientB);
        clientB.setClient(clientA);

        */

        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .build();
    }

}
