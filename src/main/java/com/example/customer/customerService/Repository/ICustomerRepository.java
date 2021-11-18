package com.example.customer.customerService.Repository;

import com.example.customer.customerService.Domain.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, String> {
  List<Customer> findByParams(String name, String lastName, String email, String phone);
}
