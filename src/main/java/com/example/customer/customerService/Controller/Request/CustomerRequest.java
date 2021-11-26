package com.example.customer.customerService.Controller.Request;

import com.example.customer.customerService.Constraints.ValidateDocEnum;
import lombok.Builder;
import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
@Builder
@Data
public class CustomerRequest {
  private String idCustomer;
  @NotBlank(message = "The name field cannot be null nor blank")
  @Size(min = 3, max = 50)
  private String name;
  @NotBlank(message = "The lastname field cannot be null nor blank")
  @Size(min = 3, max = 50)
  private String lastName;
  @Size(min = 8, message = "The documentNumber field must have 8 characters")
  private String documentNumber;
  @ValidateDocEnum(targetClassType = docType.class, message = "The documentType field must be DNI, PASSPORT or LC")
  private String type;
  @NotEmpty
  @Email
  private String email;
  @NotBlank(message = "The phone field cannot be null nor blank")
  @Size(min = 10, max = 17)
  private String phone;
  private List<AddressRequest> addresses;

  public enum docType {
    DNI, LC, PASAPORTE
  }
}