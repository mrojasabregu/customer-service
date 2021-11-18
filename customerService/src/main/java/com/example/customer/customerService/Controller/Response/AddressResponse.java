package com.example.customer.customerService.Controller.Response;

import com.example.customer.customerService.Domain.Model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class AddressResponse extends Address {
  public String customerId;
}
