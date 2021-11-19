package com.example.customer.customerService.Domain.Mapper;

import com.example.customer.customerService.Controller.Response.AddressResponse;
import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AddressResponseMapper implements Function<Address, AddressResponse> {

  @Autowired
  private IAddressRepository addressRepository;

  @Override
  public AddressResponse apply(Address address) {
    return (AddressResponse) AddressResponse.builder()
        .idAddress(address.getIdAddress())
        .city(address.getCity())
        .street(address.getStreet())
        .streetNumber(address.getStreetNumber())
        .floor(address.getFloor())
        .flat(address.getFlat())
        .build();
  }
}
