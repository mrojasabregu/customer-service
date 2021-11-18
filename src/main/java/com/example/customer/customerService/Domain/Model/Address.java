package com.example.customer.customerService.Domain.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "address")
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
