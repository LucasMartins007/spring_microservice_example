package com.lucas.git.service.impl;

import com.lucas.git.model.Customer;
import com.lucas.git.model.Loan;
import com.lucas.git.repository.LoansRepository;
import com.lucas.git.service.LoansService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoansServiceImpl implements LoansService {

    private final LoansRepository loansRepository;

    @Override
    public List<Loan> getByCustomerId(Customer customer) {
        return loansRepository.findByCustomerIdOrderByStartDateDesc(customer.getCustomerId());
    }
}
