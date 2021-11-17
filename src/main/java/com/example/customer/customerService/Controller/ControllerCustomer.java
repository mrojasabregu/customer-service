package com.example.customer.customerService.Controller;


import com.example.customer.customerService.Domain.Model.Customer;
import com.example.customer.customerService.Service.Imp.ServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")


public class ControllerCustomer {

    @Autowired
    public ServiceCustomer serviceCustomer;

    @GetMapping(path = "/")
    public List<Customer> getCustomer(@RequestParam(name="name") String name, @RequestParam(nae
            ="last_Name") String lastName, @RequestParam(name = "email") String email, @RequestParam(name = "phone") long phone){
        serviceCustomer.getCustomers(name, lastName, email, phone);
    }


}
