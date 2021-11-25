package com.example.customer.customerService.Controller.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AddressRequest {
    @Size(min = 36, max = 50)
    private String idAddress;
    @Size(min=2, max=30)
    private String city;
    @NotEmpty
    private String street;
    @Positive(message = "The idCustomer field must be positive")
    private Long streetNumber;
    @NotNull
    private Long floor;
    @NotNull
    private String flat;
    private String idCustomer;
}