package com.lucas.git.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class LoanDto {

    private Integer loanNumber;

    private Integer customerId;

    private Date startDate;

    private String loanType;

    private Integer totalLoan;

    private Integer amountPaid;

    private Integer outstandingAmount;

    private Date createDate;

}