package com.example.customer.customerService.Controller.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerResponse {
  private String idCustomer;
  private String name;
  private String lastName;
  private String type;
  private String documentNumber;
  private String email;
  private String phone;
  private List<AddressResponse> addresses;
}
