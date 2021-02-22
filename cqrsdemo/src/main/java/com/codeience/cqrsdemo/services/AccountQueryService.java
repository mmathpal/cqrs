package com.codeience.cqrsdemo.services;

import com.codeience.cqrsdemo.entities.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {
    public List<Object> listEventsForAccount(String accountNumber);
    public AccountQueryEntity getAccount(String accountNumber);
}
