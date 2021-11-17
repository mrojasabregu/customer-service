package com.example.customer.customerService.Domain.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data


@Entity
public class Address {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")

    private String idAddress;
    private String city;
    private String street;
    private Long streetNumber;
    private Long floor;
    private String flat;
    @ManyToOne
    private Customer customer;
}
