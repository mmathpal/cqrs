package com.codeience.cqrsdemo.services;

import com.codeience.cqrsdemo.dto.commands.AccountCreateDTO;
import com.codeience.cqrsdemo.dto.commands.MoneyCreditDTO;
import com.codeience.cqrsdemo.dto.commands.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}

