package com.example.customer.customerService.Exceptions;

public class AddressNotExists extends RuntimeException{

    public AddressNotExists(String mensaje ) {
        super (mensaje);
    }
}
