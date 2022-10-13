package com.lucas.git.service;

import com.lucas.git.model.Customer;
import com.lucas.git.model.Loan;

import java.util.List;

public interface LoansService {

    List<Loan> getByCustomerId(Customer customer);

}
