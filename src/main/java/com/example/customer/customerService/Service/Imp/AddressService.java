package com.example.customer.customerService.Service.Imp;

import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Exceptions.CustomerNotExists;
import com.example.customer.customerService.Repository.IAddressRepository;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

  @Autowired
  private IAddressRepository addressRepository;

  public List<Address> getAdressesByCustomerId(String idCustomer) {
    return addressRepository.findAddressesByCustomerId(idCustomer);
  }

  public Address getAddressIdByCustomerId(String idCustomer, String idAddress) {
    return addressRepository.findAddressByCustomerIdAndAddressId(idCustomer, idAddress).orElseThrow(() -> new CustomerNotExists("Address not found"));
  }

}
