package com.lucas.git.controller;

import com.lucas.git.model.dto.CustomerDTO;
import com.lucas.git.model.dto.LoanDto;
import com.lucas.git.model.Customer;
import com.lucas.git.model.Loan;
import com.lucas.git.service.LoansService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class LoansController {

    private final LoansService loansService;

    private final ModelMapper modelMapper;


    @PostMapping("/myLoans")
    public List<LoanDto> getLoansDetails(@RequestBody CustomerDTO customerDTO) {
        final List<Loan> loans = loansService.getByCustomerId(modelMapper.map(customerDTO, Customer.class));

        return loans.stream()
                .map(loan -> modelMapper.map(loan, LoanDto.class))
                .collect(Collectors.toList());
    }

}
