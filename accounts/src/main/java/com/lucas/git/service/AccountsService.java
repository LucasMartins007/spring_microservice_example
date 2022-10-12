package com.lucas.git.service;

import com.lucas.git.model.Accounts;
import com.lucas.git.model.Customer;

/**
 *
 * @author Lucas Martins
 */
public interface AccountsService {

    Accounts getAccountDetails(Customer customer);
}
