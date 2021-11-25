package com.example.customer.customerService.Service.Interface;

import com.example.customer.customerService.Domain.Model.Customer;

import java.util.List;

public interface ICustomerService {

  Customer findByDocTypeAndDocNumber(String documentNumber, String documentType);

  List<Customer> getCustomers(String name, String lastName, String email, String phone);

  void deleteCustomer(String customerId);

  Customer createCustomer(Customer customer);

  Customer updateCustomer(Customer customer, String idCustomer);

  Customer getCustomerById(String idCustomer);

}
