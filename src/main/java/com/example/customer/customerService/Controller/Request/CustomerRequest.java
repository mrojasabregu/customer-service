package com.example.customer.customerService.Controller.Request;

import com.example.customer.customerService.Domain.Model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;
import java.util.List;
@Builder
@Data
public class CustomerRequest {
    public enum type {
        DNI, LC, PASSPORT;
    }
    @NotBlank(message = "The name field cannot be null nor blank")
    @Size(min = 36, max = 50)
    private String idCustomer;
    @NotBlank(message = "The name field cannot be null nor blank")
    @Size(min = 3, max = 50)
    private String name;
    @NotBlank(message = "The lastname field cannot be null nor blank")
    @Size(min = 3, max = 50)
    private String lastName;
    @Size(min=8, message = "The documentNumber field must have 8 characters")
    private String documentNumber;
    @Enumerated(EnumType.STRING)
    private String type;
    @NotEmpty
    @Email
    private String email;
    @NotBlank(message = "The phone field cannot be null nor blank")
    @Size(min = 10, max = 17)
    private String phone;

}
