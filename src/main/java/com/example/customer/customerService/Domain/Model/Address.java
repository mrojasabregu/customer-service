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
public class Address {
    private UUID idAddress;
    private String city;
    private String street;
    private Long streetNumber;
    private Long floor;
    private String flat;
}
