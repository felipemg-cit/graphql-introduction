package com.learngraphq.resolver.bank.mutation;

import com.learngraphq.domain.bank.BankAccount;
import com.learngraphq.domain.bank.Currency;
import com.learngraphq.domain.bank.input.CreateBankAccountInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountMutation implements GraphQLMutationResolver {
    public BankAccount createBankAccount(CreateBankAccountInput input){
        log.info("Creating bank account for {}", input);
        return BankAccount.builder().id(UUID.randomUUID()).currency(Currency.BRL).build();
    }
}
