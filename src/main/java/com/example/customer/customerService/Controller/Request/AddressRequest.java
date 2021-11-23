package com.example.customer.customerService.Controller.Request;

import lombok.Builder;
import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
@Builder
@Data
public class AddressRequest {
    @Positive(message = "The idCustomer field must be positive")
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
    @Positive(message = "The idCustomer field must be positive")
    private String idCustomer;
}
