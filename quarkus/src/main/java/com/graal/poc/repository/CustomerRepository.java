package com.graal.poc.repository;

import javax.enterprise.context.ApplicationScoped;

import com.graal.poc.entity.CustomerEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
@ApplicationScoped
public class CustomerRepository implements PanacheRepository<CustomerEntity> {

	public CustomerEntity findByEmail(String email) {
		return find("email", email).firstResult();
	}
}
