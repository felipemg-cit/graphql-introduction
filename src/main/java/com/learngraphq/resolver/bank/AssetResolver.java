package com.learngraphq.resolver.bank;

import com.learngraphq.domain.bank.Asset;
import com.learngraphq.domain.bank.BankAccount;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@Component
public class AssetResolver implements GraphQLResolver<BankAccount> {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
    );

    public CompletableFuture<List<Asset>> assets(BankAccount bankAccount){
        return CompletableFuture.supplyAsync(
                ()->{
                    log.info("Getting assets for bank account id {}", bankAccount.getId());
                    //Asset.builder().id(UUID.randomUUID()).build();
                    return List.of();
                },
        executorService);
//    public Asset asset(BankAccount bankAccount){
//        return Asset.builder().id(UUID.randomUUID()).build();
    }

}
