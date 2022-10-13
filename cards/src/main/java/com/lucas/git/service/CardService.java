package com.lucas.git.service;

import com.lucas.git.model.Card;
import com.lucas.git.model.Customer;

import java.util.List;

public interface CardService {

    List<Card> getByCustomerId(Customer customer);

}
