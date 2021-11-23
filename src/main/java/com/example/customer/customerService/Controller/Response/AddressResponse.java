package com.example.customer.customerService.Controller.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AddressResponse{
  private String idAddress;
  private String city;
  private String street;
  private Long streetNumber;
  private Long floor;
  private String flat;
  private String idCustomer;
}
