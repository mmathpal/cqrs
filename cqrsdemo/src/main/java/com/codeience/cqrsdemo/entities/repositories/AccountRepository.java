package com.codeience.cqrsdemo.entities.repositories;


import com.codeience.cqrsdemo.entities.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountQueryEntity, String> {
}

