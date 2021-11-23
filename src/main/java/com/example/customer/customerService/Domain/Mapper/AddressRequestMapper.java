package com.example.customer.customerService.Domain.Mapper;

import com.example.customer.customerService.Controller.Request.AddressRequest;
import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AddressRequestMapper implements Function<AddressRequest, Address> {

    @Autowired
    public ICustomerRepository customerRepository;

    @Override
    public Address apply(AddressRequest addressRequest) {
        return Address.builder()
                .idAddress(addressRequest.getIdAddress())
                .city(addressRequest.getCity())
                .flat(addressRequest.getFlat())
                .floor(addressRequest.getFloor())
                .street(addressRequest.getStreet())
                .streetNumber(addressRequest.getStreetNumber())
                .customer(customerRepository.findById(addressRequest.getIdCustomer()).get())
                .build();
    }
}
