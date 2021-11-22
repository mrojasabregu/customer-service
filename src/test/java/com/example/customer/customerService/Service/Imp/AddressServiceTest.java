package com.example.customer.customerService.Service.Imp;

import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Repository.IAddressRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AddressServiceTest {


  @InjectMocks
  public AddressService addressService;

  @Mock
  public IAddressRepository addressRepository;


  List<Address> addressesFakeResponse = Arrays.asList(
      Address.builder()
          .idAddress("327fd47b-b3a2-44e5-92b0-0b29f6820fd5")
          .city("Cordoba")
          .street("Buenos Aires")
          .streetNumber(768L)
          .floor(0L)
          .flat("b")
          .customer(Customer.builder().idCustomer("675a990d-6ed6-425c-8afe-6fd7a507b77a")
              .name("Felipe")
              .lastName("Contepomi")
              .type("DNI")
              .documentNumber("1234567")
              .email("asd@gmail.com")
              .phone("844-231-3211").build())
          .build(),

      Address.builder()
          .idAddress("eb10482f-3d65-44c6-a0a5-8c4bbf5be27a")
          .city("Cordoba")
          .street("Buenos Aires")
          .streetNumber(768L)
          .floor(0L)
          .flat("b")
          .customer(Customer.builder().idCustomer("b65b883e-a1bc-4282-88b2-c59d9c83b1b4")
              .name("Felipe")
              .lastName("Daneasd")
              .type("DNI")
              .documentNumber("1234567")
              .email("asd@gmail.com")
              .phone("844-231-3211").build())
          .build(),

      Address.builder()
          .idAddress("d5556669-1620-408b-8e1a-28ea3e8a4960")
          .city("Cordoba")
          .street("Buenos Aires")
          .streetNumber(768L)
          .floor(0L)
          .flat("b")
          .customer(Customer.builder().idCustomer("675a990d-6ed6-425c-8afe-6fd7a507b77a")
              .name("Felipe")
              .lastName("Contepomi")
              .type("DNI")
              .documentNumber("1234567")
              .email("asd@gmail.com")
              .phone("844-231-3211").build())
          .build()
  );

  List<Address> fakeCustomerAddresses = Arrays.asList(
      Address.builder()
          .idAddress("327fd47b-b3a2-44e5-92b0-0b29f6820fd5")
          .city("Cordoba")
          .street("Buenos Aires")
          .streetNumber(768L)
          .floor(0L)
          .flat("b")
          .customer(Customer.builder().idCustomer("675a990d-6ed6-425c-8afe-6fd7a507b77a")
              .name("Felipe")
              .lastName("Contepomi")
              .type("DNI")
              .documentNumber("1234567")
              .email("asd@gmail.com")
              .phone("844-231-3211").build())
          .build(),

      Address.builder()
          .idAddress("d5556669-1620-408b-8e1a-28ea3e8a4960")
          .city("Cordoba")
          .street("Buenos Aires")
          .streetNumber(768L)
          .floor(0L)
          .flat("b")
          .customer(Customer.builder().idCustomer("675a990d-6ed6-425c-8afe-6fd7a507b77a")
              .name("Felipe")
              .lastName("Contepomi")
              .type("DNI")
              .documentNumber("1234567")
              .email("asd@gmail.com")
              .phone("844-231-3211").build())
          .build()
  );

  String idCustomer = addressesFakeResponse.get(0).getCustomer().getIdCustomer();
  String idAddress = addressesFakeResponse.get(0).getIdAddress();
  Address address = addressesFakeResponse.get(0);

  @Test
  public void getAdressesByCustomerIdSuccess() {
    when(addressRepository.findAddressesByCustomerId(idCustomer))
        .thenReturn(addressesFakeResponse.stream()
            .filter(address -> Objects.equals(address.getCustomer().getIdCustomer(), idCustomer)).collect(Collectors.toList()));

    assertEquals(fakeCustomerAddresses, addressService.getAdressesByCustomerId(idCustomer));
  }

  @Test
  public void getAdressesByCustomerIdFailByCustomerNotExists() {
    when(addressRepository.findAddressesByCustomerId(idCustomer)).thenReturn(Collections.EMPTY_LIST);

    assertEquals(Collections.EMPTY_LIST ,addressService.getAdressesByCustomerId(idCustomer));

  }

  @Test
  public void getAddressIdByCustomerIdSuccess() {
    when(addressRepository.findAddressByCustomerIdAndAddressId(idCustomer, idAddress))
        .thenReturn(addressesFakeResponse.stream()
            .filter(address -> Objects.equals(address.getCustomer().getIdCustomer(), idCustomer) && Objects.equals(address.getIdAddress(), idAddress)).findFirst());

    assertEquals(address, addressService.getAddressIdByCustomerId(idCustomer, idAddress));
  }


  @Test
  public void getAddressIdByCustomerIdFailByCustomerNotExists(){
    when(addressRepository.findAddressByCustomerIdAndAddressId(idCustomer, idAddress))
        .thenReturn(Optional.empty());
    assertThrows(RuntimeException.class, () -> addressService.getAddressIdByCustomerId(idCustomer, idAddress));
  }
}