package com.lucas.git.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 *
 * @author Lucas Martins
 */
@Getter
@Setter
public class CustomerDTO implements Serializable {

    private Integer customerId;

    private String name;

    private String email;

    private String mobileNumber;

}