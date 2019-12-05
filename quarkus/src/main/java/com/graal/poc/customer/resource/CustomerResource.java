package com.graal.poc.customer.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.graal.poc.customer.entity.CustomerEntity;
import com.graal.poc.customer.repository.CustomerRepository;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class CustomerResource {

	@Inject
	CustomerRepository customerRepository;

	@GET
	@Path("/{email}")
	public CustomerEntity customer(@PathParam("email") String email) {
		
		CustomerEntity customerEntity = customerRepository.findByEmail(email);

		return customerEntity;
	}
}