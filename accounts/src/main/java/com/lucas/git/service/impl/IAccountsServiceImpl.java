package com.lucas.git.service.impl;

import com.lucas.git.model.Accounts;
import com.lucas.git.model.Customer;
import com.lucas.git.model.dto.CustomerDTO;
import com.lucas.git.repository.AccountsRepository;
import com.lucas.git.repository.CustomerRepository;
import com.lucas.git.service.IAccountsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas Martins
 */
@Service
@RequiredArgsConstructor
public class IAccountsServiceImpl implements IAccountsService {

    private final AccountsRepository accountsRepository;

    private final CustomerRepository customerRepository;

    private final ModelMapper modelMapper;

    @Override
    public void createAccount(CustomerDTO customerDTO) {
        final Customer customer = modelMapper.map(customerDTO, Customer.class);

        Customer savedCustomer = customerRepository.save(customer);

        final Accounts accounts = createNewAccount(savedCustomer);
        accountsRepository.save(accounts);
    }

    private Accounts createNewAccount(Customer customer) {
        final Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());

        newAccount.setAccountNumber(100000L);
        newAccount.setAccountType("Savings");
        newAccount.setBranchAddress("Branch Adress");
        return newAccount;
    }

    @Override
    public Accounts getAccountDetails(Customer customer) {
        return accountsRepository.findByCustomerId(customer.getCustomerId());
    }

    @Override
    public CustomerDTO fetchAccount(String mobileNumber) {
        return null;
    }
}
