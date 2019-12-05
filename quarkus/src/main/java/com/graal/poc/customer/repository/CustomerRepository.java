package com.graal.poc.customer.repository;

import javax.enterprise.context.ApplicationScoped;

import com.graal.poc.customer.entity.CustomerEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
@ApplicationScoped
public class CustomerRepository implements PanacheRepository<CustomerEntity> {

	public CustomerEntity findByEmail(String email) {
		return find("email", email).firstResult();
	}
}
