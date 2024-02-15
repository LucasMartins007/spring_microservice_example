package com.lucas.git.service;

import com.lucas.git.model.Accounts;
import com.lucas.git.model.Customer;
import com.lucas.git.model.dto.CustomerDTO;

/**
 *
 * @author Lucas Martins
 */
public interface IAccountsService {

    void createAccount(CustomerDTO customerDTO);

    Accounts getAccountDetails(Customer customer);

    /**
     *
     * @param mobileNumber
     * @return
     */
    CustomerDTO fetchAccount(String mobileNumber);
}
