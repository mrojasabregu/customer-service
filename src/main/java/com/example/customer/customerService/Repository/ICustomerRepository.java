package com.example.customer.customerService.Repository;

import com.example.customer.customerService.Domain.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, String> {

}
