package com.example.customer.customerService.Service.Interface;

import com.example.customer.customerService.Domain.Model.Address;

import java.util.List;

public interface IAddressService {

  List<Address> getAdressesByCustomerId(String idCustomer);

  Address getAddressIdByCustomerId(String idAddress);

  List<Address> createAddresses(List<Address> addresses);

  void deleteAddressById(String addressId);

  Address createAddress(Address address);

  Address updateAddress (Address address, String Address);

}
