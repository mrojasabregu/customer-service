package com.example.customer.customerService.Exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerNotExists extends RuntimeException {

    public CustomerNotExists(String mensaje ) {
        super (mensaje);
        log.error("Customer not exist exceptions");
    }
}
