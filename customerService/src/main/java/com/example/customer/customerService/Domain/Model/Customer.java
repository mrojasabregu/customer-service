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
@Table(name = "customer")
public class Customer {

  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  @Column(name = "id_customer")
  private String idCustomer;
  @Column(name = "name")
  private String name;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "document_type")
  private String type;
  @Column(name = "document_number")
  private Long documentNumber;
  @Column(name = "email")
  private String email;
  @Column(name = "phone")
  private String phone;
}
