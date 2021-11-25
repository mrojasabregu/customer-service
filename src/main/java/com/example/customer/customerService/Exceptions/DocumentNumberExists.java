package com.example.customer.customerService.Exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DocumentNumberExists extends RuntimeException {

  public DocumentNumberExists(String mensaje ) {
    super (mensaje);
    log.error("Customer not exist exceptions");
  }
}