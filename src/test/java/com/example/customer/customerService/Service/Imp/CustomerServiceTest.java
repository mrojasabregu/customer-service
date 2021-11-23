package com.example.customer.customerService.Service.Imp;

import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Exceptions.CustomerNotExists;
import com.example.customer.customerService.Repository.CustomerDao;
import com.example.customer.customerService.Repository.IAddressRepository;
import com.example.customer.customerService.Repository.ICustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

  @InjectMocks
  public CustomerService customerService;

  @Mock
  public ICustomerRepository customerRepository;

  @Mock
  public IAddressRepository addressRepository;

  @Mock
  public CustomerDao customerDao;


  Customer fakeCustomer =
      Customer.builder().idCustomer("675a990d-6ed6-425c-8afe-6fd7a507b77a")
          .name("Felipe")
          .lastName("Contepomi")
          .type("DNI")
          .documentNumber("1234567")
          .email("asd@gmail.com")
          .phone("844-231-3211").build();


  @Test
  public void findByDocTypeAndDocNumber() {
    when(customerRepository.findByDocTypeAndDocNumber(fakeCustomer.getDocumentNumber(), fakeCustomer.getType())).thenReturn(Optional.of(fakeCustomer));
    assertEquals(fakeCustomer, customerRepository.findByDocTypeAndDocNumber(fakeCustomer.getDocumentNumber(), fakeCustomer.getType()).get());
  }

  @Test
  public void findByDocTypeAndDocNumberFailByCustomerNotExists() {
    when(customerRepository.findByDocTypeAndDocNumber(fakeCustomer.getDocumentNumber(), fakeCustomer.getType())).thenReturn(Optional.empty());
    assertThrows(CustomerNotExists.class, () -> customerService.findByDocTypeAndDocNumber(fakeCustomer.getDocumentNumber(), fakeCustomer.getType()));
  }

  @Test
  public void getCustomers() {
    when(customerDao.findByParams(fakeCustomer.getName(), null, null, null)).thenReturn(Arrays.asList(fakeCustomer));
    when(customerDao.findByParams(fakeCustomer.getName(), fakeCustomer.getLastName(), null, null)).thenReturn(Arrays.asList(fakeCustomer));
    when(customerDao.findByParams(fakeCustomer.getName(), fakeCustomer.getLastName(), fakeCustomer.getEmail(), null)).thenReturn(Arrays.asList(fakeCustomer));
    when(customerDao.findByParams(fakeCustomer.getName(), fakeCustomer.getLastName(), fakeCustomer.getEmail(), fakeCustomer.getPhone())).thenReturn(Arrays.asList(fakeCustomer));
    assertEquals(Arrays.asList(fakeCustomer), customerService.getCustomers(fakeCustomer.getName(), null, null, null));
    assertEquals(Arrays.asList(fakeCustomer), customerService.getCustomers(fakeCustomer.getName(), fakeCustomer.getLastName(), null, null));
    assertEquals(Arrays.asList(fakeCustomer), customerService.getCustomers(fakeCustomer.getName(), fakeCustomer.getLastName(), fakeCustomer.getEmail(), null));
    assertEquals(Arrays.asList(fakeCustomer), customerService.getCustomers(fakeCustomer.getName(), fakeCustomer.getLastName(), fakeCustomer.getEmail(), fakeCustomer.getPhone()));
  }
}