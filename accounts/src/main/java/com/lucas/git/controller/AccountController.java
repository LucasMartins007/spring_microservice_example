package com.lucas.git.controller;

import com.lucas.git.model.Accounts;
import com.lucas.git.model.Customer;
import com.lucas.git.model.dto.CustomerDTO;
import com.lucas.git.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas Martins
 */
@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountsService accountsService;

    private final ModelMapper modelMapper;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody CustomerDTO customerDTO) {
        return accountsService.getAccountDetails(modelMapper.map(customerDTO, Customer.class));
    }

}
