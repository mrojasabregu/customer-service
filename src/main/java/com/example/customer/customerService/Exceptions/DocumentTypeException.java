package com.example.customer.customerService.Exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DocumentTypeException extends RuntimeException {

  public DocumentTypeException(String mensaje ) {
    super (mensaje);
    log.error("Document type not valid exception");
  }
}