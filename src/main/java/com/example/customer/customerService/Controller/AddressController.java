package com.example.customer.customerService.Controller;

import com.example.customer.customerService.Controller.Response.AddressResponse;
import com.example.customer.customerService.Domain.Mapper.AddressResponseMapper;
import com.example.customer.customerService.Service.Imp.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/address")
@RestController
public class AddressController {
    @Autowired
    public AddressService addressService;

    @Autowired
    public AddressResponseMapper addressResponseMapper;


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

}
