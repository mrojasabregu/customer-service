package com.example.customer.customerService.Service.Imp;

import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Exceptions.CustomerNotExists;
import com.example.customer.customerService.Repository.CustomerDao;
import com.example.customer.customerService.Repository.ICustomerRepository;
import com.example.customer.customerService.Service.Interface.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerService implements ICustomerService {
  @Autowired
  ICustomerRepository customerRepository;
  @Autowired
  private CustomerDao customerDao;

  public Customer findByDocTypeAndDocNumber(String documentNumber, String documentType){
    return customerRepository.findByDocTypeAndDocNumber(documentNumber, documentType).orElseThrow(()-> new CustomerNotExists("Customer not found"));
  }

  public List<Customer> getCustomers(String name, String lastName, String email, String phone) {
    return customerDao.findByParams(name, lastName, email, phone);
  }


  public Customer deleteCustomer(String customerId) {
    Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new CustomerNotExists("Customer not found"));
    customerRepository.deleteById(customerId);
    return customer;
  }

}

