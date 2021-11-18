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
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(name = "id_address")
  private String idAddress;
  private String city;
  private String street;
  private Long streetNumber;
  @Column(name = "floor_number")
  private Long floor;
  private String flat;
  @ManyToOne
  @JoinColumn(name = "id_customer")
  private Customer customer;
}
