package com.lucas.git.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class CustomerDTO {

    private Integer customerId;

    private String name;

    private String email;

    private String mobileNumber;

    private Date createDate;

}