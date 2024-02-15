package com.lucas.git.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class CustomerDTO implements Serializable {

    private String name;

    private String email;

    private String mobileNumber;

}