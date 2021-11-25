package com.example.customer.customerService.Repository;

import com.example.customer.customerService.Domain.Model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Repository
public interface IAddressRepository extends CrudRepository<Address, Long> {
  @Query(value = "SELECT * FROM address WHERE id_customer = ?1", nativeQuery = true)
  List<Address> findAddressesByCustomerId(String customerId);

  @Query(value = "SELECT * FROM address WHERE id_address = ?1", nativeQuery = true)
  Optional < Address> findAddressByCustomerIdAndAddressId(String addressId);

  @Query(value = "SELECT * FROM address WHERE id_address = ?1", nativeQuery = true)
  Optional < Address> findById(String addressId);

  @Transactional
  @Modifying
  @Query(value = "DELETE FROM address WHERE id_customer = ?1", nativeQuery = true)
  void deleteByIdCustomer(String customerId);

  @Transactional
  @Modifying
  @Query(value = "DELETE FROM address WHERE id_address = ?1", nativeQuery = true)
  void deleteAddressById(String addressId);

}
