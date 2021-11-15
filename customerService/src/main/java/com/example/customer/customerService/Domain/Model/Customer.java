package com.example.customer.customerService.Domain.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Customer {
    private UUID idCustomer;
    private String name;
    private String lastName;
    private String type;
    private Long documentNumber;
    private String email;
    private Long phone;
    private Address address;
}
