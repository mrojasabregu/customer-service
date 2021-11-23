package com.example.customer.customerService.Repository;

import com.example.customer.customerService.Domain.Model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ICustomerRepository extends CrudRepository<Customer, String> {
    @Query(value = "SELECT * FROM customer WHERE document_number = ?1 AND document_type = ?2", nativeQuery = true)
    Optional<Customer> findByDocTypeAndDocNumber(String documentNumber, String documentType);
}
