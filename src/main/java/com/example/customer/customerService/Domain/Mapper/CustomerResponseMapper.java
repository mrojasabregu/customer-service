package com.example.customer.customerService.Domain.Mapper;

import com.example.customer.customerService.Controller.Response.CustomerResponse;
import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class CustomerResponseMapper implements Function<Customer, CustomerResponse> {

  @Autowired
  private IAddressRepository addressRepository;

  @Autowired
  private AddressResponseMapper addressResponseMapper;

  @Override
  public CustomerResponse apply(Customer customer) {
    return CustomerResponse.builder()
        .idCustomer(customer.getIdCustomer())
        .name(customer.getName())
        .lastName(customer.getLastName())
        .type(customer.getType())
        .documentNumber(customer.getDocumentNumber())
        .email(customer.getEmail())
        .phone(customer.getPhone())
        .addresses(addressRepository
            .findAddressesByCustomerId(customer.getIdCustomer())
            .stream().map(c -> addressResponseMapper.apply(c)).collect(Collectors.toList()))
        .build();
  }
}
