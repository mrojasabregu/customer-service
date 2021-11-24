package com.example.customer.customerService.Domain.Mapper;

import com.example.customer.customerService.Controller.Request.CustomerRequest;
import com.example.customer.customerService.Domain.Model.Customer;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CustomerRequestMapper implements Function<CustomerRequest, Customer> {


    @Override
    public Customer apply(CustomerRequest customerRequest) {
        return Customer.builder()
                .idCustomer(customerRequest.getIdCustomer())
                .name(customerRequest.getName())
                .lastName(customerRequest.getLastName())
                .type(customerRequest.getType())
                .documentNumber(customerRequest.getDocumentNumber())
                .email(customerRequest.getEmail())
                .phone(customerRequest.getPhone())
                .build();
    }
}
