package com.example.customer.customerService.Service.Imp;

import com.example.customer.customerService.Controller.Request.AddressRequest;
import com.example.customer.customerService.Domain.Mapper.AddressRequestMapper;
import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Exceptions.CustomerNotExists;
import com.example.customer.customerService.Repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

  @Autowired
  private IAddressRepository addressRepository;

  public List<Address> getAdressesByCustomerId(String idCustomer) {
    return addressRepository.findAddressesByCustomerId(idCustomer);
  }

  public Address getAddressIdByCustomerId(String idAddress) {
    return addressRepository.findAddressByCustomerIdAndAddressId(idAddress).orElseThrow(() -> new CustomerNotExists("Address not found"));
  }

}
