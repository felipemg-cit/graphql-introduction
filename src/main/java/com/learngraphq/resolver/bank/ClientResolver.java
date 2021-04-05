package com.learngraphq.resolver.bank;

import com.learngraphq.domain.bank.BankAccount;
import com.learngraphq.domain.bank.Client;
import com.learngraphq.domain.bank.Currency;
import graphql.GraphQLException;
import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    public DataFetcherResult<Client> client(BankAccount bankAccount){
        log.info("Requesting client data for bank id {}", bankAccount.getId());
//        throw new GraphQLException("Client unavailable");
//        throw new RuntimeException("Client unavailable");
        //Return just a part of the information
        return DataFetcherResult.<Client>newResult()
                .data(Client.builder()
                    .id(UUID.randomUUID())
                    .firstName("Wanilton")
                    .lastName("Filho")
                    .build())
                .error(new GenericGraphQLError("Could not get sub-client id"))
                .build();
    }

}
