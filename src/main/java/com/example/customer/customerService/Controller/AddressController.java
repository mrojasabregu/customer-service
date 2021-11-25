package com.example.customer.customerService.Controller;

import com.example.customer.customerService.Controller.Request.AddressRequest;
import com.example.customer.customerService.Controller.Response.AddressResponse;
import com.example.customer.customerService.Domain.Mapper.AddressRequestMapper;
import com.example.customer.customerService.Domain.Mapper.AddressResponseMapper;
import com.example.customer.customerService.Domain.Model.Address;
import com.example.customer.customerService.Service.Imp.AddressService;
import com.example.customer.customerService.Service.Imp.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/address")
@RestController
public class AddressController {
    @Autowired
    public AddressService addressService;

    @Autowired
    public AddressResponseMapper addressResponseMapper;

    @Autowired
    public AddressRequestMapper addressRequestMapper;

    @Autowired
    public CustomerService customerService;

    @GetMapping("/{idAddress}")
    public AddressResponse getIdAddressByCustomerId(@PathVariable(name = "idAddress") String idAddress) {
        log.info("Customer Addresses requested with idAddress: " + idAddress);
        return addressResponseMapper.apply(addressService.getAddressIdByCustomerId(idAddress));
    }

    @DeleteMapping("/{idAddress}")
    public void deleteAddressById(@PathVariable(name = "idAddress") String idAddress) {
        log.info("Address deleted with idAddress: " + idAddress);
        addressService.deleteAddressById(idAddress);
    }

    @PostMapping
    public AddressResponse createAddress(@RequestBody @Validated AddressRequest addressRequest) {
        log.info("Address create requested with idAddress: " + addressRequest.getIdAddress());
        customerService.getCustomerById(addressRequest.getIdCustomer());
        return addressResponseMapper.apply(addressService.createAddress(addressRequestMapper.apply(addressRequest)));
    }


    @PutMapping(path = "/{idAddress}")
    public AddressResponse updateAddress(@PathVariable(name = "idAddress") String idAddress, @RequestBody AddressRequest request){
        Address address= addressRequestMapper.apply(request);
        log.info("Address updated with idAddress: + idAddress");
        return  addressResponseMapper.apply(addressService.updateAddress(address,idAddress));

    }

}
