package com.example.customer.customerService.Repository;


import com.example.customer.customerService.Domain.Model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDao {

  EntityManager em;


  public List<Customer> findByParams(String name, String lastName, String email, String phone) {

    /*obtenemos una referencia de CriteriaBuilder , que podemos usar para crear diferentes partes de la consulta.*/
    CriteriaBuilder cb = em.getCriteriaBuilder();

    /*CriteriaQuery <Customer> , que describe lo que queremos hacer en la consulta.*/
    CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);

    /*CriteriaQuery <Book> declaramos el punto de inicio de la consulta ( entidad Customer ), y lo almacenamos en la variable customer para su uso posterior*/
    Root<Customer> customer = cq.from(Customer.class);
    List<Predicate> predicates = new ArrayList<>();

    if (name != null) {
      predicates.add(cb.equal(customer.get("name"), name));
    }

    if (name != null) {

      predicates.add(cb.equal(customer.get("last_name"), lastName));
    }

    if (name != null) {

      predicates.add(cb.equal(customer.get("email"), email));
    }

    if (name != null) {

      predicates.add(cb.equal(customer.get("phone"), phone));
    }

    cq.where(predicates.toArray(new Predicate[0]));

    return em.createQuery(cq).getResultList();

  }
}

