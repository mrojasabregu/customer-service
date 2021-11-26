package com.example.customer.customerService.Controller;


import com.example.customer.customerService.Controller.Response.AddressResponse;
import com.example.customer.customerService.Controller.Response.CustomerResponse;
import com.example.customer.customerService.Domain.Mapper.AddressResponseMapper;
import com.example.customer.customerService.Domain.Mapper.CustomerResponseMapper;
import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Exceptions.DocumentTypeException;
import com.example.customer.customerService.Service.Imp.AddressService;
import com.example.customer.customerService.Service.Imp.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping(path = "/")
@Slf4j
public class CustomerController {

  public enum docType {
    DNI, LC, PASAPORTE
  }
  @Autowired
  public CustomerService customerService;

  @Autowired
  public AddressService addressService;

  @Autowired
  public CustomerRequestMapper customerRequestMapper;

  @Autowired
  public AddressRequestMapper addressRequestMapper;

  @Autowired
  public AddressResponseMapper addressResponseMapper;

  @Autowired
  public CustomerResponseMapper customerResponseMapper;

  @GetMapping("/customer")
  public CustomerResponse getCustomerByDocument(@RequestParam(name = "doc_type") String documentType, @RequestParam(name = "doc_numb")String documentNumber) {
    log.info("Customer requested with documentType: " + documentType + " and documentNumber: " + documentNumber);
    if(Arrays.stream(docType.values()).filter(d -> d.name().equals(documentType)).count() == 0){
      throw new DocumentTypeException("Document type not valid");
    }
    return customerResponseMapper.apply(customerService.findByDocTypeAndDocNumber(documentNumber, documentType));
  }

  @GetMapping("/customers")
  public List<CustomerResponse> getCustomers(@RequestParam(name = "name", required = false) String name,
                                             @RequestParam(name = "last_name", required = false) String lastName,
                                             @RequestParam(name = "email", required = false) String email,
                                             @RequestParam(name = "phone", required = false) String phone) {
    log.info("Customers by query params");
    return customerService.getCustomers(name, lastName, email, phone).stream().map(c -> customerResponseMapper.apply(c)).collect(Collectors.toList());
  }

  @GetMapping("/customer/{idCustomer}/addresses")
  public List<AddressResponse> getCustomerAddresses(@PathVariable(name = "idCustomer") String idCustomer) {
    log.info("Customer Addresses requested with idCustomer: " + idCustomer);
    return addressService.getAdressesByCustomerId(idCustomer).stream().map(address -> addressResponseMapper.apply(address)).collect(Collectors.toList());
  }


  @DeleteMapping(path = "/customer/{idCustomer}")
  public void deleteCustomer(@PathVariable(name = "idCustomer") String idCustomer){
    log.info("Customer deleted with idCustomer: " + idCustomer);
    customerService.deleteCustomer(idCustomer);
  }

  @PostMapping(path = "/customer")
  public CustomerResponse createCustomer(@RequestBody @Validated CustomerRequest customerRequest) {
    log.info("Customer create request");
    Customer customer = customerRequestMapper.apply(customerRequest);
    Customer newCustomer = customerService.createCustomer(customer);
    List<AddressRequest> addressesRequest = customerRequest.getAddresses();
    addressesRequest.stream().forEach(request -> request.setIdCustomer(customer.getIdCustomer()));
    addressService.createAddresses(addressesRequest.stream().map(addressRequestMapper::apply).collect(Collectors.toList()));
    return customerResponseMapper.apply(newCustomer);
  }

  @PutMapping(path = "/customer/{idCustomer}")
  public CustomerResponse updateCustomer(@PathVariable(name = "idCustomer") String idCustomer, @RequestBody CustomerRequest request) {
    Customer customer = customerRequestMapper.apply(request);
    log.info("Customer updated with idCustomer:" + idCustomer);
    return customerResponseMapper.apply(customerService.updateCustomer(customer, idCustomer));
  }

  @GetMapping(path = "/customer/{idCustomer}")
  public Customer getCustomerbyid(@PathVariable(name = "idCustomer") String idCustomer){
    return customerService.getCustomerById(idCustomer);
  }
}