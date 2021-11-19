package com.example.customer.customerService.Controller;


import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Exceptions.CustomerNotExistException;
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

  @GetMapping("/customer")
  public Customer getCustomerByDocument(@RequestParam(name = "doc_type") String documentType, @RequestParam(name = "doc_numb")String documentNumber) {
    log.info("Customer requested with documentType: " + documentType + " and documentNumber: " + documentNumber);
    return customerService.findByDocTypeAndDocNumber(documentNumber, documentType);
  }

  @GetMapping("/customers")
  public List<Customer> getCustomers(@RequestParam(name = "name", required = false) String name,
                                     @RequestParam(name = "last_name", required = false) String lastName,
                                     @RequestParam(name = "email", required = false) String email,
                                     @RequestParam(name = "phone", required = false) String phone) {
    log.info("Customers by query params");
    return customerService.getCustomers(name, lastName, email, phone);
  }

  @GetMapping("/customer/{idCustomer}/addresses")
  public List<Address> getCustomerAddresses(@PathVariable(name = "idCustomer") String idCustomer) {
    log.info("Customer Addresses requested with idCustomer: " + idCustomer);
    return addressService.getAdressesByCustomerId(idCustomer);
  }

  @GetMapping("/customer/{idCustomer}/address/{idAddress}")
  public List<Address> getIdAddressesByCustomerId(@PathVariable(name = "idCustomer") String idCustomer, @PathVariable(name = "idAddress") String idAddress) {
    log.info("Customer Addresses requested with idCustomer: " + idCustomer + " and idAddress: " + idAddress);
    return addressService.getAddressIdByCustomerId(idCustomer, idAddress);
  }

  @DeleteMapping(path = "/customer/{idCustomer}")
  public Customer deleteCustomer(@PathVariable(name = "idCustomer") String idCustomer) throws CustomerNotExistException {
    return customerService.deleteCustomer(idCustomer);
  }

}