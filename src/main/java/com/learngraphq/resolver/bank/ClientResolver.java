package com.learngraphq.resolver.bank;

import com.learngraphq.domain.bank.BankAccount;
import com.learngraphq.domain.bank.Client;
import com.learngraphq.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    public Client client(BankAccount bankAccount){
        log.info("Requesting client data for bank id {}", bankAccount.getId());
        return Client.builder()
                .id(UUID.randomUUID())
                .firstName("Wanilton")
                .lastName("Filho")
                .build();
    }

}
