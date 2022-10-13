package com.lucas.git.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class CardDto {

    private Integer cardId;

    private Integer customerId;

    private String cardNumber;

    private String cardType;

    private Integer totalLimit;

    private Integer amountUsed;

    private Integer avaiableAmount;

    private Date createDate;

}