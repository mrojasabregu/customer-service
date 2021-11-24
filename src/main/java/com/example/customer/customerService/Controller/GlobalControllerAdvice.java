package com.example.customer.customerService.Controller;


import com.example.customer.customerService.Exceptions.AddressNotExists;
import com.example.customer.customerService.Exceptions.CustomerExistsException;
import com.example.customer.customerService.Exceptions.CustomerNotExists;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;


@ResponseBody
@ControllerAdvice
public class GlobalControllerAdvice {


  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public Map<String, String> handlerValidationException(MethodArgumentNotValidException ex) {
    Map<String, String> errors = new HashMap<>();
    ex.getBindingResult().getAllErrors().forEach((error) -> {
      String fieldName = ((FieldError) error).getField();
      String errorMessage = error.getDefaultMessage();
      errors.put(fieldName, errorMessage);
    });
    return errors;
  }

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(CustomerNotExists.class)
  public Map<String, String> handlerValidationException(CustomerNotExists ex) {
    Map<String, String> errors = new HashMap<>();
    String fieldName = "Error: Customer not found";
    errors.put(fieldName, ex.getMessage());
    return errors;
  }

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(AddressNotExists.class)
  public Map<String, String> handlerValidationException(AddressNotExists ex) {
    Map<String, String> errors = new HashMap<>();
    String fieldName = "Error: Address not found";
    errors.put(fieldName, ex.getMessage());
    return errors;
  }


  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(CustomerExistsException.class)
  public Map<String, String> handlerValidationException(CustomerExistsException ex) {
    Map<String, String> errors = new HashMap<>();
    String fieldName = "Error: the given id was already taken";
    errors.put(fieldName, ex.getMessage());
    return errors;
  }

}
