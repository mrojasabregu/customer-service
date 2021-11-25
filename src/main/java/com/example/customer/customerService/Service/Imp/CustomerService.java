package com.example.customer.customerService.Service.Imp;

import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Exceptions.CustomerNotExists;
import com.example.customer.customerService.Exceptions.DocumentNumberExists;
import com.example.customer.customerService.Repository.CustomerDao;
import com.example.customer.customerService.Repository.IAddressRepository;
import com.example.customer.customerService.Repository.ICustomerRepository;
import com.example.customer.customerService.Service.Interface.ICustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Slf4j
@Service
public class CustomerService implements ICustomerService {
  @Autowired
  private ICustomerRepository customerRepository;
  @Autowired
  private CustomerDao customerDao;
  @Autowired
  private IAddressRepository addressRepository;

  public Customer findByDocTypeAndDocNumber(String documentNumber, String documentType){
    return customerRepository.findByDocTypeAndDocNumber(documentNumber, documentType).orElseThrow(()-> new CustomerNotExists("Customer not found"));
  }

  public List<Customer> getCustomers(String name, String lastName, String email, String phone) {
    return customerDao.findByParams(name, lastName, email, phone);
  }


  public void deleteCustomer(String customerId) {
    log.info("Deleting customer with id: " + customerId);
    customerRepository.findById(customerId).orElseThrow(() -> new CustomerNotExists("Customer not found"));
    addressRepository.deleteByIdCustomer(customerId);
    customerRepository.deleteById(customerId);
  }

  public Customer createCustomer(Customer customer) {
    customer.setIdCustomer(null);
    try {
      return customerRepository.save(customer);
    } catch (Exception e) {
      log.error("Error creating customer: " + e.getMessage());
    }
    throw new DocumentNumberExists("Given Document number belongs to an already registered user");
  }

  public Customer updateCustomer(Customer customer, String idCustomer) {
    customerRepository.findById(idCustomer).orElseThrow(() -> new CustomerNotExists("Customer not found"));
    customerRepository.save(customer);
    return customer;

  }
}

