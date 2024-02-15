package com.lucas.git.controller;

import com.lucas.git.model.Accounts;
import com.lucas.git.model.Customer;
import com.lucas.git.model.dto.CustomerDTO;
import com.lucas.git.model.dto.ResponseDTO;
import com.lucas.git.service.IAccountsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lucas Martins
 */
@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
public class AccountController {

    private final IAccountsService iAccountsService;

    private final ModelMapper modelMapper;

    @PostMapping("/myAccount")
    public ResponseEntity<ResponseDTO> getAccountDetails(@RequestBody CustomerDTO customerDTO) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDTO("201", "account create with success"));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDTO> fetchAccountDetails(@RequestParam String mobileNumber) {
        return null;
    }

}
