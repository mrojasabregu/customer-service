
package com.example.customer.customerService.Domain.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "address")
public class Address {

  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  @Column(name = "id_address")
  protected String idAddress;
  @Column(name = "city")
  protected String city;
  @Column(name = "street")
  protected String street;
  @Column(name = "street_number")
  protected Long streetNumber;
  @Column(name = "floor_number")
  protected Long floorNumber;
  @Column(name = "flat")
  protected String flat;
  @ManyToOne
  @JoinColumn(name = "idCustomer")
  protected Customer customer;
}