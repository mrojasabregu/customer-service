package com.example.customer.customerService.Service.Imp;

import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Exceptions.CustomerNotExists;
import com.example.customer.customerService.Repository.IAddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
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


  public void createAddresses(List<Address> addresses) {
    addressRepository.saveAll(addresses);
  }

  public void deleteAddressById(String addressId) {
    log.info("Deleting Address with id: " + addressId);
    addressRepository.findById(addressId).orElseThrow(() -> new CustomerNotExists("Address not found"));
    addressRepository.deleteAddressById(addressId);
  }
}
