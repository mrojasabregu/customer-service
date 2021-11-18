package com.example.customer.customerService.Controller;


import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Service.Imp.AddressService;
import com.example.customer.customerService.Service.Imp.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
@Slf4j
public class CustomerController {

  @Autowired
  public CustomerService customerService;

  @Autowired
  public AddressService addressService;

  @GetMapping(path = "/")
  public List<Customer> getCustomer(@RequestParam(name = "name") String name,
                                    @RequestParam(name = "last_Name") String lastName,
                                    @RequestParam(name = "email") String email,
                                    @RequestParam(name = "phone") String phone) {
    return customerService.getCustomers(name, lastName, email, phone);
  }

  @GetMapping("/customer/{idCustomer}/addresses")
  public List<Address> getCustomerAddresses(@PathVariable(name = "idCustomer") String idCustomer) {
    log.info("Customer Addresses requested with idCustomer: " + idCustomer);
    return addressService.getAdressesByCustomerId(idCustomer);
  }
}