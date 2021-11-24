package com.example.customer.customerService.Exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerExistsException extends RuntimeException {
  public CustomerExistsException(String mensaje) {
    super(mensaje);
    log.error("Address not exist exceptions");
  }
}
