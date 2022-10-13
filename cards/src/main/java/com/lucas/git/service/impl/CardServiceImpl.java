package com.lucas.git.service.impl;

import com.lucas.git.model.Card;
import com.lucas.git.model.Customer;
import com.lucas.git.repository.CardRepository;
import com.lucas.git.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public List<Card> getByCustomerId(Customer customer) {
        return cardRepository.findByCustomerId(customer.getCustomerId());
    }
}
