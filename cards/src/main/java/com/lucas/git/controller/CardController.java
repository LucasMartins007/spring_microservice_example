package com.lucas.git.controller;

import com.lucas.git.model.Card;
import com.lucas.git.model.Customer;
import com.lucas.git.model.dto.CardDto;
import com.lucas.git.model.dto.CustomerDto;
import com.lucas.git.service.CardService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    private final ModelMapper modelMapper;

    @PostMapping("myCards")
    public List<CardDto> getCardDetails(@RequestBody CustomerDto customerDto) {
        List<Card> cards = cardService.getByCustomerId(modelMapper.map(customerDto, Customer.class));

        return cards.stream()
                .map(card -> modelMapper.map(card, CardDto.class))
                .collect(Collectors.toList());
    }
}
