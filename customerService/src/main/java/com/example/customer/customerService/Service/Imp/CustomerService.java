
package com.example.customer.customerService.Service.Imp;

import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Repository.CustomerDao;
import com.example.customer.customerService.Service.Interface.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService implements ICustomerService {

  @Autowired
  private CustomerDao customerDao;


  public List<Customer> getCustomers(String name,String lastName,String email,String phone){
    return customerDao.findByParams(name, lastName, email, phone);
  }

}