package com.example.customer.customerService.Repository;

import com.example.customer.customerService.Domain.Model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Customer_Repository extends CrudRepository<Customer, String > {

    List<Customer> findByParams(String name, String lastName, String email, String phone);
}
