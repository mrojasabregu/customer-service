package com.example.customer.customerService.Controller.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AddressRequest {
  private String idAddress;
  @Size(min = 2, max = 30)
  private String city;
  @NotEmpty(message = "The Street filed cannot be empty")
  private String street;
  @Positive(message = "The idCustomer field must be positive")
  private Long streetNumber;
  @NotNull(message = "The floor field must not be null")
  private Long floor;
  @NotNull(message = "The flat field must not be null")
  private String flat;
  @NotBlank(message = "The idCustomer field cannot be blank nor null")
  private String idCustomer;
}
