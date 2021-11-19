package com.example.customer.customerService.Exceptions;

public class CustomerNotExists extends RuntimeException {

    public CustomerNotExists(String mensaje ) {
        super (mensaje);
    }
}
