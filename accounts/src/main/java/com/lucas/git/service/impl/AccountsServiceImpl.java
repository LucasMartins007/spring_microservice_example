package com.lucas.git.service.impl;

import com.lucas.git.model.Accounts;
import com.lucas.git.model.Customer;
import com.lucas.git.repository.AccountsRepository;
import com.lucas.git.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas Martins
 */
@Service
@RequiredArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private final AccountsRepository accountsRepository;

    @Override
    public Accounts getAccountDetails(Customer customer) {
        return accountsRepository.findByCustomerId(customer.getCustomerId());
    }
}
